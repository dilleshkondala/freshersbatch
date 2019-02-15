package com.example;

import java.text.NumberFormat;

import com.example.domain.Admin;
import com.example.domain.Director;
import com.example.domain.Employee;
import com.example.domain.Engineer;
import com.example.domain.Manager;

public class EmployeeTest {

	public static void main(String[] args) 
	{
		Employee emp = new Employee(123, "Jane Smith", "123-34-5467", 50000.00);
		EmployeeTest et= new EmployeeTest();
		
		Engineer e1 = new Engineer(123, null, "123-34-5467", 50000.00);
		e1.setEmployeeName(null);
		EmployeeTest.printEmployee(e1);
		System.out.println("----------");
		e1.raiseSalary(5000);
		
		System.out.println("*********************************************************");
		
		Manager m1 = new Manager(123, "Barbara Johnson", "123-34-5467", 30000.00, "US-Marketing");
		m1.setEmployeeName("Mahesh-Manager");
		EmployeeTest.printEmployee(m1);
		System.out.println("Dept Name: "+m1.getDeptName());;
		System.out.println("----------");
		m1.raiseSalary(5000);
		
		System.out.println("*********************************************************");
		
		Admin a1 = new Admin(123, "Bill Monroe", "123-34-5467", 50000.00);
		a1.setEmployeeName("Ramesh-Admin");
		EmployeeTest.printEmployee(a1);
		System.out.println("----------");
		a1.raiseSalary(5000);
		
		System.out.println("*********************************************************");
		
		Director d1 = new Director(123, "Sushan Wheeler", "123-34-5467", 20000.00, "Global-Marketing", 34543435533.43535);
		d1.setEmployeeName("Naveen-Director");
		EmployeeTest.printEmployee(e1);
		System.out.println("Dept Name: "+d1.getDeptName());
		System.out.println("Budget: "+d1.getBudget());
		System.out.println("----------");
		d1.raiseSalary(5000);
		
		System.out.println("*********************************************************");

	}


	public static void printEmployee(Employee emp) {
		System.out.println("Employee Id: " + emp.getEmployeeId());
		System.out.println("Employee Name: " + emp.getEmployeeName());
		System.out.println("Employee SSN: " + emp.getEmployeeSSN());
		System.out.println("Employee Salary: " +NumberFormat.getCurrencyInstance().format(emp.getEmployeeSalary()));
	}


}
