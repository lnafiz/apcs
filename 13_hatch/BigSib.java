// Anthony Sun + Corn, Nafiz Labib + Martha
// APCS
// HW 13 - Where Do BigSibs Come From?
// 2021-10-06

// DISCOVERIES:
// - You can run tasks in constructor, which are run immediately after object is created with "new"
// - Anthony combined the constuctor and setHelloMsg methods together, while I kept them separate. It works either way.
// - No return types needed for constructor.

// QCC:
// - Is there a way to implement differences between different objects of the same class?

public class BigSib {
	String helloMsg;
	
	public BigSib(String helloMsg){
		this.helloMsg = "word up";	
	}
	public void setHelloMsg(String msg) {
		helloMsg = msg;
	}

	public String greet(String msg) {
		return helloMsg + " " + msg;
	}
}
