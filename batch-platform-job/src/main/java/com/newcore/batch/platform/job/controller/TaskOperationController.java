package com.newcore.batch.platform.job.controller;

import com.newcore.batch.platform.job.api.TaskService;
import com.newcore.batch.platform.model.request.TaskQueryRequest;
import com.newcore.batch.platform.model.response.TaskQueryResponse;
import com.newcore.batch.platform.utils.RestServerResponse;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 任务操作控制器
 * @author zhouchaowei
 * @date 2022-07-13
 */
@Controller
@RequestMapping("/taskOperation")
public class TaskOperationController {

    private static final Logger logger = LoggerFactory.getLogger(TaskOperationController.class);

    @Value("${spring.application.name}")
    private String serviceName;

    @Autowired
    private TaskService taskService;

    /**
     * 查询任务方法
     * @param taskQueryRequest 任务查询请求模型
     * @return 任务列表
     */
    @ApiOperation(httpMethod = "POST",value = "queryTask", notes = "批处理平台-查询任务方法", response = List.class)
    @PostMapping("/query")
    public RestServerResponse<List<TaskQueryResponse>> queryTask(@RequestBody TaskQueryRequest taskQueryRequest){
        return RestServerResponse.createBySuccessData(taskService.queryTask(taskQueryRequest),serviceName);
    }
}
