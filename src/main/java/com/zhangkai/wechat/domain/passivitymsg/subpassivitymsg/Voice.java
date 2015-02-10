package com.zhangkai.wechat.domain.passivitymsg.subpassivitymsg;

import javax.xml.bind.annotation.XmlElement;

/**
 * 语音类
 * 
 * @author zhangkai
 * 
 */
public class Voice {

	/**
	 * 通过上传多媒体文件，得到的id。
	 */
	private String mediaId;

	@XmlElement(name = "MediaId")
	public String getMediaId() {
		return mediaId;
	}

	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}

}
