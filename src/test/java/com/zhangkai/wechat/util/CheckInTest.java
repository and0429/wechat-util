package com.zhangkai.wechat.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class CheckInTest {

	@Test
	public void testCheck() {

		boolean flag = CheckIn.check("56735507099BB918CE13BDF3A41728A2E0823659", "a", "4", "1");

		assertEquals(true, flag);
	}

}
