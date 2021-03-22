package com.ioc.config;

import org.springframework.stereotype.Service;

@Service("srv1")
public class ServiceImpl1 implements MyService{
	@Override
	public void printService() {
		System.out.println("ServiceImpl1");
	}

}
