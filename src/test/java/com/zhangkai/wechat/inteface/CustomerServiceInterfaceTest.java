package com.zhangkai.wechat.inteface;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.Test;

public class CustomerServiceInterfaceTest {

	private static String token;
	private static CustomerServiceInterface csi;
	private static String touser = "oGr-Vjp_scv7ey3NwUAYXdoKQpWw";

	@BeforeClass
	public static void before() throws IOException {

		String appid = "wxb6e1137cb491b9eb";
		String secret = "cd802bc6bc27ce6f996d813b797b4dcf";

		AccessTokenInterface inteface = new AccessTokenInterface(appid, secret);
		token = inteface.getAccessToken().getAccess_token();
		csi = new CustomerServiceInterface();
	}

	@Test
	public void testSendTextCustomerServiceMsg() throws IOException {

		csi.sendTextCustomerServiceMsg(token, touser, "hello, 我是张凯");

	}

	@Test
	public void testSendImageCustomerServiceMsg() throws IOException {

		String mediaId = "onGIIjjLV6pgyEHYGfCWa0Oryp0eGF8hz75YiLoYx7oIBp83ypOLSz3sTHuWACeK";
		csi.sendImageCustomerServiceMsg(token, touser, mediaId);

	}

	@Test
	public void testSendVoiceCustomerServiceMsg() throws IOException {

		String mediaId = "onGIIjjLV6pgyEHYGfCWa0Oryp0eGF8hz75YiLoYx7oIBp83ypOLSz3sTHuWACeK";
		csi.sendVoiceCustomerServiceMsg(token, touser, mediaId);

	}

	@Test
	public void testSendVideoCustomerServiceMsg() throws IOException {

		String mediaId = "onGIIjjLV6pgyEHYGfCWa0Oryp0eGF8hz75YiLoYx7oIBp83ypOLSz3sTHuWACeK";
		csi.sendVideoCustomerServiceMsg(token, touser, mediaId, mediaId, "标题", "描述");
	}

	
	@Test
	public void testSendMusicCustomerServiceMsg() throws IOException {

		String mediaId = "onGIIjjLV6pgyEHYGfCWa0Oryp0eGF8hz75YiLoYx7oIBp83ypOLSz3sTHuWACeK";
		csi.sendMusicCustomerServiceMsg(token, touser, "标题", "描述", "http://yinyueshiting.baidu.com/data2/music/137081688/137078183169200128.mp3?xcode=7c23b6a67eae038e611c81191b7921b10b86fc0e5b731aec", "http://yinyueshiting.baidu.com/data2/music/137081688/137078183169200128.mp3?xcode=7c23b6a67eae038e611c81191b7921b10b86fc0e5b731aec", mediaId);
	}
	
}
