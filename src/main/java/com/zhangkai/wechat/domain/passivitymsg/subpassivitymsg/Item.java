package com.zhangkai.wechat.domain.passivitymsg.subpassivitymsg;

import javax.xml.bind.annotation.XmlElement;

/**
 * 
 * @author zhangkai
 * 
 */
public class Item {

	/**
	 * 图文消息标题
	 */
	private String title;

	/**
	 * 图文消息描述
	 */
	private String description;

	/**
	 * 图片链接，支持JPG、PNG格式，较好的效果为大图360*200，小图200*200
	 */
	private String picUrl;

	/**
	 * 点击图文消息跳转链接
	 */
	private String url;

	/**
	 * 构造器
	 * 
	 * @param title
	 *            图文消息标题
	 * @param description
	 *            图文消息描述
	 * @param picUrl
	 *            图片链接，支持JPG、PNG格式，较好的效果为大图360*200，小图200*200
	 * @param url
	 *            点击图文消息跳转链接
	 */
	public Item(String title, String description, String picUrl, String url) {
		super();
		this.title = title;
		this.description = description;
		this.picUrl = picUrl;
		this.url = url;
	}

	/**
	 * 创建实例
	 */
	public Item() {
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

	@XmlElement(name = "PicUrl")
	public String getPicUrl() {
		return picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	@XmlElement(name = "Url")
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
