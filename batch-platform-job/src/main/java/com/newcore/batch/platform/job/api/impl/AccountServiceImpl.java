package com.newcore.batch.platform.job.api.impl;

import com.newcore.batch.platform.job.api.AccountService;
import com.newcore.batch.platform.model.request.AccountLoginRequest;
import com.newcore.batch.platform.model.request.AccountRegisterRequest;
import com.newcore.batch.platform.persistence.BatchAccountMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 登录接口实现类
 * @author zhouchaowei
 * @date 2022-07-13
 */
@Service("accountLoginService")
@MapperScan(basePackages = "com.newcore.batch.platform.persistence")
public class AccountServiceImpl implements AccountService {

    private static final Logger logger = LoggerFactory.getLogger(AccountServiceImpl.class);

    @Autowired
    private BatchAccountMapper batchAccountMapper;

    /**
     * 登录方法
     * @param accountLoginRequest 登录请求模型
     * @return 登录结果
     */
    @Override
    public boolean login(AccountLoginRequest accountLoginRequest) {
        return "admin".equals(accountLoginRequest.getUsername()) && "admin".equals(accountLoginRequest.getPassword());
    }

    /**
     * 注册方法
     * @param accountRegisterRequest 注册请求模型
     * @return 注册结果
     */
    @Override
    public String registerCommit(AccountRegisterRequest accountRegisterRequest) {
        return null;
    }
}
