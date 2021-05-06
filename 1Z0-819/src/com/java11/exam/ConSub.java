package com.java11.exam;

public class ConSub extends Consuper{

	ConSub() {
		this(4);
		System.out.println("1");
	}
	ConSub(int a) {
		System.out.println(a);
	}

	public static void main(String[] args) {
		new ConSub(4);
	}

}
