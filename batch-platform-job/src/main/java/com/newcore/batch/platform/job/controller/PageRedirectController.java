package com.newcore.batch.platform.job.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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

    /**
     * 跳转到登录界面
     * @param model 视图模型
     * @return 登录界面
     */
    @GetMapping("/")
    public String redirectLogin(Model model){
        logger.info("批处理平台 || 跳转到登录界面...");
        return "index";
    }

    /**
     * 跳转到注册界面
     * @param model 视图模型
     * @return 登录界面
     */
    @GetMapping("/redirectRegister")
    public String redirectRegister(Model model){
        logger.info("批处理平台 || 跳转到注册界面...");
        return "register";
    }

    /**
     * 跳转到修改密码界面
     * @param model 视图模型
     * @return 登录界面
     */
    @GetMapping("/redirectEditPassword")
    public String redirectEditPassword(Model model){
        logger.info("批处理平台 || 跳转到修改密码界面...");
        return "editPassword";
    }
}
