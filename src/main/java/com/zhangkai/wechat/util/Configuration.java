package com.zhangkai.wechat.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 获取配置文件的工具类
 * 
 * @author zhangkai
 *
 */
public class Configuration {

	private static Properties p = new Properties();

	static {
		InputStream is = Configuration.class.getClassLoader().getResourceAsStream("wechat.properties");
		try {
			p.load(is);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (is != null) {
				try {
					is.close();
					is = null;
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * get the key value given key
	 * 
	 * @param key
	 *            given key
	 * @return value
	 */
	public static String getProperty(String key) {

		return p.getProperty(key);
	}

}
