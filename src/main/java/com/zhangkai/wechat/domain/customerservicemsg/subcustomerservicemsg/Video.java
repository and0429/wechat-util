package com.zhangkai.wechat.domain.customerservicemsg.subcustomerservicemsg;

/**
 * 客服-视频消息对象
 * 
 * @author zhangkai
 * 
 */
public class Video {

	/**
	 * 视频的Id
	 */
	private String media_id;

	/**
	 * 视频的缩略图Id
	 */
	private String thumb_media_id;

	/**
	 * 视频的标题
	 */
	private String title;

	/**
	 * 视频的描述
	 */
	private String description;

	/**
	 * 构造器
	 * 
	 * @param media_id
	 *            视频的Id
	 * @param thumb_media_id
	 *            视频的缩略图Id
	 * @param title
	 *            视频的标题
	 * @param description
	 *            视频的描述
	 */
	public Video(String media_id, String thumb_media_id, String title, String description) {
		super();
		this.media_id = media_id;
		this.thumb_media_id = thumb_media_id;
		this.title = title;
		this.description = description;
	}

	/**
	 * 构造器
	 */
	public Video() {
		super();
	}

	public String getMedia_id() {
		return media_id;
	}

	public void setMedia_id(String media_id) {
		this.media_id = media_id;
	}

	public String getThumb_media_id() {
		return thumb_media_id;
	}

	public void setThumb_media_id(String thumb_media_id) {
		this.thumb_media_id = thumb_media_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
