/*package com.spring.redis.util;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration({"classpath:spring/spring-redis-servlet.xml","classpath:spring/applicationContext.xml","classpath:spring/applicationContext-redis.xml"})
public class RedisUtilTest {
	@Autowired(required=false)
	private RedisUtil redisUtil;

	@Before
	public void setUp() throws Exception {
		//TODO
	}


	@Test
	public void testExpire() {
		boolean flag = this.redisUtil.exists("aaa");
		System.out.println("=======从redis中是否存在键为“aaa”的：" + flag);
	}

	@Test
	public void testGet() {
		String data = String.valueOf(this.redisUtil.get("aaa"));
		System.out.println("=======从redis中获得到的：" + data);
	}

	@Test
	public void testSetStringObject() {
		this.redisUtil.set("aaa", "test_value");
		System.out.println("=======从redis设置aaa");
	}

	@Test
	public void testDelete() {
		this.redisUtil.delete("aaa");
		System.out.println("=======从redis中删除aaa");
	}

}
*/