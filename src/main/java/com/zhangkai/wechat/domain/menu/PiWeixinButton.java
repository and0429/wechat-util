package com.zhangkai.wechat.domain.menu;

import com.zhangkai.wechat.enumuration.ButtonType;

/**
 * 弹出微信相册发图器
 * 
 * @author zhangkai
 *
 */
public class PiWeixinButton extends ClickButton {

	/**
	 * 按钮类型
	 */
	private final String type = ButtonType.PIC_WEIXIN.value();

	public String getType() {
		return type;
	}

}
