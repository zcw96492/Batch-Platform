package com.newcore.batch.platform.job.task;

import com.newcore.batch.platform.job.api.DataExportTaskService;
import com.newcore.batch.platform.job.api.TaskService;
import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 数据导出批作业
 * @author zhouchaowei
 */
@DisallowConcurrentExecution
@Component
public class DataExportTask implements Job {

    private static final Logger logger = LoggerFactory.getLogger(DataExportTask.class);

    @Autowired
    private TaskService taskService;

    @Autowired
    private DataExportTaskService dataExportTaskService;

    /**
     * 任务执行核心方法
     * @param jobExecutionContext 任务执行上下文
     * @throws JobExecutionException 任务执行执行
     */
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        int count = 0;
        count = count + 1;
        logger.info("数据导出批作业 || 执行......{}",count);
    }
}
