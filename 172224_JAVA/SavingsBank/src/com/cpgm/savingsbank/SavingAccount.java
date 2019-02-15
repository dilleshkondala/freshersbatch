package com.cpgm.savingsbank;

public class SavingAccount implements Comparable<SavingAccount> {
	private double accountBalance;
	private int accountId;
	private String accountHolderName;
	private boolean isSalaryAccount;
	public SavingAccount(double accountBalance, int accountId, String accountHolderName, boolean isSalaryAccount) {
		super();
		this.accountBalance = accountBalance;
		this.accountId = accountId;
		this.accountHolderName = accountHolderName;
		this.isSalaryAccount = isSalaryAccount;
	}
	
	public SavingAccount() {
		super();
	}

	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}
	public void setSalaryAccount(boolean isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}
	
	public double withdrawl(int amount)
	{
		return accountBalance;
	}
	
	public double deposit(int amount)
	{
		return accountBalance;
	}

	@Override
	public int compareTo(SavingAccount acc) {
		// TODO Auto-generated method stub
		if(this.getAccountId() > acc.getAccountId())
			return 1;
		else
			return -1;
		
	}

	@Override
	public String toString() {
		return "SavingAccount [accountBalance=" + accountBalance + ", accountId=" + accountId + ", accountHolderName="
				+ accountHolderName + ", isSalaryAccount=" + isSalaryAccount + "]";
	}
	
	
}
