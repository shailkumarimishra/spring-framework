package com.ioc.demo;

import java.util.List;

public class Student {
private String name;
private int sid;
private Long phoneNo;
private List<String> emails;
 public Student() {
	 System.out.println("student constructor");
 }
 
public List<String> getEmails() {
	return emails;
}

public void setEmails(List<String> emails) {
	this.emails = emails;
}

public int getSid() {
	return sid;
}

public void setSid(int sid) {
	this.sid = sid;
	System.out.println("sid");
}

public Long getPhoneNo() {
	return phoneNo;
}

public void setPhoneNo(Long phoneNo) {
	this.phoneNo = phoneNo;
	System.out.println("phone no");
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
	System.out.println("name");
}
}
