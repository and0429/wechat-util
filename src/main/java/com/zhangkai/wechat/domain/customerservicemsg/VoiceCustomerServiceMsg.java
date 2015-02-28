package com.zhangkai.wechat.domain.customerservicemsg;

import com.zhangkai.wechat.domain.customerservicemsg.subcustomerservicemsg.ImageAndVoice;

/**
 * 
 * @author zhangkai
 * 
 */
public class VoiceCustomerServiceMsg extends BaseCustomerServiceMsg {

	/**
	 * 消息类型为语音
	 */
	private final String msgtype = "voice";

	/**
	 * 语音对象
	 */
	private ImageAndVoice voice;

	public ImageAndVoice getVoice() {
		return voice;
	}

	public void setVoice(ImageAndVoice voice) {
		this.voice = voice;
	}

	public String getMsgtype() {
		return msgtype;
	}

}
