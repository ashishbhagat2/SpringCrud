package com.abhagat.SpringCrud.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhagat.SpringCrud.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
