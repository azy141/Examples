package com.fdmgroup.bankaccounts;

public class BankAccount {

	private int accountNumber;
	private String accountName;
	private double balance;
	

	public BankAccount() {

	}



	public BankAccount(int accountNumber, String accountName, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.balance = balance;
		
	}



	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		balance = balance + amount;

	}

	public void withdrawal(double amount) {
		if (amount <= balance) {
			balance = balance - amount;
		} else if (amount > balance) {
			System.out.println("Not Enough Funds");

		}

		
	
			
	}
	
		///public String toString(){
		///String str= accountName+", "+accountNumber+", "+ balance+", "+ accountHolder.getFirstName()+", "+ accountHolder.getLastName();
		///return str;
		
		
		
		
		
	}

