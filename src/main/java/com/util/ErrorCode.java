package com.util;

import org.apache.commons.lang.StringUtils;

public enum ErrorCode {
	UNKNOWN("UN","未知错误"),
	USER_NO_EXIST("U001","用户不存在");
	
	private String code;
	private String message;
	

	private ErrorCode(String code, String message) {
		this.code = code;
		this.message = message;
	}
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public static String getMsg(String code) {
		for (ErrorCode errorCode : ErrorCode.values()) {
			if(StringUtils.equals(code, errorCode.code)) {
				return errorCode.getMessage();
			}
		}
		return UNKNOWN.getMessage();
	}
	
}
