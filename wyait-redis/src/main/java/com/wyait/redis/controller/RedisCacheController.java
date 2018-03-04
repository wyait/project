package com.wyait.redis.controller;

import com.wyait.redis.pojo.Cat;
import com.wyait.redis.service.CatService;
import com.wyait.redis.utils.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @项目名称：wyait-manage
 * @包名：com.wyait.redis.controller
 * @类描述：
 * @创建人：wyait
 * @创建时间：2017-12-07 11:25
 * @version：V1.0
 */
@Controller
@RequestMapping("redis")
public class RedisCacheController {
	@Autowired
	private RedisUtils redisUtils;
	@Autowired
	private CatService catService;

	/**
	 * 更新redis中的缓存数据
	 * @param id 主键
	 */
	@CachePut(value = "catCache", key = "#root.caches[0].name + ':' + #id")
	@RequestMapping(value = "/addCat", method = RequestMethod.POST)
	@ResponseBody
	public Cat insert(@RequestParam("id") int id){
		System.out.println("==========insert添加数据到redis中，请求参数："+id);
		Cat cat=new Cat();
		cat.setId(id);
		cat.setName("张三");
		cat.setMobile("120");
		cat.setAge(52);
		return cat;
	}

	/**
	 * 通过缓存注解，添加数据到redis中
	 * </br>实现数据缓存！
	 * @param catId 对象
	 */
	@Cacheable(value = "catCache")
	@RequestMapping(value = "/getCat/{id}", method = RequestMethod.GET)
	@ResponseBody
	public Cat get(@PathVariable("id") int catId){
		System.out.println("================getCat=================");
		return this.catService.getCat(catId);
	}

	/**
	 * 更新redis中的缓存数据
	 *</br> #root. 是spEL表达式
	 * </br>如果参数是个对象，就通过“#对象.变量”获取到对应的key中需要的值；比如：#cat.id
	 * @param id 主键
	 */
	@CachePut(value = "catCache", key = "#root.caches[0].name + ':' + #id")
	@RequestMapping(value = "/updateCat", method = RequestMethod.POST)
	@ResponseBody
	public Cat update(@RequestParam int id){
		System.out.println("==========请求参数："+id);
		return this.catService.updateCat(id);
	}

	/**
	 * 删除redis中对应key的数据
	 * @param id
	 */
	@CacheEvict(value="catCache")
	@RequestMapping(value="/deleteCat",method = RequestMethod.POST)
	public void deleteCat(@RequestParam("id") int id){
		System.out.println("==============删除redis中数据====catId===="+id);
		this.catService.deleteCat(id);
	}


	/**
	 * 添加数据到redis中
	 */
	@RequestMapping(value = "/addRedis", method = RequestMethod.GET)
	public void add(){
		System.out.println("================addRedis=================");
		this.redisUtils.hmSet("a","test:aaa","123456");
		Cat cat=new Cat();
		cat.setName("wyait");
		cat.setAge(5);
		cat.setMobile("1112222333354");
		this.redisUtils.add("cat:1",cat);
		this.redisUtils.set("catSet:1",cat);
		this.redisUtils.zAdd("catZset:1",cat,100);
		List<Cat> list=new ArrayList<Cat>();
		list.add(cat);
		this.redisUtils.lPush("catList:1",list);

	}
}
