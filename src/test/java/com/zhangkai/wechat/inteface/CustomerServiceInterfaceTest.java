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

}
