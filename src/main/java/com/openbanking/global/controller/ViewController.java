package com.openbanking.global.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.openbanking.global.exception.ErrorCode;
import com.openbanking.global.exception.GlobalException;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class ViewController {
	
	@GetMapping("/authorize")
	public String authorize(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String userId = (String) session.getAttribute("userId");
		if(userId==null) {
			throw new GlobalException(ErrorCode.SESSION_UNKNOWN);
		}
		return "AUTH";
	}

}
