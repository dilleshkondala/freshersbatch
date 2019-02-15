package com.cg.bank;

import java.util.Scanner;

import com.cg.daoservices.AccountMethods;

public class BankMainClass {
	public static void main(String args[]) {
		BankMainClass b = new BankMainClass();
		b.display();
	}

	public void display() {
		// TODO Auto-generated method stub
		int ch = 0;
		double deposit_amount;
		double debit_amount;
		double transfer_amount;
		double transfer_accountNumber;
		Scanner scanner = new Scanner(System.in);

		AccountMethods am = new AccountMethods();

		do {
			System.out.println("Welcome to HDFC Bank....");
			System.out.println("-------Main Menu-------");
			System.out.println("1. Create Account");
			System.out.println("2. Display Account Details");
			System.out.println("3. Deposit");
			System.out.println("4. Withdrawl");
			System.out.println("5. Transfer Money");
			System.out.println("6. Exit");
            System.out.println("Select your choice: ");
			ch = scanner.nextInt();

			switch (ch) {
			case 1:
				am.createAccount();
				break;
			case 2:
				am.displayCustomerDetails();
				break;
			case 3:
				am.userValidation();
				break;
			case 4:
				am.userValidation();
				System.out.println("Enter the amount to withdraw: ");
				debit_amount = scanner.nextDouble();
				am.withdrawl(debit_amount);
				System.out.println("\n");
				break;
			case 5:
				am.userValidation();
				System.out.println("Enter the amount to transfer: ");
				transfer_amount = scanner.nextDouble();
				System.out.println("Enter the Transfer Account to: ");
				transfer_accountNumber = scanner.nextDouble();
				am.toTranfer(transfer_amount, transfer_accountNumber);
				System.out.println("\n");
				break;
			case 6:
				am.userValidation();
				am.miniStatement();
				break;
			case 7:
				System.out.println("Thank you for using our Bank ");
				break;
			default:
				System.out.println("invalid");
				break;

			}
			
		}while (ch != 0);

	

}

}










