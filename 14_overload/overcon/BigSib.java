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
	String richardhelloMsg;
	String grizzhelloMsg;
	String dotComhelloMsg;
	String tracyhelloMsg;
	
	public BigSib() {
	richardhelloMsg = "Word up";
	BigSib richard = new BigSib(richardhelloMsg);

	
	grizzhelloMsg = "Hey ya";
	BigSib grizz = new BigSib(grizzhelloMsg);
	

	dotComhelloMsg = "Sup";
	BigSib dotCom = new BigSib(dotComhelloMsg);
		
		
	tracyhelloMsg = "Salutations";	
	BigSib tracy = new BigSib(tracyhelloMsg);
	
	
		

	}
	
	public BigSib(String msg) {
		helloMsg = msg;
	}

	public String greet(String msg) {
		return helloMsg + " " + msg;
	}
}
