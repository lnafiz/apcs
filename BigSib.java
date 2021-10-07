public class BigSib {
	String helloMsg;
	BigSib richard = new BigSib();
	
	public BigSib (){
		richard.setHelloMsg("Word up");	
	}
	
	public void setHelloMsg(String msg) {
		helloMsg = msg;
	}

	public String greet(String msg) {
		return helloMsg + " " + msg;
	}
}
