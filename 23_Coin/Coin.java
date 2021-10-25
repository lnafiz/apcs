/***
 *  class Coin
 *  by Clyde "Thluffy" Sinclair
 *  SKELETON
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
  bias = 1.0;
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
  if ((s == "penny") || (s == "nickel") || (s == "dime") || (s == "quarter") || (s == "half dollar") || (s == "dollar")){
  name = s; 
  }
  else{
  System.out.println("Name not usable");
  }
  upFace = "heads";                                                                                                     
  }
}
                                                                                                       
