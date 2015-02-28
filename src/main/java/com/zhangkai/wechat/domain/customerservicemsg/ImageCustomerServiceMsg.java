package com.zhangkai.wechat.domain.customerservicemsg;

import com.zhangkai.wechat.domain.customerservicemsg.subcustomerservicemsg.ImageAndVoice;

/**
 * 客服-图片消息
 * 
 * @author zhangkai
 * 
 */
public class ImageCustomerServiceMsg extends BaseCustomerServiceMsg {

	/**
	 * 消息类型
	 */
	private final String msgtype = "image";

	/**
	 * image Object
	 */
	private ImageAndVoice image;

	public String getMsgtype() {
		return msgtype;
	}

	public ImageAndVoice getImage() {
		return image;
	}

	public void setImage(ImageAndVoice image) {
		this.image = image;
	}

}
