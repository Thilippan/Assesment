package day24;

import java.util.Scanner;
import java.util.ArrayList;

public class Bank implements Comparable<Bank> {
Scanner scanner;
ArrayList<Bank> accounts;

Bank(){
	accounts = new ArrayList<Bank>();
	scanner= new Scanner(System.in);
}


private  String account_number,name,password,phone ;
int balance,withdraw;


public Scanner getScanner() {
	return scanner;
}

public void setScanner(Scanner scanner) {
	this.scanner = scanner;
}

public ArrayList<Bank> getAccounts() {
	return accounts;
}

public void setAccounts(ArrayList<Bank> accounts) {
	this.accounts = accounts;
}

public String getAccount_number() {
	return account_number;
}

public void setAccount_number(String account_number) {
	this.account_number = account_number;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}

public int getBalance() {
	return balance;
}

public void setBalance(int balance) {
	this.balance = balance;
}

public int getWithdraw() {
	return withdraw;
}

public void setWithdraw(int withdraw) {
	this.withdraw = withdraw;
}

Bank(String account_number ,String name ,String password, String phone ,int balance,int withdraw){
	this.account_number=account_number;
	this.name=name;
	this.password=password;
	this.phone=phone;
	this.balance=balance;
}

void takeAccountDetailsFromUser() {
	System.out.println("Enter the Account number");
	account_number=scanner.nextLine();
	System.out.println("Enter the User Name");
	name=scanner.nextLine();
	System.out.println("Enter the password");
	password=scanner.nextLine();
	System.out.println("Enter the Customer phone Number");
	phone=scanner.nextLine();
	System.out.println("Enter the Account Balance");
	balance=scanner.nextInt();
	
	}

void addaccount() {
	Bank bank = new Bank();
	bank.takeAccountDetailsFromUser();
	scanner.nextLine();
	accounts.add(bank);
	
}

public void addAccounts() {
	
	String choice = "No";
	do {
		addaccount();
		System.out.println("Do u want to add  Account?? Enter in Yes for next entry and No for quiting");
		choice = scanner.nextLine();
		} while (!choice.toLowerCase().equals("no"));
	System.out.println("Accounts added");
	System.out.println("--------------------");
}


public void printAccountDetails() {
	for (Bank acc : accounts) {
		System.out.println(acc);
		System.out.println("--------------------");
	}
}
void withdraw(int withdraw,int balance) {
    balance = balance - withdraw;   
	System.out.println("withdraw status");
	System.out.println("enter the amount to withdraw");
	withdraw=scanner.nextInt();
	scanner.nextLine();
	if (withdraw<=balance)
	System.out.println("Please collect your money");
	else
		System.out.println("you does not have sufficient balance");
	
	                             
	
	}
void transact() {
	int userChoice = 0;
	do {
		System.out.println("--------------------");
		System.out.println("1. Withdraw");
		System.out.println("2.Deposit");
		System.out.println("3.Enter exit and Other Option");
		System.out.println("--------------------");
		userChoice  = scanner.nextInt();
		switch (userChoice ) {
		case 1:
		withdraw(userChoice,userChoice);
						
			break;
		case 2:
			deposit(userChoice, userChoice);			
			break;
		
		case 3:
			System.out.println("exiting.....");
			break;
		default:
			System.out.println("Invalid option.. Try again");
			break;
		}
		
	} while (userChoice!=3);
}
void deposit(double deposit,double balance) {
	try{
	System.out.println("Enter the Deposit amount");
	
	deposit =scanner.nextDouble();
	
	 balance = balance + deposit;
	 System.out.println("Deposit status");
	System.out.println("Your Money has been successfully Deposited");
	System.out.println("Deposited amount  is"+balance);
}
catch(Exception e){
	
	System.out.println("Error Occured");
	e.printStackTrace();
}}

@Override
public String toString() {
	return "Bank [account_number=" + account_number + ", name=" + name + ", password=" + password + ", phone=" + phone
			+ ", balance=" + balance + ", withdraw=" + withdraw + "]";
}

@Override
public int compareTo(Bank o) {
	return this.getAccount_number().compareTo(o.getAccount_number());
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank = new Bank();
		bank.addAccounts();
		bank.transact();
		bank.printAccountDetails();
		
	}
}