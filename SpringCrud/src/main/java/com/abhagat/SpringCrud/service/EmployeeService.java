package com.abhagat.SpringCrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abhagat.SpringCrud.model.Employee;
import com.abhagat.SpringCrud.repo.EmployeeRepo;

@Service // Service 
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo employeeRepo;
	
	public List<Employee> getEmployees() {
		return employeeRepo.findAll();
	}
	public Employee saveEmployee(Employee employee) {
		return employeeRepo.save(employee);
	}

}
