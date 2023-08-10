package com.newcore.batch.platform.job.api;

import com.newcore.batch.platform.model.request.TaskQueryRequest;
import com.newcore.batch.platform.model.response.TaskQueryResponse;

import java.util.List;

/**
 * 任务服务接口
 * @author zhouchaowei
 * @date 2023-08-10
 */
public interface TaskService {

    /**
     * 查询任务方法
     * @param taskQueryRequest 任务查询请求模型
     * @return 任务列表
     */
    List<TaskQueryResponse> queryTask(TaskQueryRequest taskQueryRequest);
}
