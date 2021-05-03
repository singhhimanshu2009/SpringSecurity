package com.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.security.dao.UserDao;
import com.security.model.Users;

@RestController
public class UserController {
	
	@Autowired
	UserDao userDao;
	
	@PostMapping("/adduser")
	public void addUser(@RequestBody Users users) {
		userDao.saveUser(users);		
	}

}