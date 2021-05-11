package com.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopTest2 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("aop2.xml");
		Greeting bean = context.getBean("greet", Greeting.class);
		String output = bean.method4("hii","anjali");
		System.out.println(output);
//		bean.test();
	}

}
