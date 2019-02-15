package com.cg.app;

import com.cg.dto.Customer;
import com.cg.dto.DiscountRate;
import com.cg.dto.Visit;

public class CustomerApp
{
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Customer c =new Customer();
		c.setName("Mary");
		c.setMemberType("Premium");
		c.isMember(true);
		
		Visit v =new Visit();
		v.setServiceExpense(10000);
		v.setProductExpense(8000);
		
		DiscountRate d =new DiscountRate();	
		d.serviceDiscountRate();
		d.productDiscountRate();

		
		
	}

}
