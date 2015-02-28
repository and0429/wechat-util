package com.zhangkai.wechat.domain.passivitymsg;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 回复文本消息对象
 * 
 * @author zhangkai
 * 
 */
@XmlRootElement(name = "xml")
public class TextPassivityMsg extends BasePassivityMsg {

	/**
	 * 消息类型
	 */
	private final String msgType = "text";

	/**
	 * 消息内容
	 */
	private String content;

	@XmlElement(name = "MsgType")
	public String getMsgType() {
		return msgType;
	}

	@XmlElement(name = "Content")
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
