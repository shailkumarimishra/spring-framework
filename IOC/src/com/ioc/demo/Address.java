package com.ioc.demo;

public class Address {
private String city;
private String state;
{
	System.out.println("address static");
}
public Address() {
	System.out.println("Address default constructor");
}

public Address(String city, String state) {
	this.city = city;
	this.state = state;
	System.out.println("two argumented constructor of Address");
}

public Address(String city) {
	this.city = city;
	System.out.println("one argumented constructor of Address");
}

public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
@Override
public String toString() {
	return "Address [city=" + city + ", state=" + state + "]";
}

}
