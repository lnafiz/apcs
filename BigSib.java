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
