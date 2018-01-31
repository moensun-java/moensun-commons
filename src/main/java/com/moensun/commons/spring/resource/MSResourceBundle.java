package com.moensun.commons.spring.resource;

import org.springframework.context.MessageSource;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.Objects;
import java.util.ResourceBundle;

/**
 * Created by Bane.Shi.
 * Copyright MoenSun
 * User: Bane.Shi
 * Date: 2016/11/25
 * Time: 21:57
 */
public class MSResourceBundle {
	private Locale local = Locale.getDefault();
	private ResourceBundle resourceBundle;

	public void setMessageSource(MessageSource messageScore) {
		resourceBundle = new MessageSourceResourceBundle(messageScore,this.local);
	}

	public void setResourceBundle(String resourcePath) {
		if(Objects.nonNull(resourcePath)){
			String resourcePathFormat = resourcePath.replace("classpath:","");
			resourceBundle = ResourceBundle.getBundle(resourcePathFormat, this.local);
		}
	}

	public void setLocal(Locale local){
		this.local = local;
	}


	public String text(String code,Object... params) {
		return MessageFormat.format(resourceBundle.getString(code),params);
	}

}
