package com.zhangkai.wechat.domain.passivitymsg;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.zhangkai.wechat.domain.passivitymsg.subpassivitymsg.ImageAndVoice;

/**
 * 回复图片消息
 * 
 * @author zhangkai
 * 
 */
@XmlRootElement(name = "xml")
public class ImagePassivityMsg extends BasePassivityMsg {

	/**
	 * 消息类型
	 */
	private final String msgType = "image";

	/**
	 * 图片对象
	 */
	private ImageAndVoice image;

	@XmlElement(name = "MsgType")
	public String getMsgType() {
		return msgType;
	}

	@XmlElement(name = "Image")
	public ImageAndVoice getImage() {
		return image;
	}

	public void setImage(ImageAndVoice image) {
		this.image = image;
	}

}
