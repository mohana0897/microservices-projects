package com.dept.deptservice.exceptions;


public class DeptException extends RuntimeException{
	
	private String msg;
	
	public DeptException(String msg) {
		
		super(msg);
		
	}

}
