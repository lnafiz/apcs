public class BigSib {
	String helloMsg;
	
	public BigSib(){
	BigSib richard = BigSib("Word up");
	BigSib grizz = BigSib("Hey ya");
	BigSib dotCom = BigSib("Sup");
	BigSib tracy = BigSib("Salutations");
	}
	
	public BigSib(String msg) {
		helloMsg = msg;
	}

	public String greet(String msg) {
		return helloMsg + " " + msg;
	}
}
