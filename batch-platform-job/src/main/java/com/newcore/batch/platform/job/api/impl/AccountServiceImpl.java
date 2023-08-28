package com.newcore.batch.platform.job.api.impl;

import com.newcore.batch.platform.job.api.AccountService;
import com.newcore.batch.platform.model.po.BatchAccount;
import com.newcore.batch.platform.model.po.BatchAccountExample;
import com.newcore.batch.platform.model.request.AccountLoginRequest;
import com.newcore.batch.platform.model.request.AccountRegisterRequest;
import com.newcore.batch.platform.persistence.BatchAccountMapper;
import com.newcore.batch.platform.utils.Md5Utils;
import com.newcore.batch.platform.utils.enumclass.BusinessExceptionCodeEnum;
import com.newcore.batch.platform.utils.exception.BusinessException;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

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
        String username = accountLoginRequest.getUsername();
        String password = accountLoginRequest.getPassword();
        String hex = "";
        try{
            Md5Utils instance = Md5Utils.getInstance();
            hex = instance.digest(password);
            logger.info("输入的用户名:{},输入的密码:{},输入的密码加密串为:{}",username,password,hex);
        }catch (Exception ex) {
            logger.error("输入的用户名:{},输入的密码:{},输入的密码加密串为:{}",username,password,hex);
            throw new BusinessException(BusinessExceptionCodeEnum.L0001.getCode(),BusinessExceptionCodeEnum.L0001.getMessage());
        }
        BatchAccountExample batchAccountExample = new BatchAccountExample();
        batchAccountExample.createCriteria().andUserNameEqualTo(username);
        List<BatchAccount> batchAccountList = batchAccountMapper.selectByExample(batchAccountExample);
        if(!CollectionUtils.isEmpty(batchAccountList)){
            BatchAccount batchAccount = batchAccountList.get(0);
            boolean userNameEqualFlag = batchAccount.getUserName().equals(username);
            boolean passwordEqualFlag = batchAccount.getUserPassword().equals(hex);
            if(!passwordEqualFlag){
                logger.info("用户密码输入错误! || 用户输入的密码加密串:{},数据库中的密码加密串:{}",hex,batchAccount.getUserPassword());
                throw new BusinessException(BusinessExceptionCodeEnum.L0004.getCode(),BusinessExceptionCodeEnum.L0004.getMessage());
            }
            return userNameEqualFlag;
        }else{
            throw new BusinessException(BusinessExceptionCodeEnum.L0003.getCode(),BusinessExceptionCodeEnum.L0003.getMessage());
        }
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
