package com.cg.dto;

import java.util.Date;

public class Visit
{
	private static Customer Customer;
	private static double serviceExpense; 
	private static double productExpense; 
	public static double totalExpense;
	Date date;
	
	
	
	public Visit() 
	{
		super();
	}
	
	public String getName() {
		return getName();
	}
	public void setName(String name) {
		name = getName();
	}
	
	public static double getServiceExpense() {
		return serviceExpense;
	}

	public void setServiceExpense(double serviceExpense) {
		Visit.serviceExpense = serviceExpense;
	}

	public static double getProductExpense() {
		return productExpense;
	}

	public void setProductExpense(double productExpense) {
		Visit.productExpense = productExpense;
	}

	public static double getTotalExpense() {
		totalExpense = serviceExpense + productExpense;
		System.out.println("Welcome to "+com.cg.dto.Customer.getName());
		System.out.println("Total Expenses= "+totalExpense);
		return totalExpense;
	}
	
	
	
}
