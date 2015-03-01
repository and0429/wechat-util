package com.zhangkai.wechat.domain.menu;

import com.zhangkai.wechat.enumuration.ButtonType;

/**
 * 弹出拍照或者相册发图
 * 
 * @author zhangkai
 *
 */
public class PicPhotoOrAlbumButton extends ClickButton {

	/**
	 * 按钮类型
	 */
	private final String type = ButtonType.PIC_PHOTO_OR_ALBUM.value();

	public String getType() {
		return type;
	}

}
