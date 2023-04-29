package com.dept.deptservice.dto;

public class DepartmentDto {

	
	private Long deptId;
	
	private String deptName;

	public DepartmentDto() {
		super();
	}

	public DepartmentDto(Long deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}

	public Long getDeptId() {
		return deptId;
	}

	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "DepartmentDto [deptId=" + deptId + ", deptName=" + deptName + "]";
	}


	
	
	
}
