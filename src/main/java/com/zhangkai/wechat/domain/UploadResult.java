package com.zhangkai.wechat.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 上传文件后的结果
 * 
 * @author zhangkai
 *
 */
public class UploadResult {

	/**
	 * 媒体文件类型，分别有图片（image）、语音（voice）、视频（video）和缩略图（thumb，主要用于视频与音乐格式的缩略图）
	 */
	private String type;

	/**
	 * 媒体文件上传后，获取时的唯一标识
	 */
	private String media_id;

	/**
	 * 媒体文件上传时间戳
	 */
	private String created_at;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMedia_id() {
		return media_id;
	}

	public void setMedia_id(String media_id) {
		this.media_id = media_id;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			this.created_at = sf.format(new Date(Long.parseLong(created_at + "000")));
		} catch (NumberFormatException e) {
			this.created_at = null;
		}
	}

}
