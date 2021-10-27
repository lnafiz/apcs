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
 /* 
  public static String fenceR(int numPosts){
  
  } //end of fenceR
  */
public static void main(String[] args){
  System.out.println(fenceW(1));
  System.out.println(fenceW(3));

} //end of main
} //end of class
