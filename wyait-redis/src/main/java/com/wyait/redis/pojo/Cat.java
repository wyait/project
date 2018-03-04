package com.wyait.redis.pojo;

import java.io.Serializable;

/**
 * @项目名称：wyait-manage
 * @包名：com.wyait.redis.pojo
 * @类描述：
 * @创建人：wyait
 * @创建时间：2017-12-06 17:54
 * @version：V1.0
 */
public class Cat implements Serializable {

	private static final long serialVersionUID = 4114566985567376061L;

	private int id;

	private String name;

	private int age;

	private String mobile;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getMobile() {
		return mobile;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Override public String toString() {
		return "Cat{" + "id=" + id + ", name='" + name + '\'' + ", age=" + age
				+ ", mobile='" + mobile + '\'' + '}';
	}
}
