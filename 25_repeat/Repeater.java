public class Repeater{
  
  public static String fenceW(int numPosts){
    
    int post = 1;
    String fence = "|";
    
    while(post < numPosts && numPosts > 0){
    fence+="--|";
    post++; // code for increment  
  }
    return fence;
  } //end of fenceW
  
  public static String fenceR(int numPosts){
  
    if (numPosts == 1){
    return "|";
      }
    else{
    return fenceR(numPosts-1)+"--|";}
  } //end of fenceR
  
public static void main(String[] args){
  System.out.println(fenceW(1));
  System.out.println(fenceW(3));
  System.out.println(fenceW(-1)); // prints original post because it's not part of while loop but does NOT print more posts.
  
  System.out.println(fenceR(1));

} //end of main
} //end of class
