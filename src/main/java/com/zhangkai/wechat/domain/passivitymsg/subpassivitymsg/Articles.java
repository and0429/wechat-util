package com.zhangkai.wechat.domain.passivitymsg.subpassivitymsg;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

/**
 * 多条图文消息信息，默认第一个item为大图,注意，如果图文数超过10，则将会无响应
 * 
 * @author zhangkai
 * 
 */
public class Articles {

	private List<Item> item = new ArrayList<Item>();

	@XmlElement
	public List<Item> getItem() {
		return item;
	}
}
