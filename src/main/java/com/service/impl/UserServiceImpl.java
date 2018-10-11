package com.service.impl;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.exception.Login2Exception;
import com.mapper.UserMapper;
import com.pojo.User;
import com.service.UserService;

@Service(value="userService")
@Transactional
public class UserServiceImpl implements UserService{
	
	@Resource
	private UserMapper userMapper;
	
	@Override
	public Boolean login(String account, String password) throws Login2Exception {
		Map<String, String> map = new HashMap<String, String>();
		map.put("account", account);
		map.put("password", password);
		User findUser = userMapper.findUser(map);
		if(findUser == null) {
			throw new Login2Exception("001","输入信息有误！");
		}else {
			return true;
		}
	}
}
