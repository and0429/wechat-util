package com.zhangkai.wechat.domain.customerservicemsg.subcustomerservicemsg;

import java.util.ArrayList;
import java.util.List;

/**
 * 客服-图文消息对象集合
 * 
 * @author zhangkai
 *
 */
public class Articles {

	/**
	 * 图文对象集合
	 */
	private List<Article> articles = new ArrayList<Article>();

	public List<Article> getArticles() {
		return articles;
	}
}
