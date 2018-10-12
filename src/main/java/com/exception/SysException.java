package com.exception;

import com.util.ErrorCode;

public class SysException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;
	private String code;
	public SysException(String message, String code) {
		super();
		this.message = message;
		this.code = code;
	}

	public SysException(ErrorCode errorCode) {
		this.message = errorCode.getMessage();
		this.code = errorCode.getCode();
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
	
}
