package com.quiz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.model.SignIn;
import com.quiz.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/quiz")
public class UserController {
	@Autowired
	private UserService service;

	@PostMapping(path = "/save")
	public ResponseEntity<String> saveUser(@RequestBody SignIn user) {
		log.info("user info {}", user);
		service.addUser(user);
		return new ResponseEntity<>("User Registered Successfully",HttpStatus.OK);
	}
}
