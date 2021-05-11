package com.aop.testpackage;

public class TesterImpl implements Tester {

	@Override
	public void method1() {
		System.out.println("method1() from TesterImpl");
	}

	@Override
	public String method2() {
		System.out.println("method2() from TesterImpl");
		return null;
	}

}
