/***
Nafiz Labib, Jing Yi Feng - Dream Team
APCS
HW 24 - Get It While You Can
2021-10-25
Time Spent: ~20 minutes
DISCO - 
- Starting with a matchCtr value of zero is not good, because your loop just won't run, because it's already less than 65536 AND dividing it by any number gives 0. So, to run it, I set the value to 1, and increased the less than condition to 65537.
- Using an AND in the condition does not work, you'll only get 2005 matches because it'll stop when just one of the conditions becomes false, which is the divisible by birth year. To counter this, use OR. OR only needs 1 statement to be true, and is false only when BOTH conditions are false.

QCC - Everything is public, so why does Java tell me that headsCtr is not found in class Driver?
***/

public class Driver {

  public static void main( String[] args ) {

    //build Objects from blueprint specified by class Coin


    //test default constructor
      Coin mine = new Coin();
      //test 1st overloaded constructor
      Coin yours = new Coin( "quarter" );
      //test 2nd overloaded constructor
      Coin wayne = new Coin( "dollar", "heads" );
      //test toString() methods of each Coin
      System.out.println("mine: " + mine);
      System.out.println("yours: " + yours);
      System.out.println("wayne: " + wayne);
      
      //test flip() method
      int matchCtr = 1;
      while(matchCtr <= 65537 || matchCtr%2005 != 0){
      System.out.println("\nAfter flipping...");
      yours.flip();
      yours.getHeadsCtr();
      wayne.flip();
      wayne.getHeadsCtr();
      System.out.println("yours: " + yours);
      System.out.println("wayne: " + wayne);
      //test equals() method
      if ( yours.equals(wayne) ) {
          matchCtr+=1;
        System.out.println( "Matchee matchee!" );
      }
      else {
        System.out.println( "No match. Firestarter you can not be." );
        }
      }
     System.out.println("\nNUMBER OF MATCHES: " + matchCtr);
  }//end main()

}//end class
