package com.openbanking.user.dto;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
	/**
	 * 사용자 ID
	 */
	@Id
	private String userId;
	/**
	 * 사용자명
	 */
	private String username;
}
