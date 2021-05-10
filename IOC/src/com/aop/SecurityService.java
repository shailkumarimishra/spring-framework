package com.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class SecurityService {
	@Pointcut("execution(* com.aop.*Service.m*(..))")
	public void ambe() {
		
	}
	@Before("ambe()")
	public void verifyUser() {
		System.out.println("SecurityService verifyUser");
	}

}
