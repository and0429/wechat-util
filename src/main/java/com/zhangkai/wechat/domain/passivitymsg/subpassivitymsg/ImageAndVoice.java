package com.zhangkai.wechat.domain.passivitymsg.subpassivitymsg;

import javax.xml.bind.annotation.XmlElement;

/**
 * 图片类
 * 
 * @author zhangkai
 * 
 */
public class ImageAndVoice {

	/**
	 * 图片id,通过上传多媒体文件，得到的id。
	 */
	private String mediaId;

	/**
	 * 构造器
	 * 
	 * @param mediaId
	 *            图片id,通过上传多媒体文件，得到的id。
	 */
	public ImageAndVoice(String mediaId) {
		this.mediaId = mediaId;
	}

	/**
	 * 创建一个实例
	 */
	public ImageAndVoice() {
		super();
	}

	@XmlElement(name = "MediaId")
	public String getMediaId() {
		return mediaId;
	}

	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}

}
