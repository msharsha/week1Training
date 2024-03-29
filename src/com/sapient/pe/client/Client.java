package com.sapient.pe.client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


import com.sapient.pe.tutorial.Address;
import com.sapient.pe.tutorial.BankAccount;
import com.sapient.pe.tutorial.CurrentAccount;
import com.sapient.pe.tutorial.Person;

public class Client {

	
	public static void main(String[] args) {
		int flag=1;
		Scanner sc = new Scanner(System.in);
		ArrayList<BankAccount> accounts = new ArrayList<>();
		while(flag==1)
		{
			System.out.println("Welcome to ICICI Bank");
			System.out.println("Enter your name:");
			String name = sc.next();
			System.out.println("Hello "+name);
			System.out.println("MENU:");
			System.out.println("1. Create Account");
			System.out.println("2. Balance Enquiry");
			System.out.println("3. Cash Deposit");
			System.out.println("4. Cash Withdrawal");
			System.out.println("5. Show accounts");
			System.out.println("6. Quit");
			int choice = sc.nextInt();
			Person person=null;
			BankAccount employee=null;
			switch(choice)
			{
				case 1:
					flag=1;
					System.out.println("Enter age:");
					int age = sc.nextInt();
					System.out.println("Enter Marital Status:");
					String mstatus = sc.next();
					System.out.println("Enter Street:");
					String street = sc.next();
					System.out.println("Enter City:");
					String city = sc.next();
					System.out.println("Enter State:");
					String state = sc.next();
					person = new Person(age,name,mstatus,new Address(street,city,state));
					employee = new CurrentAccount(person);
					accounts.add(employee);
					System.out.println("Congrats..Account created");
					System.out.println("Employee Details:"+"\n"+employee.getAccountNo()+" "+employee.getPerson().getName()+" "+employee.getPerson().getAge()+" "+employee.getPerson().getMaritalStatus()+" "+employee.getPerson().getAddress().getStreet()+" "+employee.getPerson().getAddress().getCity()+" "+employee.getPerson().getAddress().getState());
					break;
				case 2:
					flag=1;
					System.out.println("Enter account id: ");
					long accountid = sc.nextLong();
					Iterator<BankAccount> it = accounts.iterator();
					
					while(it.hasNext()) {
						BankAccount acco = it.next();
						if(acco.getAccountNo()==accountid) {
							System.out.println("Your current balance is :"+acco.getBalance());
						}
					}
					break;
				case 3:
					flag=1;
					System.out.println("Enter account id: ");
					long accountidd = sc.nextLong();
					System.out.println("Deposit money ? ");
					double money = sc.nextDouble();
					Iterator<BankAccount> itt = accounts.iterator();
					while(itt.hasNext()) {
						BankAccount accou = itt.next();
						if(accou.getAccountNo()==accountidd) {
							accou.Deposit(money);
						}
					}
					break;
				case 4:
					flag=1;
					System.out.println("Enter account id: ");
					long accountiddd = sc.nextLong();
					System.out.println("Withdraw money ? ");
					double money1 = sc.nextDouble();
					Iterator<BankAccount> ittt = accounts.iterator();
					while(ittt.hasNext()) {
						BankAccount accoun = ittt.next();
						if(accoun.getAccountNo()==accountiddd) {
							accoun.Withdraw(money1);
						}
					}
					break;
				case 5:
					flag=1;
					Client client = new Client();
					client.ShowAccounts(accounts);
					break;
				case 6:
					flag=0;
					break;
			}		
		}
		sc.close();
	
	}
	public void ShowAccounts(ArrayList<BankAccount> accounts)
	{
		for(BankAccount acc : accounts) {
			System.out.println(acc.getAccountNo());
		}
	}
}
