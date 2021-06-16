package com.quiz.service;

import com.quiz.model.SignIn;

public interface UserService {
public void addUser(SignIn user);
public void verifyUser(String email);
}
