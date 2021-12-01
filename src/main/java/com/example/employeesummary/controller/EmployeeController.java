package com.example.employeesummary.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeesummary.dao.EmployeeRespository;
import com.example.employeesummary.model.Employee;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeRespository employeeRespository;
	
	@GetMapping("/Employees")
	public List<Employee> getEmployee() {
		System.out.println("<<<<<<<Get Employee>>>>>>>>>>");
		return employeeRespository.findAll();		
	}
	
	@RequestMapping(value = "/saveemployee", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE, method = {RequestMethod.POST})
	public String saveEmployee(@RequestBody Employee employee) {
		System.out.println("Employee>>>>>>>>>>>>>>>>>>>"+employee.getAge()+employee.getDepartment()+employee.getEmployeeFisrtName()+employee.getEmployeeID());
		employeeRespository.save(employee);
		return "employee saved";
	}

}
