package com.aop;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AfterThrowExample {
	@AfterThrowing(pointcut="execution(* com.aop.*Service.m6())",throwing="ex")
	public void doRecovery(Exception ex) {
		System.out.println("AfterThrowExample "+ex.getMessage());
	}
}
