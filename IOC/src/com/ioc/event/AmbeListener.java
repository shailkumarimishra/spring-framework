package com.ioc.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class AmbeListener implements ApplicationListener{
	@Override
	public void onApplicationEvent(ApplicationEvent event) {
//		System.out.println("from AmbeListener");
		if(event instanceof BatchEvent) {
			BatchEvent bevent=(BatchEvent)event;
			Batch batch = bevent.getBatch();
			System.out.println("AmbeListener "+batch);
		}
		else if(event instanceof WorkShopEvent) {
			WorkShopEvent wevent=(WorkShopEvent)event;
			WorkShop workshop = wevent.getWorkshop();
			System.out.println("AmbeListener "+workshop);
		}
	}

	

}
