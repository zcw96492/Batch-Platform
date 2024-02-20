package com.newcore.batch.platform.job.api.impl;

import com.newcore.batch.platform.job.api.TransferAccountService;
import com.newcore.batch.platform.model.request.TransferAccountRequest;
import com.newcore.batch.platform.model.response.TransferAccountResponse;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 转账服务接口
 * @author zhouchaowei
 * @date 2024-02-20
 */
@Service("transferAccountService")
@MapperScan(basePackages = "com.newcore.batch.platform.persistence")
public class TransferAccountServiceImpl implements TransferAccountService {

    private static final Logger logger = LoggerFactory.getLogger(TransferAccountServiceImpl.class);

    /**
     * 转账方法
     * @param transferAccountRequest 转账请求
     * @return 转账结果
     */
    @Override
    public TransferAccountResponse transferAccount(TransferAccountRequest transferAccountRequest) {
        return null;
    }

    /**
     * 批量转账方法
     * @param transferAccountRequest 转账请求
     * @return 转账结果
     */
    @Override
    public TransferAccountResponse transferAccountBatch(List<TransferAccountRequest> transferAccountRequest) {
        return null;
    }
}
