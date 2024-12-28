package com.skill_connect.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.skill_connect.app.model.User;
import com.skill_connect.app.service.UserService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class UserController {
	@Autowired
	UserService userService;
	@GetMapping("/")
	public String hello() {
		return "hello sir heyy";
	}

//	Using @RequestBody: For JSON data.
//	Using @RequestParam: For form data or query parameters.
//	Using @ModelAttribute: For form data mapped to a Java object.
	@PostMapping("/user/signup")
	public User postSignup(@RequestBody User user) {
	
		userService.userSignup(user);
		return user;
	
		
	}
	
	@PostMapping("/user/login")
	public String postLogin(@RequestBody User user) {
		String username=user.getUsername();
		String password=user.getPassword();
	User u=	userService.userLogin(username, password);
	if(u!=null) {
		return "user logined";
		
	}else {
		return "user not found";
	}
		
		
	}
//	getting token
	@GetMapping("/csrf-token")
	public CsrfToken getCsrfToken(HttpServletRequest request) {
		return (CsrfToken)request.getAttribute("_csrf");
	}
}
