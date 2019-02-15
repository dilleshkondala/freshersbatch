package com.cg.daoservices;

import java.util.HashMap;
import java.util.Scanner;

public class AccountMethods implements BankInterface{

	double balance;
	double accountNumber;
	String username;
	String user_password;
	String password;
	//CustomerDetailsInfo
	String customerFirstName;
	String customerLastName;
	String customerDob;
	String customerPAN;
	String customerGender;
	String customerLocation;
	double deposit_amount; 
	int customerPinCode;
	
	Scanner scanner = new Scanner(System.in);
	@Override
	public void createAccount() {
		System.out.println("Entere your First Name: ");
		customerFirstName = scanner.next();
		System.out.println("Enter your Last Name: ");
		customerLastName = scanner.next();
		System.out.println("Entere your Date of Birth: ");
		customerDob = scanner.next();
		System.out.println("Entere your valid PAN Card Number: ");
		customerPAN = scanner.next();
		System.out.println("Enter your Gender");
		customerGender = scanner.next();
		System.out.println("Enter your Location: ");
		customerLocation = scanner.next();
		System.out.println("Enter your valid PIN Code: ");
		customerPinCode = scanner.nextInt();
		
		System.out.println("Thank you for create an account");
		System.out.println("Your Account is created successfully... ");
		
	}
	@Override
	public void displayCustomerDetails() {
		System.out.println("Hello "+customerFirstName+customerLastName);
		System.out.println("Name	: "+customerFirstName);
		System.out.println("DOB		: "+customerDob);
		System.out.println("PAN Card: "+customerPAN);
		System.out.println("Gender  : "+customerGender);
		System.out.println("Location: "+customerLocation);
		System.out.println("PIN Code: "+customerPinCode);
		
	}

	@Override
	public void userValidation() 
	{
		
		HashMap<String,String> hashmap = new HashMap<String,String>();
		hashmap.put("dillesh", "d123");
		hashmap.put("rishee", "r123");
		hashmap.put("simmy", "s123");
		hashmap.put("koormi", "k123");
		hashmap.put("mounika", "m123");
		
		System.out.println("Enter your UserID: ");
		username = scanner.next();		
		
		System.out.println("Enter your Password: ");
		user_password = scanner.next();
	
		if(user_password.equals(hashmap.get(username)))
		{
			System.out.println("You are successfully Loginned....\n");
			System.out.println("Enter the amount to deposit: ");
			deposit_amount = scanner.nextDouble();
			deposit(deposit_amount);
			System.out.println("\n");
		}
		else
		{
			System.out.println("Invalid Entry.\nPlease Try again with the valid user credentials....\n");
		    
		}
		
	}

	@Override
	public double deposit(double amount) {
		if(amount != 0)
		{
			balance += amount;
			System.out.println("Credited Amount= "+amount);
			System.out.println("Current Balance= "+balance);
		}
		else
		{
			System.out.println("Invalild Entry of amount");
		}
		return balance;
	}

	@Override
	public double withdrawl(double amount) {
		if(balance >= amount)
		{
			balance -= amount;
			System.out.println("Debited Amount= "+amount);
			System.out.println("Current Balance= "+balance);
		}
		else
		{
			System.out.println("Insufficient Balance");
		}
		return balance;
	}

	public double toTranfer(double amount, double accountNumber) {
		if(balance >= amount)
		{
			balance -= amount;
			System.out.println("Transfer amount= "+amount+" this Account No: "+accountNumber);
			System.out.println("Current Balance= "+balance);
		}
		return balance;
	}

	@Override
	public int miniStatement() {
		
		return 1;
	}

	

	
	
	

	

	
	
}
