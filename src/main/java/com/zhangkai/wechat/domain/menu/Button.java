package com.zhangkai.wechat.domain.menu;

import java.util.ArrayList;
import java.util.List;

/**
 * 按钮的基础类
 * 
 * @author zhangkai
 *
 */
public class Button {

	/**
	 * 按钮的名字
	 */
	private String name;

	/**
	 * 子按钮 集合
	 */
	private List<Button> sub_button = new ArrayList<Button>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Button> getSub_button() {
		return sub_button;
	}
}
