package com.newcore.batch.platform.job.task;

import com.newcore.batch.platform.job.api.DataExportTaskService;
import com.newcore.batch.platform.job.api.TaskService;
import com.newcore.batch.platform.model.TaskBaseModel;
import com.newcore.batch.platform.model.request.ExportRequest;
import com.newcore.batch.platform.model.response.ExportResponse;
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
        logger.info("数据导出批作业 || 当前任务执行时间:{}", DateUtils.getFormatDateString(jobExecutionContext.getFireTime(),null));
        TaskBaseModel taskBaseModel = new TaskBaseModel();
        taskService.recordTaskExecute(taskBaseModel);

        ExportRequest exportRequest = new ExportRequest();
        exportRequest.setTaskName(null);
        ExportResponse exportResponse = dataExportTaskService.export(exportRequest);
    }
}
