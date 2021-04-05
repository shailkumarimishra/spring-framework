package com.java11.trywithresource;

public class TryWithResourceTest {

	public static void main(String[] args) {
		MyResource r1=new MyResource();
		MyResource r2=new MyResource();
		MyResource r3=new MyResource();
		try {
			try(r1;r2;r3;MyResource r4=r3){
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
