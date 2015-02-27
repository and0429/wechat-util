package com.zhangkai.wechat.inteface;

import javax.xml.bind.JAXBException;

import com.zhangkai.wechat.domain.passivitymsg.ArticlesPassivityMsg;
import com.zhangkai.wechat.domain.passivitymsg.ImagePassivityMsg;
import com.zhangkai.wechat.domain.passivitymsg.MusicPassivityMsg;
import com.zhangkai.wechat.domain.passivitymsg.TextPassivityMsg;
import com.zhangkai.wechat.domain.passivitymsg.VideoPassivityMsg;
import com.zhangkai.wechat.domain.passivitymsg.VoicePassivityMsg;
import com.zhangkai.wechat.util.ObjectFormat;

/**
 * 被动相应接口
 * 
 * @author zhangkai
 * 
 */
public class PassivityMsgInterface {

	public static final String CHARSET = "utf-8";

	/**
	 * 将被动文本消息转换成xml格式的字符串
	 * 
	 * @param textPassivityMsg
	 *            被动文本消息对象
	 * @return xml格式的字符串
	 * @throws JAXBException
	 */
	public String passivityMsg2xml(TextPassivityMsg textPassivityMsg) throws JAXBException {
		return ObjectFormat.newInstance().object2xml(textPassivityMsg, CHARSET);
	}

	/**
	 * 将被动图片消息转换成xml格式的字符串
	 * 
	 * @param imagePassivityMsg
	 *            被动图片消息对象
	 * @return xml格式的字符串
	 * @throws JAXBException
	 */
	public String passivityMsg2xml(ImagePassivityMsg imagePassivityMsg) throws JAXBException {
		return ObjectFormat.newInstance().object2xml(imagePassivityMsg, CHARSET);
	}

	/**
	 * 将被动语音消息转换成xml格式的字符串
	 * 
	 * @param voicePassivityMsg
	 *            被动语音消息对象
	 * @return xml格式字符串
	 * @throws JAXBException
	 */
	public String passivityMsg2xml(VoicePassivityMsg voicePassivityMsg) throws JAXBException {
		return ObjectFormat.newInstance().object2xml(voicePassivityMsg, CHARSET);
	}

	/**
	 * 将被动视频消息转换成xml格式的字符串
	 * 
	 * @param videoPassivityMsg
	 *            被动视频消息对象
	 * @return xml格式字符串
	 * @throws JAXBException
	 */
	public String passivityMsg2xml(VideoPassivityMsg videoPassivityMsg) throws JAXBException {
		return ObjectFormat.newInstance().object2xml(videoPassivityMsg, CHARSET);
	}

	/**
	 * 将被动音乐消息转换成xml格式的字符串
	 * 
	 * @param musicPassivityMsg
	 *            被动音乐消息对象
	 * @return xml格式字符串
	 * @throws JAXBException
	 */
	public String passivityMsg2xml(MusicPassivityMsg musicPassivityMsg) throws JAXBException {
		return ObjectFormat.newInstance().object2xml(musicPassivityMsg, CHARSET);
	}

	/**
	 * 将被动图文消息转换成xml格式的字符串
	 * 
	 * @param articlesPassivityMsg
	 *            被动图文消息对象
	 * @return xml格式字符串
	 * @throws JAXBException
	 */
	public String passivityMsg2xml(ArticlesPassivityMsg articlesPassivityMsg) throws JAXBException {
		return ObjectFormat.newInstance().object2xml(articlesPassivityMsg, CHARSET);
	}

}
