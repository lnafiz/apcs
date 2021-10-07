public class BigSib {
	String helloMsg;
	
	public BigSib(string helloMsg){
		this.helloMsg = "word up"	
	}
	public void setHelloMsg(String msg) {
		helloMsg = msg;
	}

	public String greet(String msg) {
		return helloMsg + " " + msg;
	}
}
