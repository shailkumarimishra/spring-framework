package com.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogService {
	@Pointcut("execution(* com.aop.*Service.m*(..))")
	public void ambe() {
		
	}
	@Before("ambe()")
	public void logBegin() {
		System.out.println("LogService Begin");
	}

	@After("ambe()")
	public void logEnd() {
		System.out.println("LogService End");
	}
}
