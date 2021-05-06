package com.java11.exam;

public class App {
	 class Greeting{

		private  void greet(String name) {
			System.out.println("Hello "+name);
		}
		
	}
public static void main(String[] args) {
	new App().new Greeting().greet("joe");
}
}
