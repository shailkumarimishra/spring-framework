package com.java11.exam;

public class Consuper {

	protected Consuper() {
		this(2);
		System.out.println("3");
	}
	protected Consuper(int a) {
		System.out.println(a);
	}
}
