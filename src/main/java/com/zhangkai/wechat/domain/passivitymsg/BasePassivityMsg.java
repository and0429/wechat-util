package com.zhangkai.wechat.domain.passivitymsg;

import javax.xml.bind.annotation.XmlElement;

/**
 * 被动回复用户消息的基础类。所有类型的被动回复消息都从此类继承
 * 
 * @author zhangkai
 * 
 */
public abstract class BasePassivityMsg {

	/**
	 * 接收方帐号（收到的OpenID）
	 */
	private String toUserName;

	/**
	 * 开发者微信号
	 */
	private String fromUserName;

	/**
	 * 消息创建时间 （整型）
	 */
	private String createTime;

	@XmlElement(name = "ToUserName")
	public String getToUserName() {
		return toUserName;
	}

	public void setToUserName(String toUserName) {
		this.toUserName = toUserName;
	}

	@XmlElement(name = "FromUserName")
	public String getFromUserName() {
		return fromUserName;
	}

	public void setFromUserName(String fromUserName) {
		this.fromUserName = fromUserName;
	}

	@XmlElement(name = "CreateTime")
	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

}
