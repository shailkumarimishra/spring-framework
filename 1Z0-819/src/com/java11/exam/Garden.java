package com.java11.exam;

public class Garden {
	private static Plant plant;
	public static void main(String[] args) {
		plant=new Tulip();
		feed(plant);
		feed(plant);

	}
public static void feed(Plant p) {
	if(p instanceof Tulip) {
		System.out.println("take extra care");
	}
	p=null;
}
}
