package com.cg.app;

import java.util.Scanner;

import com.cg.dto.Account;
import com.cg.dto.Customer;

public class AccountApp {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Welcome to our Bank......");
		Customer c = new Customer(1, "Dillesh", 'M');
		Account a = new Account(1234, c, 10000.00);
		System.out.println("Enter amount to deposut: ");
		double ad = scn.nextDouble();
		a.deposit(ad);

		System.out.println("Enter amount to withdraw: ");
		double aw = scn.nextDouble();
		a.withdraw(aw);

		
		System.out.println("Account details");
		System.out.println(a);
	}

}
