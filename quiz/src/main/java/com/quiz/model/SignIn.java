package com.quiz.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignIn {

	private String username;

	private String email;

	private long phoneNo;

	private String password;

	private String confirmPassword;
}
