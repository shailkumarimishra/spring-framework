package com.ioc.event;

import org.springframework.context.ApplicationEvent;

public class BatchEvent extends ApplicationEvent {
private Batch batch;
	public BatchEvent(Object source,Batch batch) {
		super(source);
		this.batch=batch;
	}
	public final Batch getBatch() {
		return batch;
	}
	

}
