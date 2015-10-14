package com.todotask.platform.global;

import java.io.File;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public final class Config {
	private static final Log logger = LogFactory.getLog(Config.class);
	/**
	 * 属性文件加载对象
	 */
	private static PropertiesLoader propertiesLoader;
	/**
	 * 装配多个配置文件
	 */
	private static final String[] CONFIG_FILE = new String[] { "config/global-config.properties", "webapp-mobile-config.properties" };

	/**
	 * 获取配置
	 */
	public static String getConfig(String key) {
		if (propertiesLoader == null) {
			propertiesLoader = new PropertiesLoader(CONFIG_FILE);
		}
		return propertiesLoader.getProperty(key);
	}

	

	/**
	 * 获得webService 的wsdlurl
	 */
	public static String getWsdlUrl() {
		String path = getConfig("WSDL_URL");
		return path;
	}

	/**
	 * 获取图片路径
	 * 
	 * @return
	 */
	public static String getImagePath() {
		String path = getConfig("imagePath");
		mkdirs(path);
		return path;
	}

	public static String getWiseTxtUrl() {
		return getConfig("txtWiseUrl");
	}

	/**
	 * jdbc 配置
	 */
	public static String getDriver() {
		return getConfig("driver");
	}

	public static String getUrl() {
		return getConfig("url");
	}

	public static String getUser() {
		return getConfig("user");
	}

	public static String getPass() {
		return getConfig("pass");
	}

	/**
	 * 如果目录不存在创建目录
	 * 
	 * @param path
	 */
	private static void mkdirs(String path) {
		try {
			File file = new File(path);
			if (!file.exists()) {
				file.mkdirs();
			}
		} catch (Exception e) {
			logger.error("初始化目录结构失败:", e);
		}

	}

	public static void main(String[] args) {
	}
}
