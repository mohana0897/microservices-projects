package com.employee.employeeservice.dto;

public class EmployeeDto {

	private Long id;

	private String name;

	private Double salary;

	private String address;

	private String email;

	private Long deptId;

	private DepartmentDto deptDto;

	public EmployeeDto() {
		super();
	}

	public EmployeeDto(Long id, String name, Double salary, String address, String email, Long deptId,
			DepartmentDto deptDto) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
		this.email = email;
		this.deptId = deptId;
		this.deptDto = deptDto;
	}

	public EmployeeDto(Long id, String name, Double salary, String address, String email, DepartmentDto deptDto) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
		this.email = email;
		this.deptDto = deptDto;
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

	public DepartmentDto getDeptDto() {
		return deptDto;
	}

	public void setDeptDto(DepartmentDto deptDto) {
		this.deptDto = deptDto;
	}

	public Long getDeptId() {
		return deptId;
	}

	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}

	@Override
	public String toString() {
		return "EmployeeDto [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + ", email="
				+ email + ", deptId=" + deptId + ", deptDto=" + deptDto + "]";
	}

}
