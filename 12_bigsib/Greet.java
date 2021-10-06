// Anthony Sun + Corn, Nafiz Labib + Martha
// APCS
// HW 12 - On Elder Individuality and the Elimination of Radio Fuzz
// 2021-10-05
 
// DISCOVERIES:
//  - Static is not needed for instance method
//  - Generate an object with "new" keyword
// 
//  QCC:
// - Is there a way to implement differences between different objects of the same class?

public class Greet {
  public static void main( String[] args ) {
    String greeting;

    BigSib richard = new BigSib();
    
    richard.setHelloMsg("Word up");
    greeting = richard.greet("freshman");
    System.out.println(greeting);
    
    richard.setHelloMsg("Salutations");
    greeting = richard.greet("Dr. Spaceman");
    System.out.println(greeting);
    
    richard.setHelloMsg("Hey ya");
    greeting = richard.greet("Kong Fooey");
    System.out.println(greeting);
    
    richard.setHelloMsg("Sup");
    greeting = richard.greet("mom");
    System.out.println(greeting);

  } //end main()
} //end Greet
