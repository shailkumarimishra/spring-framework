package com.quiz.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "signin_info")
public class SignIn {
	@Id
	@Column(name = "username")
	private String username;

	@Column(name = "email")
	private String email;

	@Column(name = "phone_no")
	private long phoneNo;

	@Column(name = "pswd")
	private String password;

	@Column(name = "confirm_password")
	private String confirmPassword;
}
