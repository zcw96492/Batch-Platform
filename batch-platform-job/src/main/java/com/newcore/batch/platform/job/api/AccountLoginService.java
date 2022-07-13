package com.newcore.batch.platform.job.api;

import com.newcore.batch.platform.model.AccountLoginRequest;

/**
 * 登录接口
 * @author zhouchaowei
 * @date 2022-07-13
 */
public interface AccountLoginService {

    /**
     * 登录方法
     * @param accountLoginRequest 登录请求模型
     * @return
     */
    boolean login(AccountLoginRequest accountLoginRequest);
}
