package com.aop;

import java.time.Duration;
import java.time.LocalTime;

public class Test {

	public static void main(String[] args) {
		LocalTime lt=LocalTime.now();
		System.out.println(lt);
		int i=0;
//		while(i++<500) {
//			
//		}
		LocalTime end = LocalTime.now();
		System.out.println(end);
		long diff = Duration.between(lt, end).toNanos();
		System.out.println(diff);
	}

}
