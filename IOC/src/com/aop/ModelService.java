package com.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class ModelService {
//@Pointcut("execution(* com.aop.GreetingImpl.method*(int)")
@Pointcut("execution(* com.aop.GreetingImpl.method*(int) && * com.aop.GreetingImpl.method*()")
public void anu() {
	
}
@Before("anu()")
public void modelServiceM1() {
	System.out.println("modelServiceM1()");
}
@After("anu()")
public void modelServiceM2() {
	System.out.println("modelServiceM2()");
}
}
