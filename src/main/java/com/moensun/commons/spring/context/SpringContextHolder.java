package com.moensun.commons.spring.context;

import org.springframework.context.ApplicationContext;

/**
 * Created by Bane.Shi.
 * Copyright MoenSun
 * User: Bane.Shi
 * Date: 2017/5/3
 * Time: 09:55
 */
public class SpringContextHolder {

	private SpringContextHolder(){}

	private static ApplicationContext applicationContext;

	public static ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	public static void setApplicationContext(ApplicationContext applicationContext) {
		SpringContextHolder.applicationContext = applicationContext;
	}
}
