package com.employee.employeeservice.feignclient;

import com.employee.employeeservice.dto.DepartmentDto;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "dept-service", url = "http://localhost:9191/deptservice" )
public interface FeignUtil {
	
	@GetMapping("/department/{id}")
	public DepartmentDto getDeptById(@PathVariable("id") Long id);

}
