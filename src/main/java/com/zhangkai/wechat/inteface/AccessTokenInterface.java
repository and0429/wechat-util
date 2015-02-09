package com.zhangkai.wechat.inteface;

import java.io.IOException;

import net.sf.json.JSONObject;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;

import com.zhangkai.wechat.domain.AccessToken;
import com.zhangkai.wechat.util.Configuration;

/**
 * 获取微信Token的工具类
 * 
 * @author zhangkai
 * 
 */
public class AccessTokenInterface {

	private static Logger logger = Logger.getLogger(AccessTokenInterface.class);
	public static final String CHARSET = "utf-8";

	/**
	 * 第三方用户唯一凭证
	 */
	private String appid;

	/**
	 * 第三方用户唯一凭证密钥，即appsecret
	 */
	private String secret;

	/**
	 * 创建一个对象。
	 * 
	 * @param appid
	 *            第三方用户唯一凭证
	 * @param secret
	 *            第三方用户唯一凭证密钥，即appsecret
	 */
	public AccessTokenInterface(String appid, String secret) {
		this.appid = appid;
		this.secret = secret;
	}

	/**
	 * 获取token对象
	 * 
	 * @throws IOException
	 * @throws ClientProtocolException
	 */
	public AccessToken getAccessToken() throws IOException {

		AccessToken token = null;

		String tokenGetUrl = Configuration.getProperty("getToken").replace("APPID", appid).replace("APPSECRET", secret);

		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpGet httpGet = new HttpGet(tokenGetUrl);
		CloseableHttpResponse response = httpclient.execute(httpGet);

		String entityStr = "";
		try {
			HttpEntity entity = response.getEntity();
			entityStr = EntityUtils.toString(entity, CHARSET);
			JSONObject jsonObj = JSONObject.fromObject(entityStr);
			token = (AccessToken) JSONObject.toBean(jsonObj, AccessToken.class);
		} catch (RuntimeException e) {
			logger.error(entityStr);
		} finally {
			if (response != null) {
				response.close();
			}
		}

		return token;
	}
}
