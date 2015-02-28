package com.zhangkai.wechat.domain.customerservicemsg.subcustomerservicemsg;

/**
 * 客服-图片和语音对象
 * 
 * @author zhangkai
 * 
 */
public class ImageAndVoice {

	/**
	 * 多媒体Id
	 */
	private String media_id;

	/**
	 * 构造器
	 */
	public ImageAndVoice() {
		super();
	}

	/**
	 * 构造器
	 * 
	 * @param media_id
	 *            媒体Id
	 */
	public ImageAndVoice(String media_id) {
		super();
		this.media_id = media_id;
	}

	public String getMedia_id() {
		return media_id;
	}

	public void setMedia_id(String media_id) {
		this.media_id = media_id;
	}

}
