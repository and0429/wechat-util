package com.zhangkai.wechat.domain.menu;

import com.zhangkai.wechat.enumuration.ButtonType;

/**
 * 点击型按钮
 * 
 * @author zhangkai
 *
 */
public class ClickButton extends Button {

	/**
	 * 按钮类型
	 */
	private final String type = ButtonType.CLICK.value();

	/**
	 * 按钮的值
	 */
	private String key;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getType() {
		return type;
	}
}
