package com.sanjay.employeemanagment.service;

import java.util.List;

import com.sanjay.employeemanagment.entity.Employee;

public interface EmployeeService {

	public List<Employee> findAll();
	
	public Employee findById(int thesoftware_Id);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int thesoftware_Id);
	
}
