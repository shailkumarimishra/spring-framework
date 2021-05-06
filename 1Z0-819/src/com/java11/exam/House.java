package com.java11.exam;

public class House<A extends Animal> {
public House<? super Dog> build(A a){
	return new House<Dog>();
}
}
