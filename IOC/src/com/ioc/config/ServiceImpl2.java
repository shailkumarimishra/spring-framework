package com.ioc.config;

import org.springframework.stereotype.Service;
@Service("srv2")
public class ServiceImpl2 implements MyService{
	@Override
	public void printService() {
		System.out.println("ServiceImpl2");
	}
}
