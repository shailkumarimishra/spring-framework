package com.java11.exam;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class Employee {
private String name;
private String neighbourhood;
private int salary;


public Employee(String name) {
	this.name = name;
}


public Employee(String name, String neighbourhood, int salary) {
	this.name = name;
	this.neighbourhood = neighbourhood;
	this.salary = salary;
}

public final int getSalary() {
	return salary;
}


public final void setSalary(int salary) {
	this.salary = salary;
}


public final String getName() {
	return name;
}
public final void setName(String name) {
	this.name = name;
}
public final String getNeighbourhood() {
	return neighbourhood;
}
public final void setNeighbourhood(String neighbourhood) {
	this.neighbourhood = neighbourhood;
}
public static void main(String[] args) throws InterruptedException, ExecutionException {
//	String s="hat at store";
//	int x = s.indexOf("at");
//	s.substring(x+3);
//	x=s.indexOf("at");
//	System.out.println(s+" "+x);
//	Integer[] ints= {1,2,3,4,5,6,7};
//	var list=Arrays.asList(ints);
//	UnaryOperator<Integer> uo=(var x)-> ( x*3);
//	list.replaceAll(uo);
	ExecutorService es=Executors.newCachedThreadPool();
	es.execute(()->System.out.print("ping "));
	Future<String> future = es.submit(()->"pong");
	System.out.println(future.get());
	es.shutdown();
//	List<Employee> roster=List.of(new Employee("john","west town",20),
//			new Employee("ray","south town",90),
//			new Employee("tom"),
//			new Employee("kenny","west town",80));
//	Predicate<Employee>p=e->e.getSalary()>30;
//	Map<String, List<Employee>> e4 = roster.stream().collect(Collectors.groupingBy(Employee::getNeighbourhood,Collectors.toList()));
//	 
//	Map<String, List<Employee>> e2 = roster.stream().collect(Collectors.groupingBy(e->Optional.ofNullable(e.getNeighbourhood()).get()));
//	Function<Employee, Optional<String>>f=e->Optional.ofNullable(e.getNeighbourhood());
//	Map<String, List<Employee>> r1 = roster.stream().filter(p).collect(Collectors.groupingBy(Employee::getNeighbourhood,Collectors.filtering(p,Collectors.toList())));
//Map<Optional<String>, List<Employee>> r4 = roster.stream().collect(Collectors.groupingBy(f,Collectors.filtering(p,Collectors.toList())));
}

}
