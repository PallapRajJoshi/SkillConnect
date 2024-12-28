package com.skill_connect.app.service;

import com.skill_connect.app.model.User;

public interface UserService {
	void userSignup(User user);
	User userLogin(String username,String password);

}
