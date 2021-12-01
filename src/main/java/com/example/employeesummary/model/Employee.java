package com.example.employeesummary.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	private int employeeID;
	private String employeeFisrtName;
	private int age;
	private String department;

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmployeeFisrtName() {
		return employeeFisrtName;
	}

	public void setEmployeeFisrtName(String employeeFisrtName) {
		this.employeeFisrtName = employeeFisrtName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}
