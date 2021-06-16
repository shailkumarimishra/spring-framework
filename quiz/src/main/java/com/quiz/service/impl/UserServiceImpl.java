package com.quiz.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.model.SignIn;
import com.quiz.repository.UserRepo;
import com.quiz.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepo repo;

	@Override
	public void addUser(SignIn user) {
		repo.save(mapToUserEntity(user));
	}

	@Override
	public void verifyUser(String email) {
	}
	private com.quiz.entity.SignIn mapToUserEntity(SignIn user){
		com.quiz.entity.SignIn entity=new com.quiz.entity.SignIn();
		entity.setUsername(user.getUsername());
		entity.setEmail(user.getEmail());
		entity.setPhoneNo(user.getPhoneNo());
		entity.setPassword(user.getPassword());
		entity.setConfirmPassword(user.getConfirmPassword());
		return entity;
	}

}
