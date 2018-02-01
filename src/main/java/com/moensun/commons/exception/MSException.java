package com.moensun.commons.exception;


import com.moensun.commons.spring.context.SpringContextHolder;
import com.moensun.commons.spring.resource.MSResourceBundle;

/**
 * Created by Bane.Shi.
 * Copyright MoenSun
 * User: Bane.Shi
 * Date: 2016/11/25
 * Time: 22:00
 */
public class MSException extends MSBaseException {

	private final String code;
	private final String message;
	private final Integer httpCode;

	private final MSResourceBundle msResourceBundle;

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

	public MSResourceBundle getMsResourceBundle() {
		return msResourceBundle;
	}

	public MSException(String code, Object... params){
		this(null,null,code,params);
	}
	public MSException(Integer httpCode, String code, Object... params){
		this(httpCode,null,code,params);
	}

	public MSException(Throwable cause, String code, Object... params) {
		this(null,cause,code,params);
	}

	public MSException(Integer httpCode, Throwable cause, String code, Object... params) {
		super(code,cause);
		this.httpCode = httpCode;
		this.code = code;
		this.msResourceBundle = SpringContextHolder.getApplicationContext().getBean(MSResourceBundle.class);
		this.message = msResourceBundle.text(code,params);
	}

	@Override
	public String toString() {
		return "MSException{" +
				"code='" + code + '\'' +
				", message='" + message + '\'' +
				", msResourceBundle=" + msResourceBundle +
				'}';
	}
}
