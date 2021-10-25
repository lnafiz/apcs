/***
Nafiz Labib, Jing Yi Feng - Dream Team
APCS
HW 23 - What Does Equality Look Like?
2021-10-24

DISCO - First time I tried printing out the results of my constructors, I get locations where new Coins are stored instead of actual string outputs (Coin@85ede7b) 

QCC - 
 ***/

public class Coin {

  //attributes aka instance vars
  double value;
  String upFace;
  String name;
  int flipCtr;
  int headsCtr;
  int tailsCtr;
  double bias;
  


  /***
   *  Coin() -- default constuctor
   *  precond:
   *  postcond:
   ***/
  public Coin() {
  name = "null";
  upFace = "heads";
  flipCtr = 0;
  headsCtr = 0;
  tailsCtr = 0;
  bias = 0.5;
    }


  /***
      Coin(String) -- overloaded constructor
      precond: input is one of
      "penny",
      "nickel",
      "dime",
      "quarter",
      "half dollar",
      "dollar"
      postcond:
  ***/
  public Coin( String s ) {
    if ((s == "penny")|| (s == "nickel") || (s == "dime")|| (s=="quarter")|| (s== "half dollar" )|| (s == "dollar")){
            name = s;
    } else {
  System.out.println("Invalid coin name");

}
upFace="heads";
}

  /***
      Coin(String,String) --
      precond:
      postcond:
  ***/
  public Coin( String s, String nowFace ) {
    if ((s == "penny")|| (s == "nickel") || (s == "dime")|| (s=="quarter")|| (s== "half dollar" )|| (s == "dollar")){
      name = s;
    }
    if((nowFace == "heads")|| (nowFace == "tails")){
      upFace = nowFace;
    }

}
}                                                                                                       
