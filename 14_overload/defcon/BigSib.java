public class BigSib {
	String helloMsg;
	
	public BigSib(){
	richard.setHelloMsg("Word up");
	grizz.setHelloMsg("Hey ya");
	dotCom.setHelloMsg("Sup");
	tracy.setHelloMsg("Salutations");
	}
	
	public BigSib(String msg) {
		helloMsg = msg;
	}

	public String greet(String msg) {
		return helloMsg + " " + msg;
	}
}
