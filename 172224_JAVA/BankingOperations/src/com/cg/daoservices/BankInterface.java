package com.cg.daoservices;

public interface BankInterface {
	public void createAccount();
	public void userValidation();
	public void displayCustomerDetails();
	public double deposit(double amount);
	public double withdrawl(double amount);
	public double toTranfer(double amount, double accountNumber); 
	public int miniStatement();
	
}
