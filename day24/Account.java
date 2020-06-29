package day24;
import java.util.*;


public class Account {

	private String account_number;
	private	String name,password,phone;
	private double balance;
	Scanner scanner;
	
	Account()  {
		scanner = new Scanner(System.in);
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


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	

	
	
	
	public void getAccountDatailsFromUser() {
		scanner = new Scanner(System.in);
		System.out.println("Please enter the Customer Account Number");
		account_number=scanner.nextLine();
		System.out.println("Please enter the password");
		password = scanner.nextLine();
		System.out.println("Please enter the Customer name");
		name = scanner.nextLine();
		System.out.println("Please enter the Customer phone Number");
		phone = scanner.nextLine();
		System.out.println("Account Balance account");
		balance = scanner.nextDouble();
				
	}
	
void printAccountDetails() {
		
		System.out.println("User name "+name);
		System.out.println("Password "+password.replaceAll("^[a-zA-Z0-9_]*$","*****"));
		System.out.println("Phone "+phone);
		System.out.println("Account number "+account_number.replaceFirst("[0-9]", "xxxxx"));
		System.out.println("Account balance "+balance);
		System.out.println("------");
	}
	

@Override
public String toString() {
	String data = "accountnumber:" + account_number.replaceFirst("[0-9]","X") + "Name:" + name + " password :" + password.replaceAll("(^[a-zA-Z0-9_]*$)", "**********") + 
			"phone:"+ phone + " balance:" +balance;
	return data;
}
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		Account acc1 =this;
		Account acc2 = (Account)obj;
		try {
			if(acc1.account_number== acc2.account_number)
				result = true;
		} 

		catch (Exception e) {
			result = false;
		}
		return result;
		
	}
	
	
	
	public static void main(String[] args) {
		Account Acc = new Account();
		Acc.getAccountDatailsFromUser();
		Acc.printAccountDetails();
	
	
	
	}}	
