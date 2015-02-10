package com.zhangkai.wechat.domain.passivitymsg.subpassivitymsg;

import javax.xml.bind.annotation.XmlElement;

/**
 * 视频对象
 * 
 * @author zhangkai
 * 
 */
public class Music {

	/**
	 * 视频消息的标题
	 */
	private String title;

	/**
	 * 视频消息的描述
	 */
	private String description;

	/**
	 * 音乐链接
	 */
	private String musicUrl;

	/**
	 * 高质量音乐链接，WIFI环境优先使用该链接播放音乐
	 */
	private String hQMusicUrl;

	/**
	 * 缩略图的媒体id，通过上传多媒体文件，得到的id
	 */
	private String thumbMediaId;

	/**
	 * 构造器
	 * 
	 * @param title
	 *            视频消息的标题
	 * @param description
	 *            视频消息的描述
	 * @param musicUrl
	 *            音乐链接
	 * @param hQMusicUrl
	 *            高质量音乐链接，WIFI环境优先使用该链接播放音乐
	 * @param thumbMediaId
	 *            缩略图的媒体id，通过上传多媒体文件，得到的id
	 */
	public Music(String title, String description, String musicUrl, String hQMusicUrl, String thumbMediaId) {
		super();
		this.title = title;
		this.description = description;
		this.musicUrl = musicUrl;
		this.hQMusicUrl = hQMusicUrl;
		this.thumbMediaId = thumbMediaId;
	}

	/**
	 * 创建一个实例
	 */
	public Music() {
		super();
	}

	@XmlElement(name = "Title")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@XmlElement(name = "Description")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@XmlElement(name = "MusicUrl")
	public String getMusicUrl() {
		return musicUrl;
	}

	public void setMusicUrl(String musicUrl) {
		this.musicUrl = musicUrl;
	}

	@XmlElement(name = "HQMusicUrl")
	public String gethQMusicUrl() {
		return hQMusicUrl;
	}

	public void sethQMusicUrl(String hQMusicUrl) {
		this.hQMusicUrl = hQMusicUrl;
	}

	@XmlElement(name = "ThumbMediaId")
	public String getThumbMediaId() {
		return thumbMediaId;
	}

	public void setThumbMediaId(String thumbMediaId) {
		this.thumbMediaId = thumbMediaId;
	}

}
