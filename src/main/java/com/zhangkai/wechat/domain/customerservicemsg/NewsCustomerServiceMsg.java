package com.zhangkai.wechat.domain.customerservicemsg;

import com.zhangkai.wechat.domain.customerservicemsg.subcustomerservicemsg.Articles;



/**
 * 客服-图文消息
 * 
 * @author zhangkai
 */
public class NewsCustomerServiceMsg extends BaseCustomerServiceMsg {

	/**
	 * 消息类型
	 */
	private final String msgtype = "news";

	/**
	 * 图文消息对象
	 */
	private Articles news;

	public Articles getNews() {
		return news;
	}

	public void setNews(Articles news) {
		this.news = news;
	}

	public String getMsgtype() {
		return msgtype;
	}

}
