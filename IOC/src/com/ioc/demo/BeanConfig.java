package com.ioc.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
//	<bean id="hello" class="com.ioc.demo.Hello"/>  
//	<bean id="a" class="com.ioc.demo.A"/>
	@Bean
	public A beanA() {
		return new A();
	}
//	<bean id="b" class="com.ioc.demo.B"/> 
	@Bean(name="B")
	public B beanB() {
		return new B();
	}
	@Bean(name="hello")
	public Hello beanHello() {
		return new Hello();
	}
	@Bean(name="stu")
    public Student beanStudent() {
    	return new Student();
    }
    @Bean(name="add")
    public Address beanAddress() {
    	return new Address();
    }
    @Bean(name="co")
    public Course beanCourse() {
    	return new Course();
    }
}
