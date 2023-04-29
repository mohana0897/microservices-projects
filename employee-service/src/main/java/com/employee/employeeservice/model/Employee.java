package com.employee.employeeservice.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private Double salary;
	
	@Column(nullable = false)
	private String address;
	
	@Column(nullable = false, unique = true)
	private String email;
	
	@Column(nullable = false, unique = true)
	private Long deptId;
	

	
	
	
	
	public Employee() {
		super();
	}
	
	


	public Employee(Long id, String name, Double salary, String address, String email, Long deptId) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
		this.email = email;
		this.deptId = deptId;
	}




	public Employee(Long id, String name, Double salary, String address, String email) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
		this.email = email;

	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Double getSalary() {
		return salary;
	}


	public void setSalary(Double salary) {
		this.salary = salary;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	


	public Long getDeptId() {
		return deptId;
	}




	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}




	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + ", email="
				+ email + ", deptId=" + deptId + "]";
	}






	
	
	
	
	
}
