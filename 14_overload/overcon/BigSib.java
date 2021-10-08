// Phase 0 Without Jacob: Nafiz, Alif, Areilla
// APCS
// HW 14 - Customize Your Creation
// 2021-10-08

// DISCO:
// - With other constructors that have specified parameters, default constructor gets overridden. 
// - Must specify default to be able to use it.

// QCC:


public class BigSib {
	String helloMsg;
	
	public BigSib() {
		helloMsg = "Word up";
	BigSib richard = new BigSib(helloMsg);
	BigSib grizz = new BigSib(helloMsg);
	BigSib dotCom = new BigSib(helloMsg);
	BigSib tracy = new BigSib(helloMsg);	
	}
	
	public BigSib(String msg) {
		helloMsg = msg;
	}

	public String greet(String msg) {
		return helloMsg + " " + msg;
	}
}
