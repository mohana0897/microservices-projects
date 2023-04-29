package com.employee.employeeservice.services;

import com.employee.employeeservice.dto.DepartmentDto;
import com.employee.employeeservice.dto.EmployeeDto;
import com.employee.employeeservice.exceptions.EmployeeExistedException;
import com.employee.employeeservice.feignclient.FeignUtil;
import com.employee.employeeservice.model.Employee;
import com.employee.employeeservice.repo.EmployeeRepo;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo employeeRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private FeignUtil feignUtil;
	
	public EmployeeDto saveEmployee(EmployeeDto empDto) {
		
		Employee emp = modelMapper.map(empDto, Employee.class);
		
//		Optional<Employee> empl = employeeRepo.findById(emp.getId());
		
		try {
			
			Employee empl= employeeRepo.save(emp);
			
			return modelMapper.map(empl, EmployeeDto.class);
			
			
		}catch(Exception e) {
			
			throw new EmployeeExistedException("Employee already exists!");
		}
		
		
	}
	
	
	public EmployeeDto getEmpById(Long id) {
		
		
		Employee emp=employeeRepo.findById(id).get();
		
		EmployeeDto empDto=modelMapper.map(emp, EmployeeDto.class);
		
		//DepartmentDto did= new DepartmentDto();
		
		DepartmentDto deptDto=feignUtil.getDeptById(empDto.getDeptId());
		
		empDto.setDeptDto(deptDto);
		return empDto;
		
		
		
		
	}

	/*
	 * public List<Employee> getAllEmployee(){
	 * 
	 * 
	 * employeeRepo.findAll();
	 * 
	 * 
	 * return ;
	 * 
	 * }
	 */
	
	
}
