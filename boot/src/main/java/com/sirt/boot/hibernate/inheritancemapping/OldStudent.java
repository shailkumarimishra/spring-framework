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
@Table(name = "old_student")
@PrimaryKeyJoinColumn(name = "sid")
public class OldStudent extends Student {
	@Column(name = "old_company")
	private String oldCompany;

	@Column(name = "old_ctc")
	private double oldCTC;

	@Column(name = "old_company_email")
	private String oldCompanyEmail;
	
	public OldStudent() {
		
	}

	public OldStudent(int sid, String name, String city, String status, double totalFee, String oldCompany,
			double oldCTC, String oldCompanyEmail) {
		super(sid, name, city, status, totalFee);
		this.oldCompany = oldCompany;
		this.oldCTC = oldCTC;
		this.oldCompanyEmail = oldCompanyEmail;
	}
	
	
	
	
}
