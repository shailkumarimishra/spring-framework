package com.ioc.config;

import org.springframework.beans.factory.annotation.Autowired;

public class Company {
	@Autowired
	private Student student;
	private Employee employee;

	public Student getStudent() {
		return student;
	}

	

	public Employee getEmployee() {
		return employee;
	}

	/*public void setEmployee(Employee employee) {
		this.employee = employee;
		System.out.println("setEmployee() method");
	}*/

}
