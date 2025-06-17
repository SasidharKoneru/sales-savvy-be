package com.salesSavvy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.salesSavvy.entity.Employee;

public interface EmployeeRepository 
					extends JpaRepository<Employee, Long>{

}
