package com.zhangkai.wechat.domain.customerservicemsg;

/**
 * 客服消息基础对象
 * 
 * @author zhangkai
 *
 */
public abstract class BaseCustomerServiceMsg {

	/**
	 * 接受消息的微信
	 */
	private String touser;

	public String getTouser() {
		return touser;
	}

	public void setTouser(String touser) {
		this.touser = touser;
	}

}
