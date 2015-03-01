package com.zhangkai.wechat.domain.menu;

import com.zhangkai.wechat.enumuration.ButtonType;

/**
 * 跳转到页面的按钮
 * 
 * @author zhangkai
 *
 */
public class ViewButton extends Button {

	/**
	 * 按钮类型
	 */
	private final String type = ButtonType.VIEW.value();

	/**
	 * 连接地址
	 */
	private String url;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getType() {
		return type;
	}

}
