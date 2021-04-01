package com.ioc.event;

import org.springframework.context.ApplicationEvent;

public class WorkShopEvent extends ApplicationEvent {
private WorkShop workshop;
	public WorkShopEvent(Object source,WorkShop workshop) {
		super(source);
		this.workshop=workshop;
	}
	public final WorkShop getWorkshop() {
		return workshop;
	}

}
