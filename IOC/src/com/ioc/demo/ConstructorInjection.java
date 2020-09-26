package com.ioc.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorInjection {
	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("config-constructor.xml");
		Employee employee = context.getBean("emp",Employee.class);
		System.out.println(employee);
	}
}
