package com.openbanking.user.service;

import org.springframework.stereotype.Service;

import com.openbanking.global.exception.ErrorCode;
import com.openbanking.global.exception.GlobalException;
import com.openbanking.user.dto.UserDto;
import com.openbanking.user.entity.User;
import com.openbanking.user.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
	
	private final UserRepository userRepository;
	
	public void save(UserDto request) {
		User user = new User(request);
		userRepository.save(user);
	}
	
	public void setToken(String userId, String access_token, String refresh_token) {
		User user = userRepository.findById(userId)
				.orElseThrow(() -> new GlobalException(ErrorCode.USER_UNKNOWN));
		
		user.setToken(access_token, refresh_token);
	}

}
