package com.newcore.batch.platform.job.api;

import com.newcore.batch.platform.model.request.TransferAccountRequest;
import com.newcore.batch.platform.model.response.TransferAccountResponse;

import java.util.List;

/**
 * 转账服务接口
 * @author zhouchaowei
 * @date 2024-02-20
 */
public interface TransferAccountService {

    /**
     * 转账方法
     * @param transferAccountRequest 转账请求
     * @return 转账结果
     */
    TransferAccountResponse transferAccount(TransferAccountRequest transferAccountRequest);

    /**
     * 批量转账方法
     * @param transferAccountRequest 转账请求
     * @return 转账结果
     */
    TransferAccountResponse transferAccountBatch(List<TransferAccountRequest> transferAccountRequest);
}
