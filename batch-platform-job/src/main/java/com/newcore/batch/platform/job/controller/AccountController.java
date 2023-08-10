package com.newcore.batch.platform.job.controller;

import com.alibaba.fastjson.JSON;
import com.newcore.batch.platform.job.api.AccountService;
import com.newcore.batch.platform.model.request.AccountLoginRequest;
import com.newcore.batch.platform.model.request.AccountRegisterRequest;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 登录控制器
 * @author zhouchaowei
 * @date 2022-07-13
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    private static final Logger logger = LoggerFactory.getLogger(AccountController.class);

    @Autowired
    private AccountService accountService;

    /**
     * 批处理平台登录方法
     * @param model 模型视图
     * @param accountLoginRequest 用户登录请求模型
     * @return 登录结果
     */
    @ApiOperation(httpMethod = "POST",value = "login", notes = "批处理平台-用户登录方法", response = String.class)
    @PostMapping("/login")
    public String login(Model model, AccountLoginRequest accountLoginRequest){
        logger.info("批处理平台 || 登录方法 || login || 入参条件:{}", JSON.toJSONString(accountLoginRequest));
        return accountService.login(accountLoginRequest) ? "index" : "login";
    }

    /**
     * 批处理平台注册方法
     * @param accountRegisterRequest 注册请求模型
     * @return 注册结果
     */
    @ApiOperation(httpMethod = "POST",value = "registerCommit", notes = "批处理平台-用户注册方法", response = String.class)
    @PostMapping("/registerCommit")
    public String registerCommit(@RequestBody AccountRegisterRequest accountRegisterRequest){
        logger.info("批处理平台 || 注册方法 || registerCommit || 入参条件:{}", JSON.toJSONString(accountRegisterRequest));
        return accountService.registerCommit(accountRegisterRequest);
    }
}
