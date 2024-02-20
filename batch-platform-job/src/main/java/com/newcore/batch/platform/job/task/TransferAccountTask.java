package com.newcore.batch.platform.job.task;

import com.newcore.batch.platform.job.api.TaskService;
import com.newcore.batch.platform.job.api.TransferAccountService;
import com.newcore.batch.platform.model.TaskBaseModel;
import com.newcore.batch.platform.utils.DateUtils;
import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 定时转账批作业
 * @author zhouchaowei
 */
@DisallowConcurrentExecution
@Component
public class TransferAccountTask implements Job {

    private static final Logger logger = LoggerFactory.getLogger(TransferAccountTask.class);

    @Autowired
    private TaskService taskService;

    @Autowired
    private TransferAccountService transferAccountService;

    /**
     * 任务执行核心方法
     * @param jobExecutionContext 任务执行上下文
     * @throws JobExecutionException 任务执行执行
     */
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        logger.info("定时转账批作业 || 当前任务执行时间:{}", DateUtils.getFormatDateString(jobExecutionContext.getFireTime(),null));
        TaskBaseModel taskBaseModel = new TaskBaseModel();
        taskService.recordTaskExecute(taskBaseModel);
    }
}
