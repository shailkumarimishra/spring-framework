package com.ioc.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * Q1. What is the difference b/w BeanFactory and ApplicationContext?
 * Q2. What is the difference b/w Setter Injection and Constructor Injection and which one is better?
 */
public class IOCClient2 {
	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("config2.xml");
		College col = context.getBean("col",College.class);
		System.out.println(col.hashCode());
		System.out.println(col.getStudent().getName());
		System.out.println(col.getStudent().getAddress().getCity());
	}
}
