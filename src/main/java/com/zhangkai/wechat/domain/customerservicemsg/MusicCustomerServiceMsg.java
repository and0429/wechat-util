package com.zhangkai.wechat.domain.customerservicemsg;

import com.zhangkai.wechat.domain.customerservicemsg.subcustomerservicemsg.Music;

/**
 * 客服-音乐消息
 * 
 * @author zhangkai
 * 
 */
public class MusicCustomerServiceMsg extends BaseCustomerServiceMsg {

	/**
	 * 消息类型
	 */
	private final String msgtype = "music";

	/**
	 * 音乐对象
	 */
	private Music music;

	public Music getMusic() {
		return music;
	}

	public void setMusic(Music music) {
		this.music = music;
	}

	public String getMsgtype() {
		return msgtype;
	}

}
