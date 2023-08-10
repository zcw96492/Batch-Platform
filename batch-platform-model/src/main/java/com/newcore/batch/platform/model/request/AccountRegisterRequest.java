package com.newcore.batch.platform.model.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户注册请求模型
 * @author zhouchaowei
 * @date 2023-08-10
 */
@Data
public class AccountRegisterRequest implements Serializable {

    private static final long serialVersionUID = 259049562453128556L;


    private String userName;

    private String password;
}
