package com.zhangkai.wechat.domain.menu;

import com.zhangkai.wechat.enumuration.ButtonType;

/**
 * 弹出系统拍照发图
 * 
 * @author zhangkai
 *
 */
public class PicSysPhotoButton extends ClickButton {

	/**
	 * 按钮类型
	 */
	private final String type = ButtonType.PIC_SYSPHOTO.value();

	public String getType() {
		return type;
	}

}
