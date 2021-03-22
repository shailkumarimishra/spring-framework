package com.ioc.config;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class TestService {
//@Autowired
//@Qualifier("srv1")
	@Resource(name="srv1")
private MyService service;

public final MyService getService() {
	return service;
}

}
