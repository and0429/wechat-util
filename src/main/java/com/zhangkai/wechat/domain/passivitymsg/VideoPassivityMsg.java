package com.zhangkai.wechat.domain.passivitymsg;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.zhangkai.wechat.domain.passivitymsg.subpassivitymsg.Video;
import com.zhangkai.wechat.enumuration.MessageType;

/**
 * 回复视频消息
 * 
 * @author zhangkai
 * 
 */
@XmlRootElement(name = "xml")
public class VideoPassivityMsg extends BasePassivityMsg {

	/**
	 * 消息类型
	 */
	private final String msgType = MessageType.VIDEO.value();

	/**
	 * 视频文件
	 */
	private Video video;

	@XmlElement(name = "MsgType")
	public String getMsgType() {
		return msgType;
	}

	@XmlElement(name = "Video")
	public Video getVideo() {
		return video;
	}

	public void setVideo(Video video) {
		this.video = video;
	}

}
