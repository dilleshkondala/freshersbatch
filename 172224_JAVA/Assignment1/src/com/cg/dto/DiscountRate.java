package com.cg.dto;

public class DiscountRate
{
	
	private double serviceDiscountPremium=0.2;
	private double serviceDiscountGold=0.15;
	private double serviceDiscountSilver=0.1;
	private double productDiscountPremium=0.1;
	private double productDiscountGold=0.1;
	private double productDiscountSilver=0.1;
	private double discount;
	public DiscountRate()
	{
		
	}
	public double serviceDiscountRate()
	{
		if (Visit.getTotalExpense() != 0) 
		{
			if (Customer.getMemberType() == "Premium")
			{
				discount=  Visit.getServiceExpense() - (Visit.getServiceExpense()*serviceDiscountPremium);
				System.out.println("Welcome " +Customer.getName());
				System.out.println("Congratulations....!!!!");
				System.out.println("You are Premium member now...");
				System.out.println("You have a discount of  "+discount);
			}
		
			else if (Customer.getMemberType() == "Gold")
			{
				discount=  Visit.getServiceExpense() - (Visit.getServiceExpense()*serviceDiscountGold);
				System.out.println("Welcome " +Customer.getName());
				System.out.println("You are Gold member now...");
				System.out.println("You have a discount of  "+discount);
			}
		
			else if (Customer.getMemberType() == "Silver")
			{
				discount=  Visit.getServiceExpense() - (Visit.getServiceExpense()*serviceDiscountSilver);
				System.out.println("Welcome " +Customer.getName());
				System.out.println("You are Silver member now...");
				System.out.println("You have a discount of  "+discount);
			}
			else 
			{
				System.out.println("Sorry..... You are not Authorized to this");
			}
		}
		else
		{
			System.out.println("You have discount of 10%");
		}
			return discount;
	}
	public double productDiscountRate()
	{
		if (Customer.getMemberType() == "Premium")
		{
			discount=  Visit.getProductExpense() - (Visit.getProductExpense()*productDiscountPremium);
			System.out.println("Welcome " +Customer.getName());
			System.out.println("You are Premium member now...");
			System.out.println("You have a discount of  "+discount);
		}
		
		else if (Customer.getMemberType() == "Gold")
		{
			discount=  Visit.getProductExpense() - (Visit.getProductExpense()*productDiscountGold);
			System.out.println("Welcome " +Customer.getName());
			System.out.println("You are Gold member now...");
			System.out.println("You have a discount of  "+discount);
		}
		
		else
		{
			discount=  Visit.getProductExpense() - (Visit.getProductExpense()*productDiscountSilver);
			System.out.println("Welcome " +Customer.getName());
			System.out.println("You are Silver member now...");
			System.out.println("You have a discount of  "+discount);
		}
		return discount;
	}
	
	
	
	
	
	
}
