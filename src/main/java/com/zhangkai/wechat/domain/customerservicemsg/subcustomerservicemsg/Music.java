package com.zhangkai.wechat.domain.customerservicemsg.subcustomerservicemsg;

/**
 * 客服-音乐消息对象
 * 
 * @author zhangkai
 * 
 */
public class Music {

	/**
	 * 音乐消息标题
	 */
	private String title;

	/**
	 * 音乐消息描述
	 */
	private String description;

	/**
	 * 音乐的连接
	 */
	private String musicurl;

	/**
	 * 高清音乐连接
	 */
	private String hqmusicurl;

	/**
	 * 缩略题Id
	 */
	private String thumb_media_id;

	/**
	 * 构造器
	 * 
	 * @param title
	 *            音乐消息标题
	 * @param description
	 *            音乐消息描述
	 * @param musicurl
	 *            音乐的连接
	 * @param hqmusicurl
	 *            高清音乐连接
	 * @param thumb_media_id
	 *            缩略题Id
	 */
	public Music(String title, String description, String musicurl, String hqmusicurl, String thumb_media_id) {
		super();
		this.title = title;
		this.description = description;
		this.musicurl = musicurl;
		this.hqmusicurl = hqmusicurl;
		this.thumb_media_id = thumb_media_id;
	}

	/**
	 * 构造器
	 */
	public Music() {
		super();
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

	public String getMusicurl() {
		return musicurl;
	}

	public void setMusicurl(String musicurl) {
		this.musicurl = musicurl;
	}

	public String getHqmusicurl() {
		return hqmusicurl;
	}

	public void setHqmusicurl(String hqmusicurl) {
		this.hqmusicurl = hqmusicurl;
	}

	public String getThumb_media_id() {
		return thumb_media_id;
	}

	public void setThumb_media_id(String thumb_media_id) {
		this.thumb_media_id = thumb_media_id;
	}

}
