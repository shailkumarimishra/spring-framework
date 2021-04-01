package com.ioc.event;

public class WorkShop {
private String topic;
private double fee;
private int studentNo;
public WorkShop(String topic, double fee, int studentNo) {
	this.topic = topic;
	this.fee = fee;
	this.studentNo = studentNo;
}
@Override
public String toString() {
	return "Workshop [topic=" + topic + ", fee=" + fee + ", studentNo=" + studentNo + "]";
}

}
