package com.zhangkai.wechat.domain.passivitymsg;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.zhangkai.wechat.domain.passivitymsg.subpassivitymsg.Articles;

/**
 * 回复图文消息
 * 
 * @author zhangkai
 * 
 */
@XmlRootElement(name = "xml")
public class ArticlesPassivityMsg extends BasePassivityMsg {

	/**
	 * 消息类型
	 */
	private final String msgType = "news";

	/**
	 * 图文消息个数，限制为10条以内
	 */
	private String articleCount;

	/**
	 * 多条图文消息信息，默认第一个item为大图,注意，如果图文数超过10，则将会无响应
	 */
	private Articles articles;

	@XmlElement(name = "MsgType")
	public String getMsgType() {
		return msgType;
	}

	@XmlElement(name = "Articles")
	public Articles getArticles() {
		return articles;
	}

	public void setArticles(Articles articles) {
		this.articles = articles;
		this.articleCount = articles.getItem().size() + "";
	}

	@XmlElement(name = "ArticleCount")
	public String getArticleCount() {
		return articleCount;
	}

}
