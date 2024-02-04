package com.employeemanagement.models;

public class Employee {
	private String name;
	private String eid;
	private String dept;
	
	public Employee() {}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEid() {
		return eid;
	}
	
	public void setEid(String eid) {
		this.eid = eid;
	}
	
	public String getDept() {
		return dept;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}

	public Employee(String name, String eid, String dept) {
		super();
		this.name = name;
		this.eid = eid;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", eid=" + eid + ", dept=" + dept + "]";
	}
}
