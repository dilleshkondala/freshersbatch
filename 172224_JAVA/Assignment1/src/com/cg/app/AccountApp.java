package com.cg.app;

import java.util.Scanner;

import com.cg.dto.Account;

public class AccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a=new Account();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Account holder's Name: ");
		String id1=s.next();
		System.out.println("Enter the Account holder's ID: ");
		String nam=s.next();
		System.out.println("Enter the Account holder's Balance: ");
		int balnce=s.nextInt();
		a.credit(500);
		a.debit(200);
		a.transferTo(654321234, 300);
		System.out.println(a.toString());
	s.close();
	}
}
