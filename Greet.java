// Anthony Sun + corn, Nafiz Labib + Martha
// APCS
// HW 13 -- constructors
// 2021-10-06

// DISCOVERIES:
// - You can run tasks in constructor, which are run immediately after object is created with "new"
// - Anthony combined the constuctor and setHelloMsg methods together, while I kept them separate. It works either way.
// - No return types needed for constructor.

// QCC:
// - Is there a way to implement differences between different objects of the same class?


public class Greet {
  public static void main( String[] args ) {
    
    String greeting;
    BigSib richard = new BigSib("word up");
    
    greeting = richard.greet("freshman");
    System.out.println(greeting);
    
   
  } //end main()
} //end Greet
