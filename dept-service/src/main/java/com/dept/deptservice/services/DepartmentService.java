package com.dept.deptservice.services;

import com.dept.deptservice.dto.DepartmentDto;
import com.dept.deptservice.exceptions.DeptException;
import com.dept.deptservice.model.Department;
import com.dept.deptservice.repository.DeptRepo;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
	
	@Autowired
	private DeptRepo deptRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public DepartmentDto saveDept(DepartmentDto deptDto) {
		
		System.out.println(deptDto);
		
		Department dept = modelMapper.map(deptDto, Department.class);
		
		System.out.println(dept+"dept obj");
		
		try {
			
		Department depart=	deptRepo.save(dept);
		
		
		return modelMapper.map(depart, DepartmentDto.class);
			
			
			
			
		} catch (Exception e) {
			
			throw new DeptException("Department already exists!");
		}
		
		
		
	}
	
	
	public DepartmentDto getDept(Long id) {
		
		Department dept= deptRepo.findById(id).get();
		
		DepartmentDto deptDto=modelMapper.map(dept, DepartmentDto.class);
		return deptDto;
		
	}

}
