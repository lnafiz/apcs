

public static void main( String[] args ) {
    
    BankAccount ba = new BankAccount();
    ba.setName("BA");
    ba.setPasswd("bank");
    ba.setPin((short) 1234);
    ba.setAcctNum(123456789);
    ba.setBalance(10);
    ba.deposit(20.0);
    ba.withdraw(10.0);
    System.out.println(ba.toString());
    
