package com.dept.deptservice.controller;

import com.dept.deptservice.dto.DepartmentDto;
import com.dept.deptservice.services.DepartmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/deptservice")
public class DepartmentController {
	
	@Autowired
	private DepartmentService deptService;
	
	@PostMapping("/department")
	public ResponseEntity<?> saveDept(@RequestBody DepartmentDto departmentDto){
		System.out.println(departmentDto);
		return new ResponseEntity<DepartmentDto>(deptService.saveDept(departmentDto), HttpStatus.CREATED);
		
		
	}
	
	/*
	 * @GetMapping("/department/{id}") public ResponseEntity<?>
	 * getDeptById(@PathVariable Long id){
	 * 
	 * 
	 * return new ResponseEntity<DepartmentDto>(deptService.getDept(id),
	 * HttpStatus.OK);
	 * 
	 * 
	 * 
	 * }
	 */
	@GetMapping("/department/{id}")
	public DepartmentDto getDeptById(@PathVariable Long id){
		
		
		return deptService.getDept(id);
		
		
		
	}


}
