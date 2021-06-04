package com.sirt.boot.vo;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class Student {
	@Min(message = "sid minimum length should be 3",value=3)
private int sid;
	@NotBlank(message = "name should not be empty")
private String name;
	@Min(message = "phoneNo should not be greater than 10",value=10)
private int phoneNo;
	@NotBlank(message = "email should not be empty")
private String email;
}
