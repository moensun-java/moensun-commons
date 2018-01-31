package com.moensun.commons.spring.context;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by Bane.Shi.
 * Copyright MoenSun
 * User: Bane.Shi
 * Date: 2016/11/21
 * Time: 18:31
 */
public class SpringContextSetter implements ApplicationContextInitializer<ConfigurableApplicationContext> {


	@Override
	public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
		SpringContextHolder.setApplicationContext(configurableApplicationContext);
	}
}
