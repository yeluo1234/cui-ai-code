package com.yupi.yuaicodemother.exception;

/**
 * @author cui
 * @version 1.0
 * @description todo
 * @date 2025/11/22下午5:24
 */

public class ThrowUtils {

    /**
     * 条件成立则抛异常
     * @param condition
     * @param runtimeException
     */
    public static void throwIf(boolean condition, RuntimeException runtimeException) {
        if (condition) {
            throw runtimeException;
        }
    }

    /**
     * 条件成立则抛异常
     * @param condition
     * @param errorCode
     */
    public static void throwIf(boolean condition, ErrorCode errorCode) {
        throwIf(condition, new BussinessException(errorCode));
    }

    /**
     * 条件成立则抛异常
     * @param condition
     * @param errorCode
     * @param message
     */
    public static void throwIf(boolean condition, ErrorCode errorCode, String message) {
        throwIf(condition, new BussinessException(errorCode, message));
    }
}
