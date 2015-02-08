package com.zhangkai.wechat.inteface;

import com.zhangkai.wechat.domain.AccessToken;

/**
 * 获取微信Token的工具类
 * 
 * @author zhangkai
 *
 */
public class AccessTokenInterface {

	/**
	 * 第三方用户唯一凭证
	 */
	private String appid;

	/**
	 * 第三方用户唯一凭证密钥，即appsecret
	 */
	private String secret;

	/**
	 * 创建一个对象。
	 * 
	 * @param appid
	 *            第三方用户唯一凭证
	 * @param secret
	 *            第三方用户唯一凭证密钥，即appsecret
	 */
	public AccessTokenInterface(String appid, String secret) {
		this.appid = appid;
		this.secret = secret;
	}

	/**
	 * 
	 */
	public AccessToken getAccessToken() {

		return null;
	}

}
