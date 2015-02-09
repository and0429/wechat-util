package com.zhangkai.wechat.domain;

import java.util.LinkedList;
import java.util.List;

/**
 * 微信服务器Ip地址对象
 * 
 * @author zhangkai
 *
 */
public class WechatServiceIp {

	/**
	 * Ip地址集合
	 */
	private List<String> ip_list = new LinkedList<String>();

	public List<String> getIp_list() {
		return ip_list;
	}

	public void setIp_list(List<String> ip_list) {
		this.ip_list = ip_list;
	}

}
