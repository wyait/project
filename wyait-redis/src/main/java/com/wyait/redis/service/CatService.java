package com.wyait.redis.service;

import com.wyait.redis.pojo.Cat;
import org.springframework.stereotype.Service;

/**
 * @项目名称：wyait-manage
 * @包名：com.wyait.redis.service
 * @类描述：
 * @创建人：wyait
 * @创建时间：2017-12-07 13:59
 * @version：V1.0
 */
@Service public class CatService {
	public Cat getCat(int catId) {
		Cat cat = new Cat();
		if (catId > 0) {
			if (catId == 1) {
				cat.setId(1);
				cat.setAge(1);
				cat.setMobile("11123456666");
				cat.setName("tomcat");
			} else if (catId == 2) {
				cat.setId(2);
				cat.setAge(22);
				cat.setMobile("10000000006");
				cat.setName("triger");
			}
		}
		return cat;

	}

	public Cat updateCat(int id) {
		Cat cat = new Cat();
		cat.setId(id);
		cat.setAge(100);
		cat.setMobile("120");
		cat.setName("老胡");
		return cat;
	}

	public void deleteCat(int id) {
		//TODO
	}
}
