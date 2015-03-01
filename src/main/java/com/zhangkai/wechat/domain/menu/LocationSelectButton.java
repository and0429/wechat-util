package com.zhangkai.wechat.domain.menu;

import com.zhangkai.wechat.enumuration.ButtonType;

/**
 * 弹出地理位置选择器
 * 
 * @author zhangkai
 *
 */
public class LocationSelectButton extends ClickButton {

	/**
	 * 按钮类型
	 */
	private final String type = ButtonType.LOCATION_SELECT.value();

	public String getType() {
		return type;
	}

}
