package com.java11.exam;

import java.util.List;

public class Test {
public static void main(String[] args) {
	var items=List.of(new Item("A",10),new Item("B",2),new Item("C",12),
			new Item("D",5),new Item("E",6));
	if(items.stream().anyMatch(i->i.count<0))
	System.out.println("an item whose variable count is 0");
	else 
		System.out.println("false");
}
}
