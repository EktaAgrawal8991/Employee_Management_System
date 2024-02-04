package com.employeemanagement.serviceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.employeemanagement.models.Employee;
import com.employeemanagement.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	private List<Employee> employees = new ArrayList<>(Arrays.asList(new Employee("Ekta","1500","Dev"), new Employee("Akash", "1600","Dev")));

	@Override
	public List<Employee> getEmployeeList() {
		return employees;
	}
	
}
