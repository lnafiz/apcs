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
      return -1 < w.indexOf(letter); // thing we learned in class
  }//end hasA()


  /*=====================================
    boolean isAVowel(String) -- tells whether a letter is a vowel
    precondition: letter.length() == 1
    =====================================*/
  public static boolean isAVowel( String letter ) 
  {
    return -1 < VOWELS.indexOf(letter); 
  }

  
  /*=====================================
    int countVowels(String) -- counts vowels in a String
    pre:  w != null
    post: countVowels("meatball") -> 3
    =====================================*/
  public static int countVowels( String w ) 
  { int numVowels = 0;
   
   for (int i=0; i < w.length(); i++){
     if (isAVowel(w.substring(i,i+1))){
      numVowels += 1;
      }  
   }
   return numVowels;   
  }
  
  
 /*=====================================
    boolean hasAVowel(String) -- tells whether a String has a vowel
    pre:  w != null
    post: hasAVowel("cat") -> true
    hasAVowel("zzz")       -> false
    =====================================*/
  public static boolean hasAVowel( String w ) 
  {
   return countVowels(w) > 0;
  }

  
  public static void main( String[] args ) 
  {
    System.out.println(hasA("cat", "a"));
    System.out.println(hasA("cat", ""));
    System.out.println(isAVowel("a"));
    System.out.println(isAVowel("c"));
    System.out.println(countVowels("meatball"));
    System.out.println(hasAVowel("cat"));
    System.out.println(hasAVowel("zzz"));
  }//end main()

}//end class Pig
