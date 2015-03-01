package com.zhangkai.wechat.domain.menu;

import com.zhangkai.wechat.enumuration.ButtonType;

/**
 * 扫码推事件且弹出“消息接收中”提示框
 * 
 * @author zhangkai
 *
 */
public class ScanCodeWaitMsgButton extends ClickButton {

	/**
	 * 按钮类型
	 */
	private final String type = ButtonType.SCANCODE_WAITMSG.value();

	@Override
	public String getType() {
		return type;
	}
}
