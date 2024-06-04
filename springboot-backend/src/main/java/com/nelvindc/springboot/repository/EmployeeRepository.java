package com.nelvindc.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nelvindc.springboot.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
