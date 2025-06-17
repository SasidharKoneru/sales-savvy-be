package com.salesSavvy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesSavvy.entity.Employee;
import com.salesSavvy.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService service;
	
	@GetMapping("/openAddEmployee")
	public String openAddEmployee() {
		return "addEmployee";
	}
	
	@PostMapping("/addEmployee")
	public String addEmployee(@ModelAttribute Employee emp) {
		service.addEmployee(emp);
		return "index";
	}
}
