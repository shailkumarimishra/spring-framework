package com.aop;

public class HiServiceImpl implements HiService {

	@Override
	public void m1() {
		System.out.println("HiServiceImpl m1()");

	}

	@Override
	public void m2() {
		System.out.println("HiServiceImpl m2()");

	}

	@Override
	public void test() {
		System.out.println("HiServiceImpl test()");
	}

}
