package com.service.impl;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.exception.SysException;
import com.mapper.UserMapper;
import com.pojo.User;
import com.service.UserService;
import com.util.ErrorCode;

@Service(value="userService")
@Transactional
public class UserServiceImpl implements UserService{
	
	@Resource
	private UserMapper userMapper;
	
	@Override
	public Boolean login(String username, String password) throws SysException {
		Map<String, String> map = new HashMap<String, String>();
		map.put("account", username);
		map.put("password", password);
		User findUser = userMapper.findUser(map);
		if(findUser == null) {
			throw new SysException(ErrorCode.USER_NO_EXIST);
		}else {
			return true;
		}
	}
}
