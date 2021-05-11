package com.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
		HiService bean = context.getBean("hi", HiService.class);
		bean.m1();
//		bean.test();
	}

}
