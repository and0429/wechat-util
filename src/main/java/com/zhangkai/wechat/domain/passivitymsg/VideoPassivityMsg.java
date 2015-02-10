package com.zhangkai.wechat.domain.passivitymsg;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.zhangkai.wechat.domain.passivitymsg.subpassivitymsg.Video;

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
	private String msgType = "video";

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
