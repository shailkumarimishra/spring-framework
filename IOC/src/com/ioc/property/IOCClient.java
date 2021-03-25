package com.ioc.property;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCClient {
public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("dbconfig.xml");
	DataSourceTest bean = ctx.getBean("test",DataSourceTest.class);
	bean.print();
	bean.show();
}
}
