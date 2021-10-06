// Anthony Sun + Corn, Nafiz Labib + Martha
// APCS
// HW12 - On Elder Individuality and the Elimination of Radio Fuzz
// 2021-10-05
 
// DISCOVERIES:
//  - Static is not needed for instance method
//  - Generate an object with "new" keyword
// 
//  QCC:
// - Is there a way to implement differences between different objects of the same class?
 

public class BigSib {
	String helloMsg;

	public void setHelloMsg(String msg) {
		helloMsg = msg;
	}

	public String greet(String msg) {
		return helloMsg + " " + msg;
	}
}
