package com.mapper;

import java.util.Map;


import com.pojo.User;

public interface UserMapper {

	/**
	 * 查询用户信息
	 * @param map
	 * @return
	 */
	User findUser(Map<String, String> map);
}