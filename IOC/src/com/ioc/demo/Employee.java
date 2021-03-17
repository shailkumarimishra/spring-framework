package com.ioc.demo;

public class Employee {
private int empId;
private String empName;
private Address address;
public Employee() {
	System.out.println("default constructor of Employee");
}
public Employee(int empId, String empName, Address address) {
	this.empId = empId;
	this.empName = empName;
	this.address = address;
	System.out.println("three argumented constructor of Employee");
}

public Employee(int empId, String empName) {
	this.empId = empId;
	this.empName = empName;
	System.out.println("two argumented constructor of Employee");
}

public Employee(int empId) {
	this.empId = empId;
	System.out.println("one argumented constructor of Employee");
}

public Address getAddress() {
	return address;
}


}
