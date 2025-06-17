package com.salesSavvy.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.salesSavvy.entity.Employee;
import com.salesSavvy.repository.EmployeeRepository;


public class EmployeeServiceImplementation 
				implements EmployeeService{
	@Autowired
	EmployeeRepository repo;
	
	@Override
	public void addEmployee(Employee emp) {
		repo.save(emp);
	}
	
}
