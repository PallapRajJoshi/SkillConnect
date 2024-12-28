package com.skill_connect.app.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skill_connect.app.model.User;
import com.skill_connect.app.repository.UserRepo;
import com.skill_connect.app.service.UserService;
@Service //here we have to write business logics of the system
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepo userRepo;
	
	@Override
	public void userSignup(User user) {
userRepo.save(user);
		
	}

	@Override
	public User userLogin(String username, String password) {
		// TODO Auto-generated method stub
		return userRepo.findByUsernameAndPassword(username, password);
	}

}
