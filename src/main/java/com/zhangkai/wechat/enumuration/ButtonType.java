package com.zhangkai.wechat.enumuration;

/**
 * 自定义按钮
 * 
 * @author zhangkai
 *
 */
public enum ButtonType {

	/**
	 * 
	 */
	CLICK("click"),

	/**
	 * 
	 */
	VIEW("view"), 
	
	/**
	 * 
	 */
	SCANCODE_PUSH("scancode_push"), 
	
	/**
	 * 
	 */
	SCANCODE_WAITMSG("scancode_waitmsg"), 
	
	/**
	 * 
	 */
	PIC_SYSPHOTO("pic_sysphoto"),
	
	/**
	 * 
	 */
	PIC_PHOTO_OR_ALBUM("pic_photo_or_album"),
	
	/**
	 * 
	 */
	PIC_WEIXIN("pic_weixin"),
	
	/**
	 * 
	 */
	LOCATION_SELECT("location_select")
	;

	private String type;

	private ButtonType(String type) {
		this.type = type;
	}

	public String value() {
		return type;
	}
}
