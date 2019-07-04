package com.sapient.pe.tutorial;

public class SalaryAccount extends BankAccount{

	public SalaryAccount(Person person) {
		super(person);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void Deposit(double money) {
		if(money<=50000) {
			this.balance +=money;
		}
		else {
			System.out.println("You cant deposit more than 50k");
		}
	}
	@Override
	public void Withdraw(double money) {
		this.balance -=money;
	}
	
}
