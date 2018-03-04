package com.spring.redis.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.redis.pojo.User;
import com.spring.redis.util.RedisUtil;

@Controller
@RequestMapping("/")
public class RedisController {
	@Autowired
	private RedisUtil redisUtil;

	@RequestMapping(value = "add", method = RequestMethod.GET)
	@ResponseBody
	public String add() {
		System.out.println("================华丽进=======================");
		this.redisUtil.set("aaa", "aaa");
		System.out.println("================华丽出=======================");
		return "hello world";
	}

	@RequestMapping(value = "get", method = RequestMethod.GET)
	@ResponseBody
	public String get() {
		System.out.println("================获取redis中数据=======================");
		return String.valueOf(this.redisUtil.get("aaa"));
	}

	@RequestMapping(value = "addHash", method = RequestMethod.GET)
	@ResponseBody
	public String addHash() {
		System.out.println("================华丽进===addHash====================");
		User u = new User();
		u.setAge(11);
		u.setId(1L);
		u.setName("李四");
		// 存储hash结构的数据，可以是HashMap
		this.redisUtil.setHash("mmm", "bbb:ccc", u);
		HashMap<String, User> map = new HashMap<String, User>();
		map.put("user", u);
		this.redisUtil.setHash("mmm", "nnn", map);
		System.out.println("================华丽出====addHash===================");
		return "hello world";
	}

	@RequestMapping(value = "getHash", method = RequestMethod.GET)
	@ResponseBody
	public HashMap<String, User> getHash() {
		System.out
				.println("================获取redis中数据========getHash===============");
		User user = (User) this.redisUtil.getHash("mmm", "bbb:ccc");
		System.out
				.println("================获取redis中数据========getHash==============="
						+ user);
		return (HashMap<String, User>) this.redisUtil.getHash("mmm", "nnn");
	}

}
