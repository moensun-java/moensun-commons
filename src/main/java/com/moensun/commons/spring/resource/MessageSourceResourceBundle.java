package com.moensun.commons.spring.resource;

import org.springframework.context.MessageSource;
import org.springframework.context.NoSuchMessageException;

import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by Bane.Shi.
 * Copyright MoenSun
 * User: Bane.Shi
 * Date: 2016/11/25
 * Time: 21:55
 */
public class MessageSourceResourceBundle extends ResourceBundle {
	private final MessageSource messageSource;

	private final Locale locale;

	public MessageSourceResourceBundle(MessageSource messageSource, Locale locale) {
		this.messageSource = messageSource;
		this.locale = locale;
	}

	protected Object handleGetObject(String key) {
		try {
			return this.messageSource.getMessage(key, null, this.locale);
		}
		catch (NoSuchMessageException ex) {
			return null;
		}
	}

	public Enumeration<String> getKeys() {
		throw new UnsupportedOperationException("MessageSourceResourceBundle does not support enumerating its keys");
	}
}
