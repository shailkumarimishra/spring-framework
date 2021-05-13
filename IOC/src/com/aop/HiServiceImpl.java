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

	@Override
	public void m6() throws Exception {
		System.out.println("HiServiceImpl m6()");
		throw new Exception("My Exception");
	}

	@Override
	public String m7() {
		System.out.println("HiServiceImpl m7()");
		return "shail";
	}

}
