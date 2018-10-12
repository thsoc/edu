package com.controller;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.exception.SysException;
import com.service.UserService;

/**
 * 
 * @author mazg
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private UserService userService;

	@RequestMapping("/login")
	public ModelAndView Login(@RequestParam(value = "username", required = true) String username,
			@RequestParam(value = "password", required = true) String password) throws SysException {
		ModelAndView mv = new ModelAndView();
		boolean zq = userService.login(username, password);
		mv.addObject("username", username);
		mv.setViewName("welcome");
		return mv;
	}
}
