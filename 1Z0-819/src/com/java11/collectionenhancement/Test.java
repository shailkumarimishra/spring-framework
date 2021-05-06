package com.java11.collectionenhancement;

import static java.util.Map.entry;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("shail");
		list.add("shradha");
		list.add("anjali");
//		list=Collections.unmodifiableList(list);
		list.add("anu");
//		System.out.println(list);
//		using factory method from java 9 onwards
		List<String> list2 = List.of("ambe", "sneha", "pratiksha");
//		list2.add("ram");
		System.out.println(list2);
		Set<String> set = Set.of("anu", "ambe", "anu2");
//		set.add("anu3");
		System.out.println(set);
		Map<Integer, String> map = Map.of(1, "anu", 2, "ambe", 3, "shail");
//		map.put(4, "anjali");
		System.out.println(map);
//		Upto 10 Arguments you can use of() method and after 10 Arguments you should use
//		ofEntry() method.
		Entry<Integer, String> e = Map.entry(1, "shradha");
		Entry<Integer, String> e1 = Map.entry(2, "anjali");
		Entry<Integer, String> e2 = Map.entry(3, "ambe");
		Map<Integer, String> ofEntries = Map.ofEntries(e, e1, e2);
		System.out.println(ofEntries);
		Map<Integer, String> ofEntries2 = Map.ofEntries(entry(1, "tulsi"), entry(2, "alok"), entry(3, "mahi"));
		System.out.println(ofEntries2);
		
	}

}
