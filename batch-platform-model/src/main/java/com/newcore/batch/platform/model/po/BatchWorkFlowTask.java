package com.newcore.batch.platform.model.po;

import java.io.Serializable;
import java.util.Date;

public class BatchWorkFlowTask implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column batch_work_flow_task.work_flow_task_id
     *
     * @mbggenerated Thu Aug 10 11:10:46 CST 2023
     */
    private Long workFlowTaskId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column batch_work_flow_task.work_flow_code
     *
     * @mbggenerated Thu Aug 10 11:10:46 CST 2023
     */
    private String workFlowCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column batch_work_flow_task.work_flow_name
     *
     * @mbggenerated Thu Aug 10 11:10:46 CST 2023
     */
    private String workFlowName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column batch_work_flow_task.work_flow_type
     *
     * @mbggenerated Thu Aug 10 11:10:46 CST 2023
     */
    private String workFlowType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column batch_work_flow_task.work_flow_status
     *
     * @mbggenerated Thu Aug 10 11:10:46 CST 2023
     */
    private String workFlowStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column batch_work_flow_task.work_flow_system
     *
     * @mbggenerated Thu Aug 10 11:10:46 CST 2023
     */
    private String workFlowSystem;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column batch_work_flow_task.upload_file
     *
     * @mbggenerated Thu Aug 10 11:10:46 CST 2023
     */
    private String uploadFile;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column batch_work_flow_task.create_time
     *
     * @mbggenerated Thu Aug 10 11:10:46 CST 2023
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column batch_work_flow_task.update_time
     *
     * @mbggenerated Thu Aug 10 11:10:46 CST 2023
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table batch_work_flow_task
     *
     * @mbggenerated Thu Aug 10 11:10:46 CST 2023
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column batch_work_flow_task.work_flow_task_id
     *
     * @return the value of batch_work_flow_task.work_flow_task_id
     *
     * @mbggenerated Thu Aug 10 11:10:46 CST 2023
     */
    public Long getWorkFlowTaskId() {
        return workFlowTaskId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column batch_work_flow_task.work_flow_task_id
     *
     * @param workFlowTaskId the value for batch_work_flow_task.work_flow_task_id
     *
     * @mbggenerated Thu Aug 10 11:10:46 CST 2023
     */
    public void setWorkFlowTaskId(Long workFlowTaskId) {
        this.workFlowTaskId = workFlowTaskId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column batch_work_flow_task.work_flow_code
     *
     * @return the value of batch_work_flow_task.work_flow_code
     *
     * @mbggenerated Thu Aug 10 11:10:46 CST 2023
     */
    public String getWorkFlowCode() {
        return workFlowCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column batch_work_flow_task.work_flow_code
     *
     * @param workFlowCode the value for batch_work_flow_task.work_flow_code
     *
     * @mbggenerated Thu Aug 10 11:10:46 CST 2023
     */
    public void setWorkFlowCode(String workFlowCode) {
        this.workFlowCode = workFlowCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column batch_work_flow_task.work_flow_name
     *
     * @return the value of batch_work_flow_task.work_flow_name
     *
     * @mbggenerated Thu Aug 10 11:10:46 CST 2023
     */
    public String getWorkFlowName() {
        return workFlowName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column batch_work_flow_task.work_flow_name
     *
     * @param workFlowName the value for batch_work_flow_task.work_flow_name
     *
     * @mbggenerated Thu Aug 10 11:10:46 CST 2023
     */
    public void setWorkFlowName(String workFlowName) {
        this.workFlowName = workFlowName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column batch_work_flow_task.work_flow_type
     *
     * @return the value of batch_work_flow_task.work_flow_type
     *
     * @mbggenerated Thu Aug 10 11:10:46 CST 2023
     */
    public String getWorkFlowType() {
        return workFlowType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column batch_work_flow_task.work_flow_type
     *
     * @param workFlowType the value for batch_work_flow_task.work_flow_type
     *
     * @mbggenerated Thu Aug 10 11:10:46 CST 2023
     */
    public void setWorkFlowType(String workFlowType) {
        this.workFlowType = workFlowType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column batch_work_flow_task.work_flow_status
     *
     * @return the value of batch_work_flow_task.work_flow_status
     *
     * @mbggenerated Thu Aug 10 11:10:46 CST 2023
     */
    public String getWorkFlowStatus() {
        return workFlowStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column batch_work_flow_task.work_flow_status
     *
     * @param workFlowStatus the value for batch_work_flow_task.work_flow_status
     *
     * @mbggenerated Thu Aug 10 11:10:46 CST 2023
     */
    public void setWorkFlowStatus(String workFlowStatus) {
        this.workFlowStatus = workFlowStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column batch_work_flow_task.work_flow_system
     *
     * @return the value of batch_work_flow_task.work_flow_system
     *
     * @mbggenerated Thu Aug 10 11:10:46 CST 2023
     */
    public String getWorkFlowSystem() {
        return workFlowSystem;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column batch_work_flow_task.work_flow_system
     *
     * @param workFlowSystem the value for batch_work_flow_task.work_flow_system
     *
     * @mbggenerated Thu Aug 10 11:10:46 CST 2023
     */
    public void setWorkFlowSystem(String workFlowSystem) {
        this.workFlowSystem = workFlowSystem;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column batch_work_flow_task.upload_file
     *
     * @return the value of batch_work_flow_task.upload_file
     *
     * @mbggenerated Thu Aug 10 11:10:46 CST 2023
     */
    public String getUploadFile() {
        return uploadFile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column batch_work_flow_task.upload_file
     *
     * @param uploadFile the value for batch_work_flow_task.upload_file
     *
     * @mbggenerated Thu Aug 10 11:10:46 CST 2023
     */
    public void setUploadFile(String uploadFile) {
        this.uploadFile = uploadFile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column batch_work_flow_task.create_time
     *
     * @return the value of batch_work_flow_task.create_time
     *
     * @mbggenerated Thu Aug 10 11:10:46 CST 2023
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column batch_work_flow_task.create_time
     *
     * @param createTime the value for batch_work_flow_task.create_time
     *
     * @mbggenerated Thu Aug 10 11:10:46 CST 2023
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column batch_work_flow_task.update_time
     *
     * @return the value of batch_work_flow_task.update_time
     *
     * @mbggenerated Thu Aug 10 11:10:46 CST 2023
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column batch_work_flow_task.update_time
     *
     * @param updateTime the value for batch_work_flow_task.update_time
     *
     * @mbggenerated Thu Aug 10 11:10:46 CST 2023
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table batch_work_flow_task
     *
     * @mbggenerated Thu Aug 10 11:10:46 CST 2023
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", workFlowTaskId=").append(workFlowTaskId);
        sb.append(", workFlowCode=").append(workFlowCode);
        sb.append(", workFlowName=").append(workFlowName);
        sb.append(", workFlowType=").append(workFlowType);
        sb.append(", workFlowStatus=").append(workFlowStatus);
        sb.append(", workFlowSystem=").append(workFlowSystem);
        sb.append(", uploadFile=").append(uploadFile);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}