package com.java11.exam;

import java.util.HashMap;

public class B extends A {
//	public int modifyVal(int val) {
//		if(checkValue(val)) {
//			return val;
//		}else {
//			return 0;
//		}
//	}
	public static void main(String[] args) {
		B b=new B();
//		System.out.println(b.modifyVal(10));
		String names=" ";
		if(names.isBlank()) {
			System.out.println("name is required");
		}
		var h=new HashMap<String,String>();
		String[] k= {"1","2",null,"3"};
		String[] v= {"a","b","c",null};
		for(int i=0;i<4;i++) {
			h.put(k[i],v[i]);
			System.out.print(h.get(k[i])+" ");
		}
		var i=10;
		var j=5;
		i+=(j*5+i)/j-2;
		System.out.println();
		System.out.println(i);
	}

}
