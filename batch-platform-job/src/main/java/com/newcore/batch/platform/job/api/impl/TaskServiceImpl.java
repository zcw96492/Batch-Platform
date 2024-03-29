package com.newcore.batch.platform.job.api.impl;

import com.newcore.batch.platform.job.api.TaskService;
import com.newcore.batch.platform.model.TaskBaseModel;
import com.newcore.batch.platform.model.po.BatchExecHistory;
import com.newcore.batch.platform.model.request.TaskQueryRequest;
import com.newcore.batch.platform.model.response.TaskQueryResponse;
import com.newcore.batch.platform.persistence.BatchExecHistoryMapper;
import com.newcore.batch.platform.persistence.BatchTaskMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * 任务服务接口实现类
 * @author zhouchaowei
 * @date 2023-08-10
 */
@Service("taskService")
@MapperScan(basePackages = "com.newcore.batch.platform.persistence")
public class TaskServiceImpl implements TaskService {

    private static final Logger logger = LoggerFactory.getLogger(TaskServiceImpl.class);

    @Autowired
    private BatchTaskMapper batchTaskMapper;

    @Autowired
    private BatchExecHistoryMapper batchExecHistoryMapper;

    /**
     * 查询任务方法
     * @param taskQueryRequest 任务查询请求模型
     * @return 任务列表
     */
    @Override
    public List<TaskQueryResponse> queryTask(TaskQueryRequest taskQueryRequest) {
        return null;
    }

    /**
     * 记录任务执行
     * @param taskBaseModel 任务平台基本模型
     */
    @Override
    public void recordTaskExecute(TaskBaseModel taskBaseModel) {
        BatchExecHistory batchExecHistory = new BatchExecHistory();
        batchExecHistory.setBatchTaskId(Long.parseLong("1"));
        batchExecHistory.setTaskExecuteStartTime(null);
        batchExecHistory.setTaskExecuteEndTime(null);
        batchExecHistory.setTaskExecuteDurationUnit("S");
        batchExecHistory.setTaskExecuteDuration(null);
        batchExecHistory.setCreateTime(new Date());
        batchExecHistoryMapper.insert(batchExecHistory);
    }
}
