package com.java11.exam;

import java.util.Collection;

public class Y extends X{
	public void print(Object obj) {
		System.out.print("["+obj+"]");
	}
//	public void print(Object... objects) {
//		for(Object object:objects) {
//			System.out.println("["+object+"]");
//		}
//	}
	public void print(Collection collection) {
		print(collection.toArray());
	}
}
