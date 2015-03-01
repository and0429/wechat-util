package com.zhangkai.wechat.domain.passivitymsg;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.zhangkai.wechat.domain.passivitymsg.subpassivitymsg.Music;
import com.zhangkai.wechat.enumuration.MessageType;

/**
 * 回复音乐消息
 * 
 * @author zhangkai
 * 
 */
@XmlRootElement(name = "xml")
public class MusicPassivityMsg extends BasePassivityMsg {

	/**
	 * 消息类型
	 */
	private final String msgType = MessageType.MUSIC.value();

	private Music music;

	@XmlElement(name = "MsgType")
	public String getMsgType() {
		return msgType;
	}

	@XmlElement(name = "Music")
	public Music getMusic() {
		return music;
	}

	public void setMusic(Music music) {
		this.music = music;
	}

}
