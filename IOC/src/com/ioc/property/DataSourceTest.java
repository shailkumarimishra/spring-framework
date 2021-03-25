package com.ioc.property;

import org.springframework.beans.factory.annotation.Autowired;

public class DataSourceTest {
	@Autowired
	private DataSource mysql;
	
	@Autowired
	private DataSource oracle;

	public void print() {
		System.out.println(
				mysql.getDriverClass() + "\n" + mysql.getUrl() + "\n" + mysql.getUsername() + "\n" + mysql.getPassword());
	}
	
	public void show() {
		System.out.println(
				oracle.getDriverClass() + "\n" + oracle.getUrl() + "\n" + oracle.getUsername() + "\n" + oracle.getPassword());
	}
}
