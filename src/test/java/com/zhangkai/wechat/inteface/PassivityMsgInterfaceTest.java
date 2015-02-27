package com.zhangkai.wechat.inteface;

import java.util.List;

import javax.xml.bind.JAXBException;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.zhangkai.wechat.domain.passivitymsg.ArticlesPassivityMsg;
import com.zhangkai.wechat.domain.passivitymsg.ImagePassivityMsg;
import com.zhangkai.wechat.domain.passivitymsg.MusicPassivityMsg;
import com.zhangkai.wechat.domain.passivitymsg.TextPassivityMsg;
import com.zhangkai.wechat.domain.passivitymsg.VideoPassivityMsg;
import com.zhangkai.wechat.domain.passivitymsg.VoicePassivityMsg;
import com.zhangkai.wechat.domain.passivitymsg.subpassivitymsg.Articles;
import com.zhangkai.wechat.domain.passivitymsg.subpassivitymsg.Image;
import com.zhangkai.wechat.domain.passivitymsg.subpassivitymsg.Item;
import com.zhangkai.wechat.domain.passivitymsg.subpassivitymsg.Music;
import com.zhangkai.wechat.domain.passivitymsg.subpassivitymsg.Video;
import com.zhangkai.wechat.domain.passivitymsg.subpassivitymsg.Voice;

public class PassivityMsgInterfaceTest {

	private static PassivityMsgInterface pm = new PassivityMsgInterface();
	private static Logger logger = Logger.getLogger(PassivityMsgInterfaceTest.class);

	@Test
	public void testPassivityMsg2xmlTextPassivityMsg() throws JAXBException {

		TextPassivityMsg obj = new TextPassivityMsg();
		obj.setContent("content");
		obj.setCreateTime("123456789");
		obj.setFromUserName("<fromUserName>");
		obj.setToUserName("toUserName");

		String result = pm.passivityMsg2xml(obj);

		logger.info("\n" + result);

	}

	@Test
	public void testPassivityMsg2xmlImagePassivityMsg() throws JAXBException {
		ImagePassivityMsg obj = new ImagePassivityMsg();

		obj.setCreateTime("123456789");
		obj.setFromUserName("<fromUserName>");
		obj.setToUserName("toUserName");
		Image image = new Image();

		image.setMediaId("mediaId");

		obj.setImage(image);

		String result = pm.passivityMsg2xml(obj);

		logger.info("\n" + result);
	}

	@Test
	public void testPassivityMsg2xmlVoicePassivityMsg() throws JAXBException {
		VoicePassivityMsg obj = new VoicePassivityMsg();

		obj.setCreateTime("123456789");
		obj.setFromUserName("<fromUserName>");
		obj.setToUserName("toUserName");
		Voice voice = new Voice();

		voice.setMediaId("mediaId");

		obj.setVoice(voice);

		String result = pm.passivityMsg2xml(obj);

		logger.info("\n" + result);
	}

	@Test
	public void testPassivityMsg2xmlVideoPassivityMsg() throws JAXBException {
		VideoPassivityMsg obj = new VideoPassivityMsg();

		obj.setCreateTime("123456789");
		obj.setFromUserName("<fromUserName>");
		obj.setToUserName("toUserName");

		Video video = new Video();
		video.setDescription("description");
		video.setMediaId("mediaId");
		video.setTitle("title");

		obj.setVideo(video);

		String result =  pm.passivityMsg2xml(obj);

		logger.info("\n" + result);

	}

	@Test
	public void testPassivityMsg2xmlMusicPassivityMsg() throws JAXBException {

		MusicPassivityMsg obj = new MusicPassivityMsg();

		obj.setCreateTime("123456789");
		obj.setFromUserName("<fromUserName>");
		obj.setToUserName("toUserName");

		Music music = new Music();

		music.setDescription("description");
		music.sethQMusicUrl("hQMusicUrl");
		music.setMusicUrl("musicUrl");
		music.setThumbMediaId("thumbMediaId");
		music.setTitle("title");

		obj.setMusic(music);

		String result = pm.passivityMsg2xml(obj);

		logger.info("\n" + result);

	}

	@Test
	public void testPassivityMsg2xmlArticlesPassivityMsg() throws JAXBException {
		ArticlesPassivityMsg obj = new ArticlesPassivityMsg();

		obj.setCreateTime("123456789");
		obj.setFromUserName("<fromUserName>");
		obj.setToUserName("toUserName");

		Articles articles = new Articles();

		List<Item> item = articles.getItem();

		Item item1 = new Item();
		item1.setDescription("description");
		item1.setPicUrl("picUrl");
		item1.setTitle("title");
		item1.setUrl("url");

		Item item2 = new Item();
		item2.setDescription("description");
		item2.setPicUrl("picUrl");
		item2.setTitle("title");
		item2.setUrl("url");

		Item item3 = new Item();
		item3.setDescription("description");
		item3.setPicUrl("picUrl");
		item3.setTitle("title");
		item3.setUrl("url");

		item.add(item1);
		item.add(item2);
		item.add(item3);

		articles.setItem(item);

		obj.setArticles(articles);

		String result = pm.passivityMsg2xml(obj);

		logger.info("\n" + result);
	}

}