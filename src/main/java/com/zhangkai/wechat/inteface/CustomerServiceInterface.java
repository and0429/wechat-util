package com.zhangkai.wechat.inteface;

import java.io.IOException;

import net.sf.json.JSONObject;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import com.zhangkai.wechat.domain.customerservicemsg.BaseCustomerServiceMsg;
import com.zhangkai.wechat.domain.customerservicemsg.TextCustomerServiceMsg;
import com.zhangkai.wechat.domain.customerservicemsg.subcustomerservicemsg.Text;
import com.zhangkai.wechat.util.Configuration;

/**
 * 客服接口
 * 
 * @author zhangkai
 *
 */
public class CustomerServiceInterface extends BaseInterface {

	/**
	 * 发送客服的文本消息
	 * 
	 * @param token
	 *            微信唯一标识符
	 * @param toUser
	 *            消息接受这OpendId
	 * @param content
	 *            消息内容
	 * @throws IOException
	 */
	public void sendTextCustomerServiceMsg(String token, String touser, String content) throws IOException {

		TextCustomerServiceMsg textMsg = new TextCustomerServiceMsg();

		textMsg.setTouser(touser);
		Text text = new Text();
		text.setContent(content);
		textMsg.setText(text);

		sendCustomerServiceMsg(token, textMsg);

	}

	/**
	 * 发送客服消息基础方法
	 * 
	 * @param token
	 *            微信微信标识符
	 * @param msg
	 *            客服消息对象
	 * @throws IOException
	 * @throws
	 */
	private void sendCustomerServiceMsg(String token, BaseCustomerServiceMsg msg) throws IOException {

		String url = Configuration.getProperty("customerServiceMsg").replace("ACCESS_TOKEN", token);

		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpPost httpPost = new HttpPost(url);

		String msgJson = JSONObject.fromObject(msg).toString();

		httpPost.setEntity(new StringEntity(msgJson, ContentType.APPLICATION_JSON));

		CloseableHttpResponse response = httpclient.execute(httpPost);

		try {
			HttpEntity entity = response.getEntity();
			String entityStr = EntityUtils.toString(entity, CHARSET);
			loggerformat(entityStr);
		} finally {
			if (response != null) {
				response.close();
				response = null;
			}
		}

	}

}
