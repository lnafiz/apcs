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
	BigSib richard = new BigSib(helloMsg);
		richard.helloMsg = "Word up";
		return richard.helloMsg

	BigSib grizz = new BigSib(helloMsg);
		grizz.helloMsg = "Hey ya";
		return grizz.helloMsg

	BigSib dotCom = new BigSib(helloMsg);
		dotCom.helloMsg = "Sup";
		return dotCom.helloMsg
			
	BigSib tracy = new BigSib(helloMsg);
		tracy.helloMsg = "Salutations";
		return dotCom.helloMsg

	}
	
	public BigSib(String msg) {
		helloMsg = msg;
	}

	public String greet(String msg) {
		return helloMsg + " " + msg;
	}
}
