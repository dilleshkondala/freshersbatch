package com.cpgm.savingsbank;

public class BankRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccountList banklist = new BankAccountList();

		SavingAccount acc1 = new SavingAccount(1034, 101, "Dillesh", true);
		SavingAccount acc2 = new SavingAccount(1043, 102, "Dillesh1", true);
		SavingAccount acc3 = new SavingAccount(1032, 103, "Dillesh3", false);

		banklist.addAccount(acc1);
		banklist.addAccount(acc2);
		banklist.addAccount(acc3);
		
		for(SavingAccount s:banklist.getallDetails())
		{
			System.out.println(s);
		}
	}

}
