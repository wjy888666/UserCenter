package com.wjy.usercenter.model.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户注册请求体
 *
 * @Author:wjy
 */
@Data
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = -1020319643979850326L;

    /**
     * 用户账号
     */
    private String userAccount;

    /**
     * 用户密码
     */
    private String userPassword;

}
