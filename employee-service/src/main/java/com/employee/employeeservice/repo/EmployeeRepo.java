package com.employee.employeeservice.repo;

import com.employee.employeeservice.model.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
	
	

}
