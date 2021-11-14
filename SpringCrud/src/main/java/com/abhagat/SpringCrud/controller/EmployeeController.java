package com.abhagat.SpringCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abhagat.SpringCrud.model.Employee;
import com.abhagat.SpringCrud.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/getEmployee")
	public List<Employee> getEmployees() {
		return employeeService.getEmployees();
	}
	
	@PostMapping("/saveEmployee")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);
	}
	
 
}
