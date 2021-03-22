package com.ioc.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCClient {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("config4.xml"); 
	Student bean = context.getBean("stu",Student.class);
	Employee bean2 = context.getBean("emp",Employee.class);
	Company bean3 = context.getBean("cmp",Company.class);
	bean3.getStudent().printStudent();
	bean3.getEmployee().printEmployee();
}
}
