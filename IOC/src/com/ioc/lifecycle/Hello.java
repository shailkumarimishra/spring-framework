package com.ioc.lifecycle;

import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;

public class Hello implements DisposableBean{

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy() method overriden");
	}
	@PreDestroy
	public void cleanUp() {
		System.out.println("cleanUp() method");
	}
	public void myCleanUp() {
		System.out.println("myCleanUp() method");
	}
}
