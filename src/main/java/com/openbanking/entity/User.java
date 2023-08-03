package com.openbanking.entity;

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
	 * 비밀번호
	 */
	private String password;
	/**
	 * 사용자명
	 */
	private String username;
	
}
