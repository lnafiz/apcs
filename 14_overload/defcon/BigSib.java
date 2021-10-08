public class BigSib {
	String helloMsg;
	
	public BigSib(){
		
	helloMsg = "Word up";
	
	}
	
	public BigSib(String msg) {
		helloMsg = msg;
	}

	public String greet(String msg) {
		return helloMsg + " " + msg;
	}
}
