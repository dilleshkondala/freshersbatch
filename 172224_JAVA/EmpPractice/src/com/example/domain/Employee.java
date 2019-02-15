package com.example.domain;

import java.text.NumberFormat;

public class Employee {
	private int employeeCount=0;
	private Employee[] staff; 
	private int employeeId;
	private String employeeName;
	private String employeeSSN;
	private double employeeSalary;
	

	public Employee(int employeeCount, Employee[] staff, int employeeId, String employeeName, String employeeSSN,
			double employeeSalary) {
		super();
		this.employeeCount = employeeCount;
		this.staff = new Employee[20];
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSSN = employeeSSN;
		this.employeeSalary = employeeSalary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeName(String employeeName) {
		if (employeeName == null)
		{
			System.out.println("Something went wrong.\nPlease Enter the Employee Name");
		}
		else
		{
			this.employeeName = employeeName;
		}
		
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public String getEmployeeSSN() {
		return employeeSSN;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public double raiseSalary(double increase) {
		double totalSalary = increase + employeeSalary;
		if(employeeSalary >= 0)
		{
			System.out.println("Salary Icreased by: " +NumberFormat.getCurrencyInstance().format(increase));
			System.out.println("TOtal Salary: " +NumberFormat.getCurrencyInstance().format(totalSalary));
		}	
		else
		{
			System.out.println("Incorrect Entry of Salary");
		}
		return totalSalary;
	}
	
	int findEmployee() 
	{
		for(int i=0;i<20;i++)
		{
			if(employeeName == staff[i])
			{
				
			}
		}
		return -1;
	}

	
}
