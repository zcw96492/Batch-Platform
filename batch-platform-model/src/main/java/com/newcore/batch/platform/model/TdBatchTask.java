package com.newcore.batch.platform.model;

import java.io.Serializable;
import java.util.Date;

/**
 * td_batch_task
 *
 * @date 2022-07-12 23:52:08
 */
public class TdBatchTask implements Serializable {
    /**
     * 批作业任务ID
     */
    private Long batchTaskId;

    /**
     * 批作业任务名称
     */
    private String taskName;

    /**
     * 批作业任务描述
     */
    private String taskDescription;

    /**
     * CRON定时器表达式
     */
    private String taskCronExpression;

    /**
     * 任务执行时调用哪个类的方法(包名 + 类名)
     */
    private String beanClassPath;

    /**
     * 任务状态(0-未启动，1-正常运行，2-停用下线)
     */
    private Integer jobStatus;

    /**
     * 任务分组
     */
    private String jobGroup;

    /**
     * 批作业任务创建者
     */
    private String createUser;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 批作业任务更新者
     */
    private String updateUser;

    /**
     * 更新时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    /**
     * 获取批作业任务ID
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Long getBatchTaskId() {
        return batchTaskId;
    }

    /**
     * 设置批作业任务ID
     * @param batchTaskId 批作业任务ID
     *
     * @date 2022-07-12 23:52:08
     */
    public void setBatchTaskId(Long batchTaskId) {
        this.batchTaskId = batchTaskId;
    }

    /**
     * 获取批作业任务名称
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getTaskName() {
        return taskName;
    }

    /**
     * 设置批作业任务名称
     * @param taskName 批作业任务名称
     *
     * @date 2022-07-12 23:52:08
     */
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    /**
     * 获取批作业任务描述
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getTaskDescription() {
        return taskDescription;
    }

    /**
     * 设置批作业任务描述
     * @param taskDescription 批作业任务描述
     *
     * @date 2022-07-12 23:52:08
     */
    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    /**
     * 获取CRON定时器表达式
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getTaskCronExpression() {
        return taskCronExpression;
    }

    /**
     * 设置CRON定时器表达式
     * @param taskCronExpression CRON定时器表达式
     *
     * @date 2022-07-12 23:52:08
     */
    public void setTaskCronExpression(String taskCronExpression) {
        this.taskCronExpression = taskCronExpression;
    }

    /**
     * 获取任务执行时调用哪个类的方法(包名 + 类名)
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getBeanClassPath() {
        return beanClassPath;
    }

    /**
     * 设置任务执行时调用哪个类的方法(包名 + 类名)
     * @param beanClassPath 任务执行时调用哪个类的方法(包名 + 类名)
     *
     * @date 2022-07-12 23:52:08
     */
    public void setBeanClassPath(String beanClassPath) {
        this.beanClassPath = beanClassPath;
    }

    /**
     * 获取任务状态(0-未启动，1-正常运行，2-停用下线)
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getJobStatus() {
        return jobStatus;
    }

    /**
     * 设置任务状态(0-未启动，1-正常运行，2-停用下线)
     * @param jobStatus 任务状态(0-未启动，1-正常运行，2-停用下线)
     *
     * @date 2022-07-12 23:52:08
     */
    public void setJobStatus(Integer jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * 获取任务分组
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getJobGroup() {
        return jobGroup;
    }

    /**
     * 设置任务分组
     * @param jobGroup 任务分组
     *
     * @date 2022-07-12 23:52:08
     */
    public void setJobGroup(String jobGroup) {
        this.jobGroup = jobGroup;
    }

    /**
     * 获取批作业任务创建者
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * 设置批作业任务创建者
     * @param createUser 批作业任务创建者
     *
     * @date 2022-07-12 23:52:08
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    /**
     * 获取创建时间
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     * @param createTime 创建时间
     *
     * @date 2022-07-12 23:52:08
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取批作业任务更新者
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * 设置批作业任务更新者
     * @param updateUser 批作业任务更新者
     *
     * @date 2022-07-12 23:52:08
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    /**
     * 获取更新时间
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     * @param updateTime 更新时间
     *
     * @date 2022-07-12 23:52:08
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}