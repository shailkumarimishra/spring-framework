package com.ioc.demo;

import java.util.List;

public class Employee {
private int empId;
private String empName;
private List<String> emails;
private Address address;

public Employee(int empId, String empName, List<String> emails, Address address) {
	this.empId = empId;
	this.empName = empName;
	this.emails = emails;
	this.address = address;
}
public Employee(int empId, String empName, List<String> emails) {
	System.out.println("3 args cons");
	this.empId = empId;
	this.empName = empName;
	this.emails = emails;
}
public Employee(int empId, String empName) {
	System.out.println("2 args cons");
	this.empId = empId;
	this.empName = empName;
}

public Employee(List<String> emails) {
	System.out.println("1 args cons");
	this.emails=emails;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + ", emails=" + emails + ", address=" + address + "]";
}



}
