public class BigSib {
	String helloMsg;
	
	public BigSib(){
		super("word up")
	}
	
	public BigSib(String msg) {
		helloMsg = msg;
	}

	public String greet(String msg) {
		return helloMsg + " " + msg;
	}
}
