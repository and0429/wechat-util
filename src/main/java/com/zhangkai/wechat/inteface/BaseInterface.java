package com.zhangkai.wechat.inteface;

import org.apache.log4j.Logger;

/**
 * 微信接口的抽象类，封装了公共的属性和方法
 * 
 * @author zhangkai
 *
 */
public abstract class BaseInterface {

	public static final String CHARSET = "utf-8";
	private static Logger logger = Logger.getLogger(BaseInterface.class);

	/**
	 * 打印格式化后的日志
	 * 
	 * @param content
	 *            日志内容
	 */
	public void loggerformat(String content) {
		logger.error("================== " + content + " ==================");
	}

}
