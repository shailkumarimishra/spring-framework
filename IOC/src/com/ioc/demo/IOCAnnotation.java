package com.ioc.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCAnnotation {
public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext(BeanConfig.class);
	A bean = context.getBean("beanA",A.class);
	bean.m1();
	ApplicationContext ctx=new ClassPathXmlApplicationContext("config3.xml");
	Hello bean2 = ctx.getBean("hello",Hello.class);
	bean2.getA().m1();
//	Hello bean3 = (Hello)ctx.getBean("hello");
	Hello bean3 = context.getBean("hello",Hello.class);
	bean3.getB().m2();
//	Simple type 
	Student bean4 = context.getBean("stu",Student.class);
	bean4.setName("Shail");
	System.out.println(bean4.getName());
	
//	Reference type
	Address bean5 = context.getBean("add",Address.class);
	bean5.setCity("Madhubani");
	bean4.setAddress(bean5);
	System.out.println(bean4.getAddress().getCity());
	
//	Simple List type
	List<String> emails=new ArrayList<>(); 
	emails.add("xyz@gmail.com");
	emails.add("abc@gmail.com");
	bean4.setEmails(emails);
	bean4.getEmails().forEach(System.out::println);
//	Simple Set type
	Set<String> subjects=new HashSet<>();
	subjects.add("Hindi");
	subjects.add("Marathi");
	bean4.setSubjects(subjects);
	bean4.getSubjects().forEach(System.out::println);
//	Simple Map type
	Map<Integer,String> profiles=new HashMap<>();
	profiles.put(1, "IT");
	profiles.put(2, "Non-IT");
	bean4.setProfile(profiles);
	bean4.getProfile().forEach((k,v)->System.out.println(k+" "+v));
//	Properties type
	Properties props=new Properties();
	props.put("Mp", "Bhopal");
	props.put("Up", "Lucknow");
	bean4.setMyProps(props);
	bean4.getMyProps().forEach((k,v)->System.out.println(k+" "+v));
//	List of reference type
	Course bean6=context.getBean("co",Course.class);
	bean6.setCourseId(101);
	bean6.setSubject("DBMS");
	Course bean7=context.getBean("co",Course.class);
	bean7.setCourseId(102);
	bean7.setSubject("OS");
	List<Course> courses=new ArrayList<>();
	courses.add(bean6);
	courses.add(bean7);
	bean4.setCourses(courses);
	bean4.getCourses().forEach(System.out::println);
}
}
