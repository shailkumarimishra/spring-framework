package com.ioc.propertyeditor;

public class StudentId {
	private int id;
	private String batchId;

	public StudentId(int id, String batchId) {
		this.id = id;
		this.batchId = batchId;
	}

	public final int getId() {
		return id;
	}

	public final String getBatchId() {
		return batchId;
	}

}
