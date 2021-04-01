package com.ioc.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCClient {
public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("event.xml");
	Admin bean = ctx.getBean("admin",Admin.class);
	Batch batch=new Batch("B-123", "123", "7 am to 9 am", 20);
	bean.addBatch(batch);
	WorkShop workshop=new WorkShop("AI", 5500, 30);
	bean.addWorkShop(workshop);
}
}
