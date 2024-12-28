package com.skill_connect.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skill_connect.app.model.User;

public interface UserRepo extends JpaRepository<User, Integer>{
User findByUsernameAndPassword(String username,String password);
User findByUsername(String username);
	
	
	
}
