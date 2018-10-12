package com.service;

import com.exception.SysException;

public interface UserService {

	/**
	 * 登陆是否成功
	 * @param username
	 * @param password
	 * @return
	 * @throws SysException 
	 */
	Boolean login(String username, String password) throws SysException;
	
}
