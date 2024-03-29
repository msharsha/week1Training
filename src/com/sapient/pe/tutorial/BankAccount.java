package com.sapient.pe.tutorial;

public abstract class BankAccount {

	private final long accountId;
	private static long accountNo=1234;
	protected double balance = 0;
	private final Person person;
	
	
	public BankAccount(Person person) {
		this.accountId = ++accountNo;
		this.person = person;
	}
	public Person getPerson() {
		return person;
	}

	public long getAccountNo() {
		return this.accountId;
	}

	public double getBalance() {
		return balance;
	}
	
	public abstract void Deposit(double money);
	
	public abstract void Withdraw(double money);
}
