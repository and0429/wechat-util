package com.zhangkai.wechat.domain.customerservicemsg.subcustomerservicemsg;

/**
 * 客服-图文对象
 * 
 * @author zhangkai
 *
 */
public class Article {

	/**
	 * 标题
	 */
	private String title;

	/**
	 * 描述
	 */
	private String description;

	/**
	 * 连接到地址
	 */
	private String url;

	/**
	 * 图片地址
	 */
	private String picurl;

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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getPicurl() {
		return picurl;
	}

	public void setPicurl(String picurl) {
		this.picurl = picurl;
	}

	/**
	 * 创建一个默认的实例
	 * 
	 */
	public Article() {
		super();
	}

	/**
	 * 用参数创建一个实例
	 * 
	 * @param title
	 *            标题
	 * @param description
	 *            描述
	 * @param url
	 *            连接地址
	 * @param picurl
	 *            图片地址
	 */
	public Article(String title, String description, String url, String picurl) {
		super();
		this.title = title;
		this.description = description;
		this.url = url;
		this.picurl = picurl;
	}

	/**
	 * 构造器
	 * 
	 * @param description
	 *            内容描述
	 */
	public Article(String title) {
		super();
		this.title = title;
	}

}
