package com.zhangkai.wechat.domain.menu;

import com.zhangkai.wechat.enumuration.ButtonType;

/**
 * 扫码推事件
 * 
 * @author zhangkai
 *
 */
public class ScanCodePushButton extends ClickButton {

	/**
	 * 类型
	 */
	private final String type = ButtonType.SCANCODE_PUSH.value();

	@Override
	public String getType() {
		return type;
	}

}
