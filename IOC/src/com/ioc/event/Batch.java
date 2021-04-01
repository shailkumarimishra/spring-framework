package com.ioc.event;

public class Batch {
private String batchId;
private String studentId;
private String timing;
private int nos;

public Batch(String batchId, String studentId, String timing, int studentNo) {
	this.batchId = batchId;
	this.studentId = studentId;
	this.timing = timing;
	this.nos = studentNo;
}

@Override
public String toString() {
	return "Batch [batchId=" + batchId + ", studentId=" + studentId + ", timing=" + timing + ", studentNo=" + nos
			+ "]";
}

}
