package com.yupi.yuaicodemother.model.dto.user;

import lombok.Data;

import java.io.Serializable;

/**
 * @author cui
 * @version 1.0
 * @description todo
 * @date 2025/11/26上午9:50
 */
@Data
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = 3191241716373120793L;

    /**
     * 账号
     */
    private String userAccount;

    /**
     * 密码
     */
    private String userPassword;
}

