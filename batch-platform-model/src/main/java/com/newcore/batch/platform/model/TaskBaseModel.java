package com.newcore.batch.platform.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * 任务平台基本模型
 * @author zhouchaowei
 * @date 2022-07-09
 */
@ApiModel(value = "TaskBaseModel", description = "任务平台基本模型")
@Data
public class TaskBaseModel {

    @ApiModelProperty(value = "任务ID", name = "taskId", dataType = "Long", required = true)
    private Long taskId;

    @ApiModelProperty(value = "任务名", name = "taskName", dataType = "String", required = true)
    private String taskName;

    @ApiModelProperty(value = "任务描述", name = "description", dataType = "String", required = true)
    private String taskDescription;

    @ApiModelProperty(value = "CRON表达式", name = "cronExpression", dataType = "String", required = true)
    private String cronExpression;

    @ApiModelProperty(value = "任务执行时调用哪个类的方法(包名 + 类名)", name = "beanClass", dataType = "String", required = true)
    private String beanClass;

    @ApiModelProperty(value = "任务状态", name = "taskStatus", dataType = "String", required = true)
    private String taskStatus;

    @ApiModelProperty(value = "任务分组", name = "taskGroup", dataType = "String", required = true)
    private String taskGroup;

    @ApiModelProperty(value = "任务创建人", name = "taskCreateUser", dataType = "String", required = true)
    private String taskCreateUser;

    @ApiModelProperty(value = "任务更新人", name = "taskUpdateUser", dataType = "String", required = true)
    private String taskUpdateUser;

    @ApiModelProperty(value = "创建时间", name = "createTime", dataType = "Date", required = true)
    private Date createTime;

    @ApiModelProperty(value = "更新时间", name = "updateTime", dataType = "Date", required = true)
    private Date updateTime;
}
