public class BigSib {
	String helloMsg;
	
		
	public BigSib (){
		
	}
	
	public void setHelloMsg(String msg) {
		helloMsg = msg;
	}

	public String greet(String msg) {
		return helloMsg + " " + msg;
	}
}
