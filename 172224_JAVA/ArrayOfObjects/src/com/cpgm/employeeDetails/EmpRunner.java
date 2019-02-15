package com.cpgm.employeeDetails;

import java.util.Scanner;

public class EmpRunner {
	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter No.of Entries: ");
		int noOfEntries = scanner.nextInt();
		
		Employee[] empList = new Employee[noOfEntries];
		
		for(int i=0;i<noOfEntries;i++)
		{
			empList[i] = new Employee();
		}
		for(int i=0; i<noOfEntries;i++)
		{
			System.out.println("Entering the "+(i+1)+"entry");
			empList[i].addEmployee();
			
		}
		
		System.out.println("***********Employee Details***********");
		for(int i=0;i<noOfEntries;i++)
		{
			empList[i].displayEmployee();
		}
		
		
	}

}
