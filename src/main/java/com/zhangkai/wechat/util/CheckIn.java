package com.zhangkai.wechat.util;

import java.util.Arrays;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * 微信公众号接入验证
 * 
 * @author zhangkai
 *
 */
public class CheckIn {

	/**
	 * 接入验证
	 * 
	 * @param signature
	 *            微信加密签名，signature结合了开发者填写的token参数和请求中的timestamp参数、nonce参数。
	 * @param timestamp
	 *            时间戳
	 * @param nonce
	 *            随机数
	 * @param token
	 *            Token可由开发者可以任意填写，用作生成签名
	 * @return
	 */
	public static boolean check(String signature, String timestamp, String nonce, String token) {

		if (signature == null || timestamp == null || nonce == null || token == null) {
			return false;
		}

		String[] temp = { timestamp, nonce, token };
		Arrays.sort(temp);

		StringBuffer buff = new StringBuffer();
		for (int i = 0; i < temp.length; i++) {
			buff.append(temp[i]);
		}

		String reult = buff.toString();
		String ciphertext = DigestUtils.shaHex(reult.getBytes());

		if (signature.equalsIgnoreCase(ciphertext)) {
			return true;
		}

		return false;

	}
}
