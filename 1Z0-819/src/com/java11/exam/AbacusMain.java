package com.java11.exam;

public class AbacusMain {

	public static void main(String[] args) {
		int result=0;
		Abacus aba=(int a,int b)->{return a*b;};
		result = aba.calc(10, 20);
		System.out.println(result);
	}

}
