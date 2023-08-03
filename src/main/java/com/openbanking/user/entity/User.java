package com.openbanking.user.entity;

import com.openbanking.global.entity.BaseEntity;
import com.openbanking.user.dto.UserDto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @description 사용자 테이블 Entity
 * @author skhan
 */
@Entity
@Getter
@NoArgsConstructor
public class User extends BaseEntity{
	/**
	 * 사용자 ID
	 */
	@Id
	private String userId;
	/**
	 * 사용자명
	 */
	private String username;
	/**
	 * access_token
	 */
	private String access_token;
	/**
	 * refresh_token
	 */
	private String refresh_token;
	
	public User(UserDto userDto) {
		this.userId = userDto.getUserId();
		this.username = userDto.getUsername();
	}
	
	public void setToken(String access_token, String refresh_token) {
		this.access_token = access_token;
		this.refresh_token = refresh_token;
	}
}
