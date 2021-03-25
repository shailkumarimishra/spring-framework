package com.ioc.property;

public class DataSource {
private String driverClass;
private String url;
private String username;
public final String getDriverClass() {
	return driverClass;
}
public final void setDriverClass(String driverClass) {
	this.driverClass = driverClass;
}
public final String getUrl() {
	return url;
}
public final void setUrl(String url) {
	this.url = url;
}
public final String getUsername() {
	return username;
}
public final void setUsername(String username) {
	this.username = username;
}
public final String getPassword() {
	return password;
}
public final void setPassword(String password) {
	this.password = password;
}
private String password;


}
