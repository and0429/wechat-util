package com.zhangkai.wechat.inteface;

import java.io.File;
import java.io.IOException;

import net.sf.json.JSONObject;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;

import com.zhangkai.wechat.domain.UploadResult;
import com.zhangkai.wechat.domain.WechatServiceIp;
import com.zhangkai.wechat.util.Configuration;
import com.zhangkai.wechat.util.FileType;

/**
 * 微信接口封装类
 * 
 * @author zhangkai
 *
 */
public class WechatInteface {

	public static final String CHARSET = "utf-8";
	private static Logger logger = Logger.getLogger(WechatInteface.class);

	/**
	 * 获取微信服务器Ip地址列表
	 * 
	 * @param token
	 *            微信公众平台唯一标识符
	 * @return Ip地址集合对象
	 * @throws IOException
	 * @throws
	 */
	public WechatServiceIp getIp(String token) throws IOException {

		WechatServiceIp ips = null;

		String ipsUrl = Configuration.getProperty("getIps").replace("ACCESS_TOKEN", token);

		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpGet httpGet = new HttpGet(ipsUrl);
		CloseableHttpResponse response = httpclient.execute(httpGet);

		try {
			HttpEntity entity = response.getEntity();
			String entityStr = EntityUtils.toString(entity, CHARSET);

			if (entityStr.contains("errcode")) {
				loggerformat(entityStr);
			} else {
				JSONObject jsonObj = JSONObject.fromObject(entityStr);
				ips = (WechatServiceIp) JSONObject.toBean(jsonObj, WechatServiceIp.class);
			}
		} finally {
			if (response != null) {
				response.close();
				response = null;
			}
		}

		return ips;
	}

	/**
	 * 上传多媒体文件
	 * 
	 * @param token
	 *            微信公众平台唯一标识符
	 * @param type
	 *            媒体文件类型，分别有图片（image）、语音（voice）、视频（video）和缩略图（thumb）
	 * @return 上传文件后返回信息封装成的对象
	 * @throws IOException
	 * @throws
	 */
	public UploadResult upload(String token, File file, FileType type) throws IOException {

		UploadResult uploadResult = null;

		String uploadUrl = Configuration.getProperty("upload").replace("ACCESS_TOKEN", token).replace("TYPE", type.getValue());

		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpPost httpPost = new HttpPost(uploadUrl);

		MultipartEntityBuilder fileEntity = MultipartEntityBuilder.create();
		fileEntity.addBinaryBody("file", file, ContentType.MULTIPART_FORM_DATA.withCharset(CHARSET), file.getName());

		httpPost.setEntity(fileEntity.build());

		CloseableHttpResponse response = httpclient.execute(httpPost);

		try {

			HttpEntity respEntity = response.getEntity();
			String entityStr = EntityUtils.toString(respEntity, CHARSET);

			if (entityStr.contains("errcode")) {
				loggerformat(entityStr);
			} else {
				JSONObject jsonObj = JSONObject.fromObject(entityStr);
				uploadResult = (UploadResult) JSONObject.toBean(jsonObj, UploadResult.class);
			}
		} finally {
			if (response != null) {
				response.close();
				response = null;
			}
		}

		return uploadResult;

	}

	/**
	 * 打印格式化后的日志
	 * 
	 * @param content
	 *            日志内容
	 */
	private void loggerformat(String content) {
		logger.error("================== " + content + " ==================");
	}
}
