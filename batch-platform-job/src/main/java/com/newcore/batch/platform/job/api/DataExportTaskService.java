package com.newcore.batch.platform.job.api;

import com.newcore.batch.platform.model.request.ExportRequest;
import com.newcore.batch.platform.model.response.ExportResponse;

/**
 * 数据导出接口
 * @author zhouchaowei
 * @date 2023-08-10
 */
public interface DataExportTaskService {

    /**
     * 数据导出方法
     * @param exportRequest 数据导出请求模型
     * @return 导出结果
     */
    ExportResponse export (ExportRequest exportRequest);
}
