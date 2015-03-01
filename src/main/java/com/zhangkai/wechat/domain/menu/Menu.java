package com.zhangkai.wechat.domain.menu;

import java.util.ArrayList;
import java.util.List;

/**
 * 自定义菜单对象
 * 
 * @author zhangkai
 *
 */
public class Menu {

	/**
	 * 按钮集合
	 */
	private List<Button> button = new ArrayList<Button>();

	public List<Button> getButton() {
		return button;
	}
}
