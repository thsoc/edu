package com.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.pojo.User;

public interface UserMapper {

	/**
	 * 查询用户信息
	 * @param map
	 * @return
	 */
	User findUser(@Param("map")Map<String, String> map);
}