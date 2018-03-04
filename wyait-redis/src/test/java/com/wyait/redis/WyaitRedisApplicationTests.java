package com.wyait.redis;

import com.wyait.redis.utils.RedisUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
//@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = WyaitRedisApplication.class)
//@SpringBootTest
public class WyaitRedisApplicationTests {
	@Autowired
	private RedisUtils redisUtils;
	@Test
	public void contextLoads() {
		System.out.println("==================================== test =========");
		redisUtils.set("test","aaa");
		System.out.println("==================================== end =========");
	}

}
