package com.newcore.batch.platform.job.api.impl;

import com.newcore.batch.platform.job.api.DataExportTaskService;
import com.newcore.batch.platform.model.request.ExportRequest;
import com.newcore.batch.platform.model.response.ExportResponse;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 数据导出接口实现类
 * @author zhouchaowei
 * @date 2023-08-10
 */
@Service("dataExportTaskService")
@MapperScan(basePackages = "com.newcore.batch.platform.persistence")
public class DataExportTaskServiceImpl implements DataExportTaskService {

    private static final Logger logger = LoggerFactory.getLogger(DataExportTaskServiceImpl.class);

    /**
     * 数据导出方法
     * @param exportRequest 数据导出请求模型
     * @return 导出结果
     */
    @Override
    public ExportResponse export(ExportRequest exportRequest) {
        return null;
    }
}
