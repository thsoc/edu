package controller;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import util.CacheUtil;

/**
 * 
 * @author mazg
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping("/login")
	public ModelAndView Login(@RequestParam(value="username",required=true)String username,
			@RequestParam(value="password",required=true)String password) {
		ModelAndView mv = new ModelAndView();
				if(StringUtils.equals(username, "admin")
						&&StringUtils.equals(password, "admin")) {
					/*CacheUtil.set(username, obj);*/
					mv.addObject("username", username);
					mv.setViewName("welcome");
					return mv;
				}
				mv.addObject("username", username);
				mv.setViewName("welcome");
				return mv;
	}
}
