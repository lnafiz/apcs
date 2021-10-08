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
	richard.helloMsg = "Word up";
	grizz.helloMsg = "Word up";
	dotCom.helloMsg = "Word up";
	tracy.helloMsg = "Word up";	
	}
	
	public BigSib(String msg) {
		helloMsg = msg;
	}

	public String greet(String msg) {
		return helloMsg + " " + msg;
	}
}
