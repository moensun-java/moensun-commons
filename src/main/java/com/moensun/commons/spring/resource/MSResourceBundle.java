package com.moensun.commons.spring.resource;

import com.google.common.collect.Lists;
import org.springframework.context.MessageSource;

import java.text.MessageFormat;
import java.util.*;

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
	private ResourceBundle[] resourceBundles;

	public void setMessageSource(MessageSource messageScore) {
		resourceBundle = new MessageSourceResourceBundle(messageScore,this.local);
	}

	public void setResourceBundle(String resourcePath) {
		if(Objects.nonNull(resourcePath)){
			String resourcePathFormat = resourcePath.replace("classpath:","");
			resourceBundle = ResourceBundle.getBundle(resourcePathFormat, this.local);
			setPropertiesMap(resourceBundle);
		}
	}

	public void setResourceBundles(String[] resourcePaths) {
		if( Objects.nonNull(resourcePaths) && resourcePaths.length>0 ){
			List<ResourceBundle> resourceBundleList = Lists.newArrayList();
			for (int i=0;i<resourcePaths.length;i++){
				String resourcePathFormat = resourcePaths[i].replace("classpath:","");
				ResourceBundle resourceBundleItem = ResourceBundle.getBundle(resourcePathFormat, this.local);
				setPropertiesMap(resourceBundleItem);
				resourceBundleList.add(resourceBundleItem);
			}
			resourceBundles = resourceBundleList.toArray(new ResourceBundle[resourceBundleList.size()]);
		}
	}

	public void setLocal(Locale local){
		this.local = local;
	}


	public String text(String code,Object... params) {
		return MessageFormat.format(ResourceProperties.codeMap.get(code),params);
	}

	public void setPropertiesMap(ResourceBundle resourceBundle){
		Enumeration<String> keys = resourceBundle.getKeys();
		while (keys.hasMoreElements()){
			String key = keys.nextElement();
			ResourceProperties.codeMap.put(key,resourceBundle.getString(key));
		}
	}

}
