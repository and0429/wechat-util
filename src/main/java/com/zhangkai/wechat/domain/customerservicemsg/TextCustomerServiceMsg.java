package com.zhangkai.wechat.domain.customerservicemsg;

import com.zhangkai.wechat.domain.customerservicemsg.subcustomerservicemsg.Text;
import com.zhangkai.wechat.enumuration.MessageType;

/**
 * 文本客服消息
 * 
 * @author zhangkai
 * 
 */
public class TextCustomerServiceMsg extends BaseCustomerServiceMsg {

	/**
	 * 类型。
	 */
	private final String msgtype = MessageType.Text.value();

	/**
	 * 文字消息对象
	 */
	private Text text;

	public Text getText() {
		return text;
	}

	public void setText(Text text) {
		this.text = text;
	}

	public String getMsgtype() {
		return msgtype;
	}

}
