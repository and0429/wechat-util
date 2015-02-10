package com.zhangkai.wechat.util;

import javax.xml.bind.JAXBException;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.zhangkai.wechat.domain.passivitymsg.ImagePassivityMsg;
import com.zhangkai.wechat.domain.passivitymsg.TextPassivityMsg;
import com.zhangkai.wechat.domain.passivitymsg.VoicePassivityMsg;
import com.zhangkai.wechat.domain.passivitymsg.subpassivitymsg.Image;
import com.zhangkai.wechat.domain.passivitymsg.subpassivitymsg.Voice;

public class ObjectFormatTest {

	private static Logger logger = Logger.getLogger(ObjectFormatTest.class);

	@Test
	public void testTextPassivityMsg2xml() throws JAXBException {

		TextPassivityMsg obj = new TextPassivityMsg();
		obj.setContent("content");
		obj.setCreateTime("123456789");
		obj.setFromUserName("<fromUserName>");
		obj.setToUserName("toUserName");

		String result = ObjectFormat.newInstance().object2xml(obj, "utf-8");

		logger.info("\n" + result);

	}

	@Test
	public void testImagePassivityMsg2xml() throws JAXBException {

		ImagePassivityMsg obj = new ImagePassivityMsg();

		obj.setCreateTime("123456789");
		obj.setFromUserName("<fromUserName>");
		obj.setToUserName("toUserName");
		Image image = new Image();

		image.setMediaId("mediaId");

		obj.setImage(image);

		String result = ObjectFormat.newInstance().object2xml(obj, "utf-8");

		logger.info("\n" + result);

	}

	@Test
	public void testVoicePassivityMsg2xml() throws JAXBException {

		VoicePassivityMsg obj = new VoicePassivityMsg();

		obj.setCreateTime("123456789");
		obj.setFromUserName("<fromUserName>");
		obj.setToUserName("toUserName");
		Voice voice = new Voice();

		voice.setMediaId("mediaId");

		obj.setVoice(voice);

		String result = ObjectFormat.newInstance().object2xml(obj, "utf-8");

		logger.info("\n" + result);

	}

}
