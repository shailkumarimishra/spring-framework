package com.ioc.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class Hello {
	@Autowired
	private A a;
	@Autowired
	private B b;
	public A getA() {
		return a;
	}
	public B getB() {
		return b;
	}
	
}
