package com.zhangkai.wechat.util;

/**
 * 上传文件类型的枚举
 * 
 * @author zhangkai
 *
 */
public enum FileType {

	/**
	 * 缩略图
	 */
	THUMB("thumb"),

	/**
	 * 视频
	 */
	VIDEO("video"),

	/**
	 * 声音
	 */
	VOICE("voice"),

	/**
	 * 图片
	 */
	IMAGE("image");

	private String value;

	private FileType(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
