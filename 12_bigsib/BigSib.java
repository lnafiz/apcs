public class BigSib {
	String helloMsg;

	public void setHelloMsg(String msg) {
		helloMsg = msg;
	}

	public String greet(String msg) {
		return helloMsg + " " + msg;
	}
}
