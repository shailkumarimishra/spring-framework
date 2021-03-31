package com.ioc.bundle;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

public class Hello {
@Autowired
private ApplicationContext ctx;
public void showEnglish() {
String message = ctx.getMessage("user.required", null, null);	
System.out.println(message);
String message1 = ctx.getMessage("password.length", new Object[]{"Password","6","16"}, null);	
System.out.println(message1);
}
public void showHindi() {
	String message = ctx.getMessage("user.required", null, new Locale("hi"));	
	System.out.println(message);
	String message1 = ctx.getMessage("password.length", new Object[]{"Password","6","16"}, new Locale("hi"));	
	System.out.println(message1);
}
}
