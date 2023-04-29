package com.employee.employeeservice.exceptions;

public class EmployeeExistedException extends RuntimeException {
	
	private String msg;
	
	public EmployeeExistedException(String msg) {
		
		super(msg);
	}

}
