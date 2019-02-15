package com.example.domain;

public class Manager extends Employee
{
	private String deptName;
	public Manager(int employeeId, String employeeName, String employeeSSN, double employeeSalary, String deptName) {
		super(employeeId, employeeName, employeeSSN, employeeSalary);
		// TODO Auto-generated constructor stub
		this.deptName=deptName;
	}
	public String getDeptName() {
		return deptName;
	}
	
	
}
