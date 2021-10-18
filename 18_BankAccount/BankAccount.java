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
	
	public String setName( String newName ) {
    		name = newName;
  }

  public String setPasswd( String newPasswd ) {
    		accPass = newPasswd;
  }

  public int setPin( short newPin ) {
    		PIN - newPin;
  }

  public int setAcctNum( int newAcctNum ) {
    		accNum = newAcctNum;
  }

  public double setBalance( double newBalance ) {
  		balance = newBalance;
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
	Jomin.ShowInfo();
	}
	
}


