package com.newcore.batch.platform.job.api.impl;

import com.newcore.batch.platform.job.api.AccountLoginService;
import com.newcore.batch.platform.model.AccountLoginRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 登录接口实现类
 * @author zhouchaowei
 * @date 2022-07-13
 */
@Service("accountLoginService")
public class AccountLoginServiceImpl implements AccountLoginService {

    private static final Logger logger = LoggerFactory.getLogger(AccountLoginServiceImpl.class);

    /**
     * 登录方法
     * @param accountLoginRequest 登录请求模型
     * @return
     */
    @Override
    public boolean login(AccountLoginRequest accountLoginRequest) {
        return "admin".equals(accountLoginRequest.getUsername()) && "admin".equals(accountLoginRequest.getPassword());
    }
}
