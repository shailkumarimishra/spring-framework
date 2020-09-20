package com.ioc.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * Q1. What is the difference b/w BeanFactory and ApplicationContext?
 */
public class IOCClient {
	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("config.xml");
		Student stu = context.getBean("stu",Student.class);
		System.out.println(stu.getName()+" "+stu.getSid()+" "+stu.getPhoneNo());
		stu.getEmails().forEach(System.out::println);
	}
}
