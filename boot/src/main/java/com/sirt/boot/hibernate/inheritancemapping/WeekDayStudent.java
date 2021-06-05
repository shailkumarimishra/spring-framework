package com.sirt.boot.hibernate.inheritancemapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "week_day_student")
@PrimaryKeyJoinColumn(name = "sid")
public class WeekDayStudent extends CurrentStudent {
	@Column(name = "qualification")
	private String qualification;

	@Column(name = "percentage")
	private double percentage;

	@Column(name = "yop")
	private int yop;
	
	public WeekDayStudent() {
		
	}

	public WeekDayStudent(int sid, String name, String city, String status, double totalFee, double feeBalance,
			String timing, String branch, String qualification, double percentage, int yop) {
		super(sid, name, city, status, totalFee, feeBalance, timing, branch);
		this.qualification = qualification;
		this.percentage = percentage;
		this.yop = yop;
	}
	
	

}
