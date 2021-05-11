package com.aop;

public class GreetingImpl implements Greeting{

	@Override
	public void method1() {
		System.out.println("method1() from GreetingImpl");
	}

	@Override
	public String method2() {
		System.out.println("method2() from GreetingImpl");
		return "hello";
	}

	@Override
	public int method3(int a) {
		System.out.println("method3(int a) from GreetingImpl");
		return a;
	}

	@Override
	public int method3(double a) {
		System.out.println("method3(double a) from GreetingImpl");
		return (int)a;
	}

	@Override
	public String method4(String a, String b) {
		System.out.println("method4() from GreetingImpl");
		return a+b;
	}

}
