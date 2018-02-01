package com.moensun.commons.exception;

/**
 * Created by Bane.Shi.
 * Copyright MoenSun
 * User: Bane.Shi
 * Date: 2018/1/31
 * Time: 下午10:56
 */
public class MSBaseException extends RuntimeException {

    private final String code;
    private final String message;
    private final Integer httpCode;

    public String getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public Integer getHttpCode() {
        return httpCode;
    }

    public MSBaseException(String code, Throwable cause) {
        super(code, cause);
        this.code = code;
        this.message = null;
        this.httpCode = null;
    }

    public MSBaseException(String code, String message) {
        this.code = code;
        this.message = message;
        this.httpCode = null;
    }

    public MSBaseException(String code, String message, Integer httpCode) {
        this.code = code;
        this.message = message;
        this.httpCode = httpCode;
    }

    public MSBaseException(String message, String code, String message1, Integer httpCode) {
        super(message);
        this.code = code;
        this.message = message1;
        this.httpCode = httpCode;
    }

    public MSBaseException(String message, Throwable cause, String code, String message1, Integer httpCode) {
        super(message, cause);
        this.code = code;
        this.message = message1;
        this.httpCode = httpCode;
    }

    public MSBaseException(Throwable cause, String code, String message, Integer httpCode) {
        super(cause);
        this.code = code;
        this.message = message;
        this.httpCode = httpCode;
    }

    public MSBaseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String code, String message1, Integer httpCode) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.code = code;
        this.message = message1;
        this.httpCode = httpCode;
    }
}
