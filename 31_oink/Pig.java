/***
 * Heroes of the Zeroes: Nafiz Labib, Jing Yi Feng, Jomin Zhang 
 * APCS
 * HW31: Otnay Ybay ethay Airhay Onway Ymay Inneechay Inchay Inchay
 * 2021-11-04
 * Time Spent: _hrs
 *
 * class Pig
 * a Pig Latin translator
 * ~~~~~~~~~~~~~~~~~~~ SKELETON ~~~~~~~~~~~~~~~~~~~
 *           9
 *     ,--.-'-,--.
 *     \  /-~-\  /
 *    / )' a a `( \
 *   ( (  ,---.  ) )
 *    \ `(_o_o_)' /
 *     \   `-'   /
 *      | |---| |
 *      [_]   [_]
 *      PROTIP: Make this class compilable first,
 *      then develop and test one method at a time.
 *      NEVER STRAY TOO FAR FROM COMPILABILITY/RUNNABILITY!
 ***/

public class Pig
{
  //Q: How does this initialization make your life easier?
  private static final String VOWELS = "aeiou";


  /*=====================================
    boolean hasA(String,String) -- checks for a letter in a String
    pre:  w != null, letter.length() == 1
    post: hasA("cat", "a") -> true
    hasA("cat", "p")       -> false
    =====================================*/
  public static boolean hasA( String w, String letter ){ 
      boolean exists;
   
    for (int i = 0; i < w.length(); i++){
      if (w.substring(i,i+1).equals(letter)){
      exists = true;
      }
      else{
      exists = false;
      }
    }
      return exists;
  }//end hasA()

 
  

  public static void main( String[] args ) 
  {
    System.out.println(hasA("cat", "a"));
    System.out.println(hasA("cadillac", "c"));
  }//end main()

}//end class Pig
