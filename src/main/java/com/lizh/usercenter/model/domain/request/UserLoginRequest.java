package com.lizh.usercenter.model.domain.request;

/**
 * This class is for xxxx.
 *
 * @author Mr.Li
 * @version 2023-03-23 下午 10:28
 */

import lombok.Data;

import java.io.Serializable;

/**
 * 用户登录请求体
 */

@Data
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = -4674172478973430060L;

    private String userAccount;
    private String userPassword;
}
