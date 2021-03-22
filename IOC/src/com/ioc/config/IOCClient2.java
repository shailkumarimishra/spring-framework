package com.ioc.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCClient2 {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("config5.xml"); 
	TestService bean = context.getBean("test",TestService.class);
	bean.getService().printService();
}
}
