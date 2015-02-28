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
import com.zhangkai.wechat.domain.passivitymsg.subpassivitymsg.ImageAndVoice;
import com.zhangkai.wechat.domain.passivitymsg.subpassivitymsg.Item;
import com.zhangkai.wechat.domain.passivitymsg.subpassivitymsg.Music;
import com.zhangkai.wechat.domain.passivitymsg.subpassivitymsg.Video;

public class PassivityMsgInterfaceTest {

	private static PassivityMsgInterface pm = new PassivityMsgInterface();
	private static Logger logger = Logger.getLogger(PassivityMsgInterfaceTest.class);

	@Test
	public void testPassivityMsg2xmlTextPassivityMsg() throws JAXBException {

		TextPassivityMsg obj = new TextPassivityMsg();
		obj.setContent("content");
		obj.setFromUserName("<fromUserName>");
		obj.setToUserName("toUserName");

		String result = pm.passivityMsg2xml(obj);

		logger.info("\n" + result);

	}

	@Test
	public void testPassivityMsg2xmlImagePassivityMsg() throws JAXBException {
		ImagePassivityMsg obj = new ImagePassivityMsg();

		obj.setFromUserName("<fromUserName>");
		obj.setToUserName("toUserName");
		ImageAndVoice image = new ImageAndVoice();

		image.setMediaId("mediaId");

		obj.setImage(image);

		String result = pm.passivityMsg2xml(obj);

		logger.info("\n" + result);
	}

	@Test
	public void testPassivityMsg2xmlVoicePassivityMsg() throws JAXBException {
		VoicePassivityMsg obj = new VoicePassivityMsg();

		obj.setFromUserName("<fromUserName>");
		obj.setToUserName("toUserName");
		ImageAndVoice voice = new ImageAndVoice("mediaId");

		obj.setVoice(voice);

		String result = pm.passivityMsg2xml(obj);

		logger.info("\n" + result);
	}

	@Test
	public void testPassivityMsg2xmlVideoPassivityMsg() throws JAXBException {
		VideoPassivityMsg obj = new VideoPassivityMsg();

		obj.setFromUserName("<fromUserName>");
		obj.setToUserName("toUserName");

		Video video = new Video();
		video.setDescription("description");
		video.setMediaId("mediaId");
		video.setTitle("title");

		obj.setVideo(video);

		String result = pm.passivityMsg2xml(obj);

		logger.info("\n" + result);

	}

	@Test
	public void testPassivityMsg2xmlMusicPassivityMsg() throws JAXBException {

		MusicPassivityMsg obj = new MusicPassivityMsg();

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

		obj.setArticles(articles);

		String result = pm.passivityMsg2xml(obj);

		logger.info("\n" + result);
	}

}
