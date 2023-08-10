package com.newcore.batch.platform.job.listener;

import com.newcore.batch.platform.job.quartz.QuartzManager;
import com.newcore.batch.platform.model.TaskBaseModel;
import com.newcore.batch.platform.model.po.BatchTask;
import com.newcore.batch.platform.model.po.BatchTaskExample;
import com.newcore.batch.platform.persistence.BatchTaskMapper;
import com.newcore.batch.platform.utils.enumclass.BusinessExceptionCodeEnum;
import com.newcore.batch.platform.utils.enumclass.TASK_STATUS;
import com.newcore.batch.platform.utils.exception.BusinessException;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.Date;
import java.util.List;

/**
 * 定时任务监听器(此处添加服务进行任务初始化)
 * @author zhouchaowei
 * @date 2022-07-09
 */
@Component
@Order(value = 1)
@MapperScan(basePackages = "com.newcore.batch.platform.persistence")
public class ScheduleJobListener implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(ScheduleJobListener.class);

    private static final String JON_GROUP = "batch-platform-default-job";

    @Autowired
    private BatchTaskMapper batchTaskMapper;

    @Autowired
    private QuartzManager quartzManager;

    /**
     * 任务执行方法
     * @param arg0 执行参数
     */
    @Override
    public void run(String... arg0){
        try {
            BatchTaskExample batchTaskExample = new BatchTaskExample();
            batchTaskExample.createCriteria().andJobGroupEqualTo(JON_GROUP);
            List<BatchTask> batchTaskList = batchTaskMapper.selectByExample(batchTaskExample);
            if(!CollectionUtils.isEmpty(batchTaskList)){
                for (BatchTask batchTask : batchTaskList){
                    TaskBaseModel taskBaseModel = new TaskBaseModel();
                    taskBaseModel.setTaskId(batchTask.getBatchTaskId());
                    taskBaseModel.setTaskName(batchTask.getTaskName());
                    taskBaseModel.setTaskDescription(batchTask.getTaskDescription());
                    taskBaseModel.setCronExpression(batchTask.getTaskCronExpression());
                    taskBaseModel.setBeanClass(batchTask.getBeanClassPath());
                    taskBaseModel.setTaskStatus(batchTask.getJobStatus() == null
                            ? ""
                            : TASK_STATUS.valueOfKey(batchTask.getJobStatus()).getDescription()
                    );
                    taskBaseModel.setTaskGroup(JON_GROUP);
                    taskBaseModel.setTaskCreateUser(batchTask.getCreateUser());
                    taskBaseModel.setTaskUpdateUser(batchTask.getUpdateUser());
                    taskBaseModel.setCreateTime(new Date());
                    taskBaseModel.setUpdateTime(new Date());
                    quartzManager.addTask(taskBaseModel);
                }
            }
        } catch (Exception e) {
            logger.error("定时任务初始化失败!",e);
            throw new BusinessException(BusinessExceptionCodeEnum.B0001.getCode(),BusinessExceptionCodeEnum.B0001.getMessage());
        }
    }
}