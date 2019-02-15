package com.cpgm.employeeDetails;

import java.util.Scanner;

public class Employee {
	String employeeName;
	int employeeId;
	double employeeSalary;
	Scanner scanner = new Scanner(System.in);
	
	public Employee(String employeeName, int employeeId, double employeeSalary) {
		super();
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.employeeSalary = employeeSalary;
	}
	
	
	public Employee() {
		super();
	}


	public void displayEmployee()
	{
		System.out.println("EmployeeName= "+employeeName);
		System.out.println("EmployeeID= "+employeeId);
		System.out.println("EmployeeSalary= "+employeeSalary);
		System.out.println("---------------------------------");
	}
	public void addEmployee()
	{
		System.out.println("Enter EmpName: ");
		employeeName = scanner.next();
		System.out.println("Enter EmpId: ");
		employeeId = scanner.nextInt();
		System.out.println("Enter the EmpSaary: ");
		employeeSalary = scanner.nextDouble();
	}
	
	public void removeEmployee()
	{
		
	}
}
