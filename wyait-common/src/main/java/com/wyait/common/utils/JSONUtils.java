package com.wyait.common.utils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 
 * @项目名称：common
 * @类名称：JSONUtils
 * @类描述：JackSon工具类
 * @创建人：wyait
 * @创建时间：2016年7月20日 下午2:49:32
 * @version
 */
@SuppressWarnings("all")
public class JSONUtils {

	private final static ObjectMapper objectMapper = new ObjectMapper();

	private JSONUtils() {
	}

	private static final JSONUtils JSONUTIL = new JSONUtils();

	public static JSONUtils getInstance() {
		return JSONUTIL;
	}

	/**
	 * javaBean,list,array convert to json string
	 * <br>对象转换为json字符串
	 */
	public static String obj2json(Object obj) throws Exception {
		return objectMapper.writeValueAsString(obj);
	}

	/**
	 * json string convert to javaBean
	 * <br>json字符串转换为实体类对象
	 */
	public static <T> T json2pojo(String jsonStr, Class<T> clazz)
			throws Exception {
		return objectMapper.readValue(jsonStr, clazz);
	}

	/**
	 * json string convert to map
	 * <br>json字符串转换为Map<String, Object>对象
	 */
	public static <T> Map<String, Object> json2map(String jsonStr)
			throws Exception {
		return objectMapper.readValue(jsonStr, Map.class);
	}

	/**
	 * json string convert to map<map> , convert to map with javaBean
	 * <br>json字符串转换为Map<String, Object>对象,然后再转换为Map<String, T>对象
	 */
	public static <T> Map<String, T> json2map(String jsonStr, Class<T> clazz)
			throws Exception {
		Map<String, Map<String, Object>> map = objectMapper.readValue(jsonStr,
				new TypeReference<Map<String, T>>() {
				});
		Map<String, T> result = new HashMap<String, T>();
		for (Entry<String, Map<String, Object>> entry : map.entrySet()) {
			result.put(entry.getKey(), map2pojo(entry.getValue(), clazz));
		}
		return result;
	}

	/**
	 * json array string convert to list<map<String,Obj>>,convert to list<T> with javaBean
	 * <br>json字符串转换为Map<String, Object>对象,然后再转换为List<T>对象
	 */
	public static <T> List<T> json2map2list(String jsonArrayStr, Class<T> clazz)
			throws Exception {
		List<Map<String, Object>> list = objectMapper.readValue(jsonArrayStr,
				new TypeReference<List<T>>() {
				});
		List<T> result = new ArrayList<T>();
		for (Map<String, Object> map : list) {
			result.add(map2pojo(map, clazz));
		}
		return result;
	}

	/**
	 * json array string convert to list with javaBean
	 * <br>json字符串转换为List<T>对象
	 */
	public static <T> List<T> json2list(String jsonArrayStr, Class<T> clazz)
			throws Exception {
		List<T> result = objectMapper.readValue(jsonArrayStr, objectMapper
				.getTypeFactory().constructCollectionType(List.class, clazz));
		return result;
	}

	/**
	 * map convert to javaBean
	 * <br>Map<String, Object>对象转换为<T>实体类对象
	 */
	public static <T> T map2pojo(Map map, Class<T> clazz) {
		return objectMapper.convertValue(map, clazz);
	}
}