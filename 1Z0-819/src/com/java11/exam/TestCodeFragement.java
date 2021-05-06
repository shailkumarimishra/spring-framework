package com.java11.exam;

public class TestCodeFragement {
private final int x=1;
static final int y=0;
public TestCodeFragement() {
	System.out.print(x);
	System.out.print(y);
}
public static void main(String[] args) {
	new TestCodeFragement();
}
}
