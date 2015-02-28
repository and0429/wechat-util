package com.zhangkai.wechat.domain.customerservicemsg;

import com.zhangkai.wechat.domain.customerservicemsg.subcustomerservicemsg.Video;

/**
 * 客服-视频消息
 * 
 * @author zhangkai
 * 
 */
public class VideoCustomerServiceMsg extends BaseCustomerServiceMsg {

	/**
	 * 消息类型
	 */
	private final String msgtype = "video";

	/**
	 * 视频对象
	 */
	private Video video;

	public Video getVideo() {
		return video;
	}

	public void setVideo(Video video) {
		this.video = video;
	}

	public String getMsgtype() {
		return msgtype;
	}
}
