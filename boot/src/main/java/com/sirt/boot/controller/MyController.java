package com.sirt.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sirt.boot.vo.Student;

@RestController
public class MyController {
	@GetMapping("/greetings")
	public String greetings() {
		return "Welcome To Spring Boot Application";
	}

	@GetMapping("/students")
	public Student getStudent() {
		Student student = new Student();
		student.setName("Anu");
		student.setSid(101);
		student.setPhoneNo(13243);
		return student;
	}
}
