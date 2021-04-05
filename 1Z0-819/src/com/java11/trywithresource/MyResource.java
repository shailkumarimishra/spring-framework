package com.java11.trywithresource;

public class MyResource implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("close automatically");
	}

}
