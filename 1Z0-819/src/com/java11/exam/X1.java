package com.java11.exam;

public class X1 {
private String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return getName();
}

}
