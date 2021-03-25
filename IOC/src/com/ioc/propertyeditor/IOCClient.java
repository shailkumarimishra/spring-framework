package com.ioc.propertyeditor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCClient {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("propertyeditor.xml");
		Student bean = ctx.getBean("stu", Student.class);
		System.out.println(
				bean.getFee().getFeeBalance() + " " + bean.getFee().getFeePaid() + " " + bean.getFee().getTotalFee());
		System.out.println(bean.getSid().getBatchId() + " " + bean.getSid().getId());
	}
}
