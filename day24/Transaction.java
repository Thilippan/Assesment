package day24;

import java.util.Scanner;

public class Transaction {
/*transaction_number - int
fromAccount - Account
toAccount - Account
amount - Double
type - String(Should be either Cash/Transfer)
status - String*/
	private int transaction_number;
	double balance;
	String fromAccount;
	String toAccount;
	double amount;
	String type;
	String status;
	Scanner scanner;

Transaction(){
	scanner=new Scanner(System.in);
}
int cashDeposit() {
	
	System.out.print("Enter amount to Deposit:");
	amount = scanner.nextInt();
	scanner.nextLine();
	System.out.print("Enter the Account Number to deposit the cash:");	
	toAccount=scanner.nextLine();
	scanner.nextLine();
	if (amount < 0) {
		System.out.println("Invalid Amount");
		return 1;
	}
	//balance = balance + amount;
	 //System.out.println("deposit status");
		System.out.println("Your Money has been successfully deposited");
	return 0;
}


int fundTransfer() {
	
	System.out.print("Enter your Accountnumber");
	fromAccount = scanner.nextLine();
	scanner.nextLine();
	System.out.println("Enter the Accountnumber to transfer :");
	toAccount=scanner.nextLine();
	scanner.nextLine();
	System.out.println("Enter the Amount to transfer :");
	amount=scanner.nextDouble();
		
	if (amount > balance) {
		System.out.println("Invalid Amount");
		return 1;
	}
		System.out.println("Transfered status");
		System.out.println("Your Money has been successfully Transferred");
	return 0;
}

void transactionDetails() {
	
		System.out.println("Transaction Number:" + transaction_number);
		System.out.println("Transaction Type:" + type);
		System.out.println("Amount Transfered:" + amount);
}
@Override
	public String toString() {
	return "TransactionNumber "+transaction_number+"\n Amount "+amount+"\nType "+type+
			"\nStatus "+status;
	}

void transactionMethod() {
	
	System.out.println("Enter Tansaction Number: ");
	transaction_number = scanner.nextInt();
	
	System.out.println("Transaction Type: ");
	type = scanner.next();
	System.out.println("Enter Balance: ");
	balance = scanner.nextInt();
	int menu;
	System.out.println("Menu");
	System.out.println("1. Cash Deposit");
	System.out.println("2. Fund Transfer");
	System.out.println("3. Transaction Detail");
	System.out.println("4. Exit");
	boolean quit = false;
	do {
		System.out.print("Please enter your choice: ");
		menu = scanner.nextInt();
		switch (menu) {
		case 1:
			cashDeposit	();
			break;

		case 2:
			fundTransfer();
			break;

		case 3:
			transactionDetails();
			break;

		case 4:
			quit = true;
			System.out.println("exited");
			break;
		}
	} while (!quit);


}
public static void main(String[] args) {
	Transaction transact=new Transaction();
	transact.transactionMethod();
	
}
}