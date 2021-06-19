package com.sirt.boot.mvc.vo;

import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class Registration {
	@NotEmpty
	@Size(min = 3, max = 20, message = "first name must be minimum {min} and maximum {max} character")
	private String firstName;
	@NotEmpty(message = "last name must not be empty")
//	@Min(message = "last name length must minimum 3", value = 3)
//	@Max(message = "last name length must not exceed 20", value = 20)
	private String lastName;
	@NotNull
	private long phoneNo;
	@Email
	private String email;
	private String gender;
	@NotEmpty(message = "address must not be empty")
	private String address;
	private List<String> courses;
	private String timing;
}
