package com.zhangkai.wechat.domain;

/**
 * 微信公众平台token类
 * 
 * @author zhangkai
 * 
 */
public class AccessToken {

	/**
	 * 有效期
	 */
	private String access_token;

	/**
	 * token
	 */
	private String expires_in;

	public String getAccess_token() {
		return access_token;
	}

	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}

	public String getExpires_in() {
		return expires_in;
	}

	public void setExpires_in(String expires_in) {
		this.expires_in = expires_in;
	}

}
