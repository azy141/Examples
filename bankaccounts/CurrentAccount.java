package com.fdmgroup.bankaccounts;

public class CurrentAccount extends BankAccount{
	
	private double overdraft;
	public CurrentAccount(int accountNumber, String accountName, double balance){
		
		super ( accountNumber,accountName,balance );
		this.overdraft=balance*0.1;
		
	}
	
	
	public double getOverdraft() {
		return overdraft;
	}

	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}
	
	public void withdrawal(double amount){
	double newBalance=getBalance()-amount;
	if (newBalance >= -1*overdraft){
		setBalance(newBalance);
		System.out.println("Withdrawing");}
	else System.out.println("Insufficient Funds");
	
		
	
	}	
}
