// Phase 0 Without Jacob: Nafiz, Alif, Areilla
// APCS
// HW 14 - Customize Your Creation
// 2021-10-08

// DISCO:
// - With other constructors that have specified parameters, default constructor gets overridden. 
// - Must specify default to be able to use it.

// QCC:
// - I'm almost there. I just have to figure out how to have separate helloMsg's for each person because in the end, everyone says "Salutations", because it's the most recent
// - definition of helloMsg.


public class BigSib {
	String helloMsg;
	
	public BigSib() {
	if BigSib richard = new BigSib();
		helloMsg = "Word up";
	BigSib richard = new BigSib(helloMsg);
	if BigSib grizz = new BigSib();
		helloMsg = "Hey ya";
	BigSib grizz = new BigSib(helloMsg);
	if BigSib dotCom = new BigSib();
		helloMsg = "Sup";
	BigSib dotCom = new BigSib(helloMsg);
	if BigSib tracy = new BigSib();
		helloMsg = "Salutations";
	BigSib tracy = new BigSib(helloMsg);	
	}
	
	public BigSib(String msg) {
		helloMsg = msg;
	}

	public String greet(String msg) {
		return helloMsg + " " + msg;
	}
}
