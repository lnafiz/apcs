// Phase 0 Without Jacob: Nafiz, Alif, Areilla
// APCS
// HW 14 - Customize Your Creation
// 2021-10-08

// DISCO:
// - With other constructors that have specified parameters, default constructor gets overridden. 
// - Must specify default to be able to use it.

// QCC:
// - How do I specify a default???

public class BigSib {
	String helloMsg;
	
	public BigSib() {
	BigSib richard = new BigSib("Word up");
	BigSib grizz = new BigSib("Word up");
	BigSib dotCom = new BigSib("Word up");
	BigSib tracy = new BigSib("Word up");	
	}
	
	public BigSib(String msg) {
		helloMsg = msg;
	}

	public String greet(String msg) {
		return helloMsg + " " + msg;
	}
}
