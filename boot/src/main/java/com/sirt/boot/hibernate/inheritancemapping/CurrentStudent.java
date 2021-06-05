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
@Table(name = "current_student")
@PrimaryKeyJoinColumn(name = "sid")
public class CurrentStudent extends Student {
	@Column(name = "fee_balance")
	private double feeBalance;

	@Column(name = "timing")
	private String timing;

	@Column(name = "branch")
	private String branch;

	public CurrentStudent() {
		super();
	}

	public CurrentStudent(int sid, String name, String city, String status, double totalFee, double feeBalance,
			String timing, String branch) {
		super(sid, name, city, status, totalFee);
		this.feeBalance = feeBalance;
		this.timing = timing;
		this.branch = branch;
	}

	
	
	
	
	

}
