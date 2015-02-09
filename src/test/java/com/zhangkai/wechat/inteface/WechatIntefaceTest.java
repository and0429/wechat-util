package com.zhangkai.wechat.inteface;

import java.io.File;
import java.io.IOException;
import java.util.List;

import junit.framework.Assert;

import org.apache.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;

import com.zhangkai.wechat.domain.UploadResult;
import com.zhangkai.wechat.domain.WechatServiceIp;
import com.zhangkai.wechat.util.FileType;

public class WechatIntefaceTest {

	private static String token;
	private static Logger logger = Logger.getLogger(WechatIntefaceTest.class);
	private static WechatInteface wif;

	@BeforeClass
	public static void before() throws IOException {

		String appid = "wxb6e1137cb491b9eb";
		String secret = "cd802bc6bc27ce6f996d813b797b4dcf";

		AccessTokenInterface inteface = new AccessTokenInterface(appid, secret);
		token = inteface.getAccessToken().getAccess_token();
		wif = new WechatInteface();
	}

	@Test
	public void testGetIp() throws IOException {

		WechatServiceIp ips = wif.getIp(token);

		List<String> iplist = ips.getIp_list();

		for (String ip : iplist) {
			logger.info(ip);
		}
	}

	@Test
	public void testEnmu() {

		Assert.assertEquals("image", FileType.IMAGE.getValue());

	}

	@Test
	public void testUpload() throws IOException {

		File file = new File("C:\\Users\\zhangkai\\Desktop\\Photo20150210000216.jpg");

		UploadResult result = wif.upload(token, file, FileType.IMAGE);
		
		
		
		Assert.assertNotNull(result);
		if (result != null) {
			logger.info(result.getCreated_at());
			logger.info(result.getMedia_id());
			logger.info(result.getType());
			
			Assert.assertEquals("image", result.getType());			
		}

	}

}
