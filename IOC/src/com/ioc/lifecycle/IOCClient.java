package com.ioc.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCClient {
public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("lifecycle.xml");
	
}
}
