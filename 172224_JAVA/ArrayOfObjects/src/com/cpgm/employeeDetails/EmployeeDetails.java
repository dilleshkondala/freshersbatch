package com.cpgm.employeeDetails;

public class EmployeeDetails {
	private String employeeName;
	private int employeeId;
	private double employeeSalary;
	public EmployeeDetails(String employeeName, int employeeId, double employeeSalary) {
		super();
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.employeeSalary = employeeSalary;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	
	
	
}
