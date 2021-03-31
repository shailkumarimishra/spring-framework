package com.ioc.bundle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCClient {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("msg-bundle.xml");
		Hello bean = ctx.getBean("hello",Hello.class);
		bean.showEnglish();
		bean.showHindi();
	}

}
