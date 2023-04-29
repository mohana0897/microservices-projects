package com.dept.deptservice.controller;

import com.dept.deptservice.exceptions.DeptException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class DeptExceptionController extends ResponseEntityExceptionHandler{

	
	@ExceptionHandler
	public ResponseEntity<?> exceptionHandling(DeptException deptException, WebRequest webreq){
		
		
		return new ResponseEntity<Object>(deptException.getMessage(), HttpStatus.BAD_REQUEST);
	}
	
	
}
