package com.newcore.batch.platform.job.api.impl;

import com.newcore.batch.platform.job.api.DataExportTaskService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Service;

/**
 * 数据导出接口实现类
 * @author zhouchaowei
 * @date 2023-08-10
 */
@Service("dataExportTaskService")
@MapperScan(basePackages = "com.newcore.batch.platform.persistence")
public class DataExportTaskServiceImpl implements DataExportTaskService {
}
