package com.ioc.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ContainerAndBeanInfo implements BeanNameAware,BeanFactoryAware,ApplicationContextAware {

	@Override
	public void setBeanName(String str) {
		System.out.println(str);
	}

	@Override
	public void setBeanFactory(BeanFactory bf) throws BeansException {
		System.out.println("BeanFactoryAware");
	}

	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		System.out.println(ctx.getId());
	}

}
