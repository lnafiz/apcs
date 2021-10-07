public class BigSib {
	String helloMsg;

	public BigSib (){
		BigSib richard = new BigSib();
		richard.setHelloMsg("Word up");	
	}
	
	public void setHelloMsg(String msg) {
		helloMsg = msg;
	}

	public String greet(String msg) {
		return helloMsg + " " + msg;
	}
}
