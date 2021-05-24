package com.sirt.boot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="student")
public class StudentEntity {
	@Id
	@Column(name="stuid")
	private int sid;
	@Column(name="stuname")
	private String name;
	@Column(name="stu_phone")
	private int phoneNo;
	@Column(name="stu_email")
	private String email;
}
