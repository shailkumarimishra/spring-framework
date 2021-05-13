package com.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AfterReturningExample {
	@AfterReturning(pointcut="execution(* com.aop.*Service.m7())",returning="name")
public void afterReturnExample(String name) {
	System.out.println("afterReturnExample() "+name);
}
	@AfterReturning(pointcut="execution(* com.aop.*Service.m7())")
public void afterReturnExample1() {
	System.out.println("afterReturnExample() ");
}
}
