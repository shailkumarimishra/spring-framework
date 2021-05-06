package com.java11.exam;

import java.util.Collection;

public class X {
protected void print(Object obj) {
	System.out.println(obj);
}
public final void print(Object... objects) {
	for(Object object:objects) {
		System.out.println(object);
	}
}
public void print(Collection collection) {
	collection.forEach(System.out::println);
}
}
