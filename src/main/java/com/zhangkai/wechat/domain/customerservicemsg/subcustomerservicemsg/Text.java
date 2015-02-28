package com.zhangkai.wechat.domain.customerservicemsg.subcustomerservicemsg;

/**
 * 文本消息
 * 
 * @author zhangkai
 * 
 */
public class Text {

	/**
	 * 文本内容
	 */
	private String content;

	/**
	 * 构造器
	 */
	public Text() {
		super();
	}

	/**
	 * 构造器
	 * 
	 * @param content
	 *            文本内容
	 */
	public Text(String content) {
		super();
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
