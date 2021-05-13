package com.aop;

import java.time.Duration;
import java.time.LocalTime;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class Performance {
	@Around("execution(* com.aop.*Service.*(..))")
public void calculateTime(ProceedingJoinPoint pjp) throws Throwable {
//	start time
	LocalTime startTime=LocalTime.now();
	try {
	Object proceed = pjp.proceed();
	}catch(Exception e) {
		System.out.println("Exception occur while proceeding the methods "+e.getMessage());
	}
	LocalTime endTime=LocalTime.now();
	long diff = Duration.between(startTime, endTime).toNanos();
	System.out.println(pjp.getSignature()+" Total time taken "+diff);
	
}
}
