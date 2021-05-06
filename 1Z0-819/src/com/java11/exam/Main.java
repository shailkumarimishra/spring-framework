package com.java11.exam;

import java.util.List;

public class Main {
static String prefix="Mondials";
private String names="decimodels";
public static String getNames() {
	return new Main().names;
}
public static void main(String[] arr) {
	Main m=new Main();
	System.out.println(Main.prefix+Main.getNames());
	List<Integer>numbers=List.of(2,3,0,8,1,9,5,7,6,4);
	int sum = numbers.parallelStream().reduce(0,(n,m1)->n+m1);
}
}
