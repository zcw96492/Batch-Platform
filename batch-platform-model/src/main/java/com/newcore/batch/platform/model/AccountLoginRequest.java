package com.newcore.batch.platform.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 登录请求模型
 * @author zhouchaowei
 * @date 2022-07-13
 */
@Data
public class AccountLoginRequest implements Serializable {

    private static final long serialVersionUID = -5880473872248400492L;
    /** 用户名 */
    private String username;
    /** 登录密码 */
    private String password;
}
