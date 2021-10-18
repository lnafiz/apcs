// Nafiz Labib, Jing Yi Feng, Jomin Zhang - Heroes of the Zeroes
// APCS
// HW 18 - CPA-One
// 2021-10-17

// DISCO -
// - Skeleton used short retun type for PIN instead of PIN. 
// - When doing double's calculations, there are a lot of unnecessary digits apearing in the cents part, with a 1 at the end. 

// QCC - 
// - Using the actual return types for set<variable> gives me errors of return type needed, but when I used void instead, it worked. why?

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
	
	public void setName( String newName ) {
    		name = newName;
		System.out.println("New name: " + newName);
  }

  public void setPasswd( String newPasswd ) {
    		accPass = newPasswd;
	  	System.out.println("New password: " + newPasswd);
  }

  public void setPin( int newPin ) {
    		PIN = newPin;
	  	System.out.println("New PIN: " + PIN);
  }

  public void setAcctNum( int newAcctNum ) {
    		accNum = newAcctNum;
	  	System.out.println("New account number: " + newAcctNum);
  }

  public void setBalance( double newBalance ) {
  		balance = newBalance;
	  	System.out.println("New Balance: " + newBalance);
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
	Jomin.setName("Jomin Zhang");
	Jomin.setPasswd("jominzhang");
	Jomin.setPin(9876);
	Jomin.setAcctNum(987654321);
	Jomin.setBalance(5000);
	}
	
}


