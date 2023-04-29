package com.employee.employeeservice.controller;

import com.employee.employeeservice.exceptions.EmployeeExistedException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class ExceptionController extends ResponseEntityExceptionHandler {
@ExceptionHandler
	public ResponseEntity<?> exceptionHandling(EmployeeExistedException empExistedException, WebRequest webRequest){
	
		return new ResponseEntity<Object>(empExistedException.getMessage(), HttpStatus.BAD_REQUEST);
		
	}
	
}
