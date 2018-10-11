package com.service;

import com.exception.Login2Exception;

public interface UserService {

	/**
	 * 登陆是否成功
	 * @param username
	 * @param password
	 * @return
	 * @throws Login2Exception 
	 */
	Boolean login(String username, String password) throws Login2Exception;
	
}
