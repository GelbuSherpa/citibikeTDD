package com.citibikenyc.qa.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;




public class Configuration {

	private Properties properties;
	private String defaultPath="configuration/config.properties";
	
	public Configuration(String path) {
		loadProperty(defaultPath);
	}
	
	private void loadProperty(String path) {
	properties =new Properties();
	try {
		InputStream inputStream=new FileInputStream(path);
		properties.load(inputStream);
	} catch (IOException e) {
		e.printStackTrace();
	}
	}
	public String getConfig(String key) {
		return properties.getProperty(key);
	}
}
