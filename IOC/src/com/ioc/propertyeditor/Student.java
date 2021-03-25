package com.ioc.propertyeditor;

public class Student {
private StudentId sid;
private Fee fee;
private String name;
public final StudentId getSid() {
	return sid;
}
public final void setSid(StudentId sid) {
	this.sid = sid;
}
public final Fee getFee() {
	return fee;
}
public final void setFee(Fee fee) {
	this.fee = fee;
}
public final String getName() {
	return name;
}
public final void setName(String name) {
	this.name = name;
}

}
