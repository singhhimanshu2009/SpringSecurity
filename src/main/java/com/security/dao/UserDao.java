package com.security.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.security.model.Users;
import com.security.repository.UserRepo;

@Service
public class UserDao {
	
	@Autowired
	UserRepo userRepo;
	
	public void saveUser(Users users) {
		userRepo.save(users);
	}

}
