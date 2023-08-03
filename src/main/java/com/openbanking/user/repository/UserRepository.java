package com.openbanking.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.openbanking.user.entity.User;

public interface UserRepository extends JpaRepository<User, String>{
	
}
