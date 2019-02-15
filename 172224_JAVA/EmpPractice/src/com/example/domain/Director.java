package com.example.domain;

public class Director extends Manager {
	private double budget;

	public Director(int employeeId, String employeeName, String employeeSSN, double employeeSalary, String deptName,double budget) {
		super(employeeId, employeeName, employeeSSN, employeeSalary, deptName);
		// TODO Auto-generated constructor stub
		this.budget=budget;
	}

	public double getBudget() {
		return budget;
	}
	
	

}
