package com.sirt.boot.mvc.exception;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyExceptionHandler {
	@ExceptionHandler(RecordNotFoundException.class)
	public String handleException(RecordNotFoundException e,HttpServletRequest request) {
		Map<String, String> map=new HashMap<>();
		map.put("E400", "Record Not Found!!");
		request.setAttribute("E400","Record Not Found!!" );
		return "recordnotfound";
	}
	public void setMessage(String msg) {
		
	}
	
	@ExceptionHandler
	public String handleAllException(Exception e) {
		return "error";
	}
}
