package com.cg.dto;

public class Account {
	private int id;
	private Customer customer;
	private double balance;

	public Account(int id, Customer customer, double balance) {
		this.id = id;
		this.customer = customer;
		this.balance = balance;

	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", customer=" + customer + ", balance=" + balance + "]";
	}

	public int getId() {
		return id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double deposit(double amount) {
		balance = amount + balance;
		System.out.println("Amount deposited= "+amount);
		System.out.println("Current Balance= "+balance);
		return balance;
	}

	public double withdraw(double amount) {
		if (balance >= amount) {
			balance = balance - amount;
			System.out.println("Debited amount= " + amount);
			System.out.println("Current Balance= "+balance);

		} 
		else {
			System.out.println("In-sufficient Balance in your Account");

		}
		return balance;

	}
}