package com.newcore.batch.platform.model.po;

import java.io.Serializable;
import java.util.Date;

public class BatchTask implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column batch_task.batch_task_id
     *
     * @mbggenerated Thu Aug 10 11:10:46 CST 2023
     */
    private Long batchTaskId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column batch_task.task_name
     *
     * @mbggenerated Thu Aug 10 11:10:46 CST 2023
     */
    private String taskName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column batch_task.task_description
     *
     * @mbggenerated Thu Aug 10 11:10:46 CST 2023
     */
    private String taskDescription;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column batch_task.task_cron_expression
     *
     * @mbggenerated Thu Aug 10 11:10:46 CST 2023
     */
    private String taskCronExpression;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column batch_task.bean_class_path
     *
     * @mbggenerated Thu Aug 10 11:10:46 CST 2023
     */
    private String beanClassPath;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column batch_task.job_status
     *
     * @mbggenerated Thu Aug 10 11:10:46 CST 2023
     */
    private Integer jobStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column batch_task.job_group
     *
     * @mbggenerated Thu Aug 10 11:10:46 CST 2023
     */
    private String jobGroup;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column batch_task.create_user
     *
     * @mbggenerated Thu Aug 10 11:10:46 CST 2023
     */
    private String createUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column batch_task.create_time
     *
     * @mbggenerated Thu Aug 10 11:10:46 CST 2023
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column batch_task.update_user
     *
     * @mbggenerated Thu Aug 10 11:10:46 CST 2023
     */
    private String updateUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column batch_task.update_time
     *
     * @mbggenerated Thu Aug 10 11:10:46 CST 2023
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table batch_task
     *
     * @mbggenerated Thu Aug 10 11:10:46 CST 2023
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column batch_task.batch_task_id
     *
     * @return the value of batch_task.batch_task_id
     *
     * @mbggenerated Thu Aug 10 11:10:46 CST 2023
     */
    public Long getBatchTaskId() {
        return batchTaskId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column batch_task.batch_task_id
     *
     * @param batchTaskId the value for batch_task.batch_task_id
     *
     * @mbggenerated Thu Aug 10 11:10:46 CST 2023
     */
    public void setBatchTaskId(Long batchTaskId) {
        this.batchTaskId = batchTaskId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column batch_task.task_name
     *
     * @return the value of batch_task.task_name
     *
     * @mbggenerated Thu Aug 10 11:10:46 CST 2023
     */
    public String getTaskName() {
        return taskName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column batch_task.task_name
     *
     * @param taskName the value for batch_task.task_name
     *
     * @mbggenerated Thu Aug 10 11:10:46 CST 2023
     */
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column batch_task.task_description
     *
     * @return the value of batch_task.task_description
     *
     * @mbggenerated Thu Aug 10 11:10:46 CST 2023
     */
    public String getTaskDescription() {
        return taskDescription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column batch_task.task_description
     *
     * @param taskDescription the value for batch_task.task_description
     *
     * @mbggenerated Thu Aug 10 11:10:46 CST 2023
     */
    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column batch_task.task_cron_expression
     *
     * @return the value of batch_task.task_cron_expression
     *
     * @mbggenerated Thu Aug 10 11:10:46 CST 2023
     */
    public String getTaskCronExpression() {
        return taskCronExpression;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column batch_task.task_cron_expression
     *
     * @param taskCronExpression the value for batch_task.task_cron_expression
     *
     * @mbggenerated Thu Aug 10 11:10:46 CST 2023
     */
    public void setTaskCronExpression(String taskCronExpression) {
        this.taskCronExpression = taskCronExpression;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column batch_task.bean_class_path
     *
     * @return the value of batch_task.bean_class_path
     *
     * @mbggenerated Thu Aug 10 11:10:46 CST 2023
     */
    public String getBeanClassPath() {
        return beanClassPath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column batch_task.bean_class_path
     *
     * @param beanClassPath the value for batch_task.bean_class_path
     *
     * @mbggenerated Thu Aug 10 11:10:46 CST 2023
     */
    public void setBeanClassPath(String beanClassPath) {
        this.beanClassPath = beanClassPath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column batch_task.job_status
     *
     * @return the value of batch_task.job_status
     *
     * @mbggenerated Thu Aug 10 11:10:46 CST 2023
     */
    public Integer getJobStatus() {
        return jobStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column batch_task.job_status
     *
     * @param jobStatus the value for batch_task.job_status
     *
     * @mbggenerated Thu Aug 10 11:10:46 CST 2023
     */
    public void setJobStatus(Integer jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column batch_task.job_group
     *
     * @return the value of batch_task.job_group
     *
     * @mbggenerated Thu Aug 10 11:10:46 CST 2023
     */
    public String getJobGroup() {
        return jobGroup;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column batch_task.job_group
     *
     * @param jobGroup the value for batch_task.job_group
     *
     * @mbggenerated Thu Aug 10 11:10:46 CST 2023
     */
    public void setJobGroup(String jobGroup) {
        this.jobGroup = jobGroup;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column batch_task.create_user
     *
     * @return the value of batch_task.create_user
     *
     * @mbggenerated Thu Aug 10 11:10:46 CST 2023
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column batch_task.create_user
     *
     * @param createUser the value for batch_task.create_user
     *
     * @mbggenerated Thu Aug 10 11:10:46 CST 2023
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column batch_task.create_time
     *
     * @return the value of batch_task.create_time
     *
     * @mbggenerated Thu Aug 10 11:10:46 CST 2023
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column batch_task.create_time
     *
     * @param createTime the value for batch_task.create_time
     *
     * @mbggenerated Thu Aug 10 11:10:46 CST 2023
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column batch_task.update_user
     *
     * @return the value of batch_task.update_user
     *
     * @mbggenerated Thu Aug 10 11:10:46 CST 2023
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column batch_task.update_user
     *
     * @param updateUser the value for batch_task.update_user
     *
     * @mbggenerated Thu Aug 10 11:10:46 CST 2023
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column batch_task.update_time
     *
     * @return the value of batch_task.update_time
     *
     * @mbggenerated Thu Aug 10 11:10:46 CST 2023
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column batch_task.update_time
     *
     * @param updateTime the value for batch_task.update_time
     *
     * @mbggenerated Thu Aug 10 11:10:46 CST 2023
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table batch_task
     *
     * @mbggenerated Thu Aug 10 11:10:46 CST 2023
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", batchTaskId=").append(batchTaskId);
        sb.append(", taskName=").append(taskName);
        sb.append(", taskDescription=").append(taskDescription);
        sb.append(", taskCronExpression=").append(taskCronExpression);
        sb.append(", beanClassPath=").append(beanClassPath);
        sb.append(", jobStatus=").append(jobStatus);
        sb.append(", jobGroup=").append(jobGroup);
        sb.append(", createUser=").append(createUser);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateUser=").append(updateUser);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}