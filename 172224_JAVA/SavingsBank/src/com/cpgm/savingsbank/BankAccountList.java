package com.cpgm.savingsbank;

import java.util.TreeSet;

public class BankAccountList {
	
	TreeSet <SavingAccount> acc_set= new TreeSet<SavingAccount>();
	public void addAccount(SavingAccount acc)
	{
		
		acc_set.add(acc);
	}
	public TreeSet<SavingAccount> getallDetails()
	{
		return acc_set;
		
		
	}
}
   