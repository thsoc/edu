package com.exception;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import com.util.ErrorCode;

@Component
public class AllException implements HandlerExceptionResolver{
	private static Logger logger = LoggerFactory.getLogger(AllException.class);

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {
		SysException sysException = null;
		if(ex instanceof SysException) {
			sysException = (SysException)ex;
		}else {
			sysException = new SysException(ErrorCode.UNKNOWN);
		}
		logger.info("controller："+handler+",/n"+"错误信息是："+ex.getMessage());
		ModelAndView mv =new ModelAndView();
		mv.addObject("message", sysException.getMessage());
		mv.setViewName("error/error");
		return mv;
	}
}
