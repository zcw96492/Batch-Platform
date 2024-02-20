package com.newcore.batch.platform.job.quartz;

import com.newcore.batch.platform.model.TaskBaseModel;
import com.newcore.batch.platform.utils.exception.BusinessException;
import org.quartz.*;
import org.quartz.DateBuilder.IntervalUnit;
import org.quartz.impl.matchers.GroupMatcher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * 计划任务管理
 * @author zhouchaowei
 * @date 2022-07-09
 */
@Service
public class QuartzManager {

    private static final Logger logger = LoggerFactory.getLogger(QuartzManager.class);

    @Autowired
    private Scheduler scheduler;

    /**
     * 添加定时任务
     * @param taskBaseModel 任务平台基本模型
     */    
    @SuppressWarnings("unchecked")
    public void addTask(TaskBaseModel taskBaseModel) {
        try {
            /* 1.创建jobDetail实例,绑定Job实现类 */
            Class<? extends Job> jobClass = (Class<? extends Job>) (Class.forName(taskBaseModel.getBeanClass()).newInstance().getClass());
            /* 2.指明job的名称,所在组的名称,以及绑定job类 */
            JobDetail jobDetail = JobBuilder.newJob(jobClass).withIdentity(taskBaseModel.getTaskName(), taskBaseModel.getTaskGroup()).build();
            /* 3.定义调度触发规则,使用cornTrigger */
            Trigger trigger = TriggerBuilder.newTrigger()
                    .withIdentity(taskBaseModel.getTaskName(), taskBaseModel.getTaskGroup())
                    .startAt(DateBuilder.futureDate(1, IntervalUnit.SECOND))
                    .withSchedule(CronScheduleBuilder.cronSchedule(taskBaseModel.getCronExpression()))
                    .startNow()
                    .build();
            /* 4.把作业和触发器注册到任务调度中 */
            scheduler.scheduleJob(jobDetail, trigger);
            /* 5.启动定时任务 */
            if (!scheduler.isShutdown()) {
                scheduler.start();
            }
        } catch (Exception e) {
            logger.error("");
            throw new BusinessException("","");
        }
    }

    /**
     * 获取所有计划中的任务列表
     * @return 任务列表
     */
    public List<TaskBaseModel> obtainAllTasks() throws SchedulerException {
        GroupMatcher<JobKey> matcher = GroupMatcher.anyJobGroup();
        Set<JobKey> jobKeySet = scheduler.getJobKeys(matcher);
        List<TaskBaseModel> taskBaseModelList = new ArrayList<>();
        for (JobKey jobKey : jobKeySet) {
            List<? extends Trigger> triggers = scheduler.getTriggersOfJob(jobKey);
            for (Trigger trigger : triggers) {
                TaskBaseModel taskBaseModel = new TaskBaseModel();
                taskBaseModel.setTaskName(jobKey.getName());
                taskBaseModel.setTaskGroup(jobKey.getGroup());
                taskBaseModel.setTaskDescription("触发器:" + trigger.getKey());
                Trigger.TriggerState triggerState = scheduler.getTriggerState(trigger.getKey());
                taskBaseModel.setTaskStatus(triggerState.name());
                if (trigger instanceof CronTrigger) {
                    CronTrigger cronTrigger = (CronTrigger) trigger;
                    String cronExpression = cronTrigger.getCronExpression();
                    taskBaseModel.setCronExpression(cronExpression);
                }
                taskBaseModelList.add(taskBaseModel);
            }
        }
        return taskBaseModelList;
    }

    /**
     * 所有正在运行的任务
     * @return 任务列表
     */
    public List<TaskBaseModel> obtainAllRunningTask() throws SchedulerException {
        List<JobExecutionContext> runningTaskList = scheduler.getCurrentlyExecutingJobs();
        List<TaskBaseModel> taskBaseModelList = new ArrayList<>(runningTaskList.size());
        for (JobExecutionContext runningJob : runningTaskList) {
            TaskBaseModel taskBaseModel = new TaskBaseModel();

            JobKey jobKey = runningJob.getJobDetail().getKey();
            taskBaseModel.setTaskName(jobKey.getName());
            taskBaseModel.setTaskGroup(jobKey.getGroup());

            Trigger trigger = runningJob.getTrigger();
            taskBaseModel.setTaskDescription("触发器:" + trigger.getKey());
            Trigger.TriggerState triggerState = scheduler.getTriggerState(trigger.getKey());
            taskBaseModel.setTaskStatus(triggerState.name());
            if (trigger instanceof CronTrigger) {
                CronTrigger cronTrigger = (CronTrigger) trigger;
                String cronExpression = cronTrigger.getCronExpression();
                taskBaseModel.setCronExpression(cronExpression);
            }
            taskBaseModelList.add(taskBaseModel);
        }
        return taskBaseModelList;
    }

    /**
     * 暂停一个任务
     * @param taskBaseModel 任务平台基本模型
     */
    public void pauseTask(TaskBaseModel taskBaseModel) throws SchedulerException {
        JobKey jobKey = JobKey.jobKey(taskBaseModel.getTaskName(), taskBaseModel.getTaskGroup());
        scheduler.pauseJob(jobKey);
    }

    /**
     * 恢复一个任务
     * @param taskBaseModel 任务平台基本模型
     */
    public void recoverTask(TaskBaseModel taskBaseModel) throws SchedulerException {
        JobKey jobKey = JobKey.jobKey(taskBaseModel.getTaskName(), taskBaseModel.getTaskGroup());
        scheduler.resumeJob(jobKey);
    }

    /**
     * 删除任务
     * @param taskBaseModel 任务平台基本模型
     */
    public void deleteJob(TaskBaseModel taskBaseModel) throws SchedulerException {
        JobKey jobKey = JobKey.jobKey(taskBaseModel.getTaskName(), taskBaseModel.getTaskGroup());
        scheduler.deleteJob(jobKey);
    }

    /**
     * 立即执行任务
     * @param taskBaseModel 任务平台基本模型
     */
    public void runTaskNow(TaskBaseModel taskBaseModel) throws SchedulerException {
        JobKey jobKey = JobKey.jobKey(taskBaseModel.getTaskName(), taskBaseModel.getTaskGroup());
        scheduler.triggerJob(jobKey);
    }

    /**
     * 更新任务时间表达式
     * @param taskBaseModel 任务平台基本模型
     */
    public void updateTaskCron(TaskBaseModel taskBaseModel) throws SchedulerException {
        TriggerKey triggerKey = TriggerKey.triggerKey(taskBaseModel.getTaskName(), taskBaseModel.getTaskGroup());
        CronTrigger trigger = (CronTrigger) scheduler.getTrigger(triggerKey);
        CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule(taskBaseModel.getCronExpression());
        trigger = trigger.getTriggerBuilder().withIdentity(triggerKey).withSchedule(scheduleBuilder).build();
        scheduler.rescheduleJob(triggerKey, trigger);
    }
}