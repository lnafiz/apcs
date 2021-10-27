/***
Nafiz Labib, Jing Yi Feng - Dream Team
APCS
HW 25 - Do I repeat myself?
2021-10-26
Time Spent: ~ 20 minutes
DISCO - 
- Without any conditions addressing negative integer inputs, you run into errors with fenceR. You'll get a StackOverflow error because there's no limit for when post creation should be stopped (when posts reach 1).
- Need to make another variable for the number of matches, and make sure its value increases after each match.

QCC - N/A
***/

public class Repeater{
  
  public static String fenceW(int numPosts){
    
    int post = 1;
    String fence = "|";
    
    while(post < numPosts){
    fence+="--|";
    post++; // code for increment  
  }
    return fence;
  } //end of fenceW
  
  public static String fenceR(int numPosts){
  
    if (numPosts == 1 || numPosts < 0){
    return "|";
      }
    else{
    return fenceR(numPosts-1)+"--|";} // this line creates recursion, as it returns a method with argument which must be carried out.
  } //end of fenceR
  
public static void main(String[] args){
  System.out.println("fenceW Results...");
  System.out.println(fenceW(1));
  System.out.println(fenceW(3));
  System.out.println(fenceW(-1)); // prints original post because it's not part of while loop but does NOT print more posts.
  
  System.out.println("\nfenceR Results...");
  System.out.println(fenceR(1));
  System.out.println(fenceR(3));
  System.out.println(fenceR(-1)); // prints original post because it's part of condition, but does NOT print more posts.


} //end of main
} //end of class
