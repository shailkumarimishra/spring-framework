package com.ioc.namespace;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ioc.demo.Address;

public class IOCClient {
public static void main(String[] args) {
	ApplicationContext ctx= new ClassPathXmlApplicationContext("config.xml");
	Address bean = ctx.getBean("add",Address.class);
	System.out.println(bean.getCity()+" "+bean.getState());
}
}
