package com.example.employeesummary.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.employeesummary.model.Employee;

public interface EmployeeRespository extends JpaRepository<Employee, Integer> {

}
