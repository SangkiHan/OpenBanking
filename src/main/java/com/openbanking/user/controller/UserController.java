package com.openbanking.user.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.openbanking.user.dto.UserDto;
import com.openbanking.user.service.UserService;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class UserController {
	
	private final UserService userService;
	
	@PostMapping("/login")
	public void login(HttpServletRequest request, String userId) {
		userService.login(request, userId);
	}
	
	@PostMapping("/save")
	public void save(@RequestBody UserDto request) {
		userService.save(request);
	}

}
