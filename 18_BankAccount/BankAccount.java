// Nafiz Labib, Jing Yi Feng, Jomin Zhang - Heroes of the Zeroes
// APCS
// HW 18 - CPA-One
// 2021-10-17

// DISCO -

// QCC - 

// Q2 Response - 
// Q3 Response - 

public class BankAccount{
	String name;
	String accPass;
	int PIN;
	int accNum;
	double balance;
	
	public BankAccount(){
	name = "Jomin";
	accPass = "jomin";
	PIN = 1234;
	accNum = 123456789;
	balance = 1000.10;
	}
	
	public void ShowInfo(){
	System.out.println("Name: " + name);
	System.out.println("Account Password: " + accPass);
	System.out.println("PIN: " + PIN);
	System.out.println("Account Number: " + accNum);
	System.out.println("Balance: " + balance);
	}
	
	public void Deposit(double deposit){
		balance = balance + deposit;
		System.out.println("New balance after deposit: " + balance);
	}
	
	public void Withdraw(double withdraw){
		balance = balance - withdraw;
		System.out.println("New balance after withdrawal: " + balance);
	}
	
	public static void main (String [] args){
	BankAccount Jomin = new BankAccount();
	Jomin.ShowInfo();
	Jomin.Deposit(1000.01);
	Jomin.Withdraw(500.01);
	//System.out.println(name);
	//BankAccount.ShowInfo();
	}
	
}


