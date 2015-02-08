package com.zhangkai.wechat.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConfigurationTest {

	@Test
	public void testGetProperty() {
		
		String expected = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=APPID&secret=APPSECRET";
		String actual = Configuration.getProperty("getToken");
		assertEquals(expected, actual);
	}

}
