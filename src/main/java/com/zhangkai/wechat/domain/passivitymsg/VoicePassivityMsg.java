package com.zhangkai.wechat.domain.passivitymsg;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.zhangkai.wechat.domain.passivitymsg.subpassivitymsg.ImageAndVoice;
import com.zhangkai.wechat.enumuration.MessageType;

/**
 * 回复语音消息
 * 
 * @author zhangkai
 * 
 */
@XmlRootElement(name = "xml")
public class VoicePassivityMsg extends BasePassivityMsg {

	/**
	 * 消息类型
	 */
	private final String msgType = MessageType.VOICE.value();

	/**
	 * 语音
	 */
	private ImageAndVoice voice;

	@XmlElement(name = "MsgType")
	public String getMsgType() {
		return msgType;
	}

	@XmlElement(name = "Voice")
	public ImageAndVoice getVoice() {
		return voice;
	}

	public void setVoice(ImageAndVoice voice) {
		this.voice = voice;
	}

}
