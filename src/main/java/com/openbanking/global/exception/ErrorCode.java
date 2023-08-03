package com.openbanking.global.exception;

import lombok.Getter;

@Getter
public enum ErrorCode {
	
	//User
	USER_UNKNOWN("USR0001", "해당 사용자가 존재하지 않습니다. 관리자에게 문의 해주세요");
	
	private String code;
	private String message;
	
	private ErrorCode(String code, String message) {
		this.code = code;
		this.message = message;
	}
}
	
	
	
