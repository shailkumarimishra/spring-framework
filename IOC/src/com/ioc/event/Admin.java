package com.ioc.event;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Admin implements ApplicationContextAware {
private ApplicationContext ctx;
	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		this.ctx=ctx;
	}
	public void addBatch(Batch batch) {
		BatchEvent bevent=new BatchEvent(this, batch);
		ctx.publishEvent(bevent);
	}
	public void addWorkShop(WorkShop workshop) {
		WorkShopEvent wevent=new WorkShopEvent(this, workshop);
		ctx.publishEvent(wevent);
	}
}
