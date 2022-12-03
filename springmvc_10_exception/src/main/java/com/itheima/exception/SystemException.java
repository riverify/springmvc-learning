package com.itheima.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * FileName: SystemException
 * Date: 2022/12/03
 * Time: 15:17
 * Author: river
 */

public class SystemException extends RuntimeException {
    private Integer code;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public SystemException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public SystemException(Integer code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }


}
