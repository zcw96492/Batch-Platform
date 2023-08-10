package com.newcore.batch.platform.job.api;

import com.newcore.batch.platform.model.request.AccountLoginRequest;
import com.newcore.batch.platform.model.request.AccountRegisterRequest;

/**
 * 登录接口
 * @author zhouchaowei
 * @date 2022-07-13
 */
public interface AccountService {

    /**
     * 登录方法
     * @param accountLoginRequest 登录请求模型
     * @return 登录结果
     */
    boolean login(AccountLoginRequest accountLoginRequest);

    /**
     * 注册方法
     * @param accountRegisterRequest 注册请求模型
     * @return 注册结果
     */
    String registerCommit(AccountRegisterRequest accountRegisterRequest);
}
