package com.zhangkai.wechat.inteface;

import java.io.IOException;

import junit.framework.Assert;

import org.junit.Test;

import com.zhangkai.wechat.domain.AccessToken;

public class AccessTokenInterfaceTest {

	@Test
	public void testGetAccessToken() throws IOException {

		String appid = "wxb6e1137cb491b9eb";
		String secret = "cd802bc6bc27ce6f996d813b797b4dcf";

		AccessTokenInterface inteface = new AccessTokenInterface(appid, secret);

		AccessToken at = inteface.getAccessToken();

		Assert.assertNotNull(at);
		Assert.assertEquals("7200", at.getExpires_in());
	}

}
