package com.yupi.yuaicodemother.exception;

import com.yupi.yuaicodemother.common.BaseResponse;
import com.yupi.yuaicodemother.common.ResultUtils;
import io.swagger.v3.oas.annotations.Hidden;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author cui
 * @version 1.0
 * @description todo
 * @date 2025/11/23下午6:22
 */
@Hidden
@RestControllerAdvice
@Slf4j
public class GlobalExeceptionHandler {

    @ExceptionHandler(BussinessException.class)
    public BaseResponse<?> businessExeceptionHandler(BussinessException e) {
        log.error("BussinessException");
        return ResultUtils.error(e.getCode(), e.getMessage());
    }

    @ExceptionHandler(RuntimeException.class)
    public BaseResponse<?> runtimeExceptionHandler(RuntimeException e) {
        log.error("RuntimeException");
        return ResultUtils.error(ErrorCode.SYSTEM_ERROR, "系统错误");
    }
}
