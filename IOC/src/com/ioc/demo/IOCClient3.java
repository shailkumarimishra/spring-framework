package com.ioc.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCClient3 {

	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("config-constructor.xml");
		Employee emp = context.getBean("emp",Employee.class);
		System.out.println(emp);
		System.out.println(emp.getAddress());
	}

}
