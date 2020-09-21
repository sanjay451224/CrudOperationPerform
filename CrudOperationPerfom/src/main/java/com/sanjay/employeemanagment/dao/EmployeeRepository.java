package com.sanjay.employeemanagment.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sanjay.employeemanagment.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	
}
