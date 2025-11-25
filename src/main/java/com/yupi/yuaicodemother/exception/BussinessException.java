package com.yupi.yuaicodemother.exception;

import lombok.Getter;

/**
 * @author cui
 * @version 1.0
 * @description todo
 * @date 2025/11/22下午5:18
 */
@Getter
public class BussinessException extends RuntimeException {

    /**
     * 错误码
     */
    private final int code;

    public BussinessException(int code, String message) {
        super(message);
        this.code = code;
    }

    public BussinessException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
    }

    public BussinessException(ErrorCode errorCode, String message) {
        super(message);
        this.code = errorCode.getCode();
    }
}
