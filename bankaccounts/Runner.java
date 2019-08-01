package com.fdmgroup.bankaccounts;

public class Runner {

	public static void main(String[] args) {

		BankAccount bankAccount = new BankAccount();
		bankAccount.setAccountNumber(12345678);
		int accNumber = bankAccount.getAccountNumber();
		System.out.println(accNumber);
		
		bankAccount.setAccountName("Aaron");
		String accName = bankAccount.getAccountName();
		System.out.println(accName);		
		
		bankAccount.setBalance(100.0);
		double balance = bankAccount.getBalance();
		System.out.println(balance);
		
		AccountHolder accountHolder = new AccountHolder("Aaron", "Kashab");
		BankAccount aaronsAccount = new BankAccount(987654,"Aaron", 10000.0);
		int aaronAccountNum= aaronsAccount.getAccountNumber();
		String aaronAccountName= aaronsAccount.getAccountName();
		double aaronBalance= aaronsAccount.getBalance();
		
		
		System.out.println(aaronAccountNum);
		System.out.println(aaronAccountName);
		System.out.println(aaronBalance);
		
		aaronsAccount.deposit(50);
		aaronBalance= aaronsAccount.getBalance();
		System.out.println(aaronBalance);

		
		aaronsAccount.withdrawal(101000);
		aaronBalance= aaronsAccount.getBalance();
		System.out.println("Your Balance is: "+aaronBalance);
		
		CurrentAccount currentAccount = new CurrentAccount(1111,"Aaron",1000.0);
		System.out.println("Current Account Balance: "+currentAccount.getBalance());
		currentAccount.withdrawal(1000);
		
		System.out.println("Current Account Balance: "+currentAccount.getBalance());
		currentAccount.withdrawal(100);
		
		System.out.println("Current Account Balance: "+currentAccount.getBalance());
		currentAccount.withdrawal(100);
		
		System.out.println("Current Account Balance: "+currentAccount.getBalance());
		currentAccount.withdrawal(100);
	}
	

}
