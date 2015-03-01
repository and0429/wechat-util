package com.zhangkai.wechat.enumuration;

/**
 * 消息类型
 * 
 * @author zhangkai
 *
 */
public enum MessageType {

	Text("text"), IMAGE("image"), MUSIC("music"), NEWS("news"), VIDEO("video"), VOICE("voice");

	private String type;

	private MessageType(String type) {
		this.type = type;
	}

	public String value() {
		return type;
	}

}
