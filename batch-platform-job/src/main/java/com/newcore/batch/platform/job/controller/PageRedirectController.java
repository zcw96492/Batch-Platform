package com.newcore.batch.platform.job.controller;

import com.alibaba.fastjson.JSON;
import com.newcore.batch.platform.job.api.AccountLoginService;
import com.newcore.batch.platform.model.AccountLoginRequest;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 前端页面跳转控制器
 * @author zhouchaowei
 * @date 2022-07-13
 */
@Controller
@RequestMapping("/")
public class PageRedirectController {

    private static final Logger logger = LoggerFactory.getLogger(PageRedirectController.class);

    @Autowired
    private AccountLoginService accountLoginService;

    /**
     * 跳转到登录界面
     * @param model 视图模型
     * @return 登录界面
     */
    @GetMapping("/")
    public String redirectLogin(Model model){
        logger.info("批处理平台 || 跳转到登录界面...");
        return "login";
    }

    /**
     * 后台管理系统登录方法
     * @param model 模型视图
     * @param accountLoginRequest 用户登录请求模型
     * @return
     */
    @ApiOperation(httpMethod = "POST",value = "login", notes = "后台管理系统登录方法", response = String.class)
    @PostMapping("/login")
    public String login(Model model, AccountLoginRequest accountLoginRequest){
        logger.info("批处理平台 || 登录方法 || login || 入参条件:{}", JSON.toJSONString(accountLoginRequest));
        return accountLoginService.login(accountLoginRequest) ? "index" : "login";
    }
}
