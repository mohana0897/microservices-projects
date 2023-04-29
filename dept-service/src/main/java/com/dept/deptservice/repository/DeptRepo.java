package com.dept.deptservice.repository;

import com.dept.deptservice.model.Department;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DeptRepo extends JpaRepository<Department,Long> {

}
