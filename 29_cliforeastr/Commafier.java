public class Commafier {
    public static String commafyR(int number){
      String stringNumber = Integer.toString(number);
      if (stringNumber.length() <= 3){ 
        return stringNumber;
      }
      else{
        return commafyR(Integer.parseInt(stringNumber.substring(0, stringNumber.length()-3))) + "," + stringNumber.substring(stringNumber.length()-3, stringNumber.length());
      }
    }

    
    public static String commafyF(int number){
      String stringNumber = Integer.toString(number);
      for (int a = 3; a < stringNumber.length(); a += 4){
        stringNumber = stringNumber.substring(0, stringNumber.length()-a) + "," + stringNumber.substring(stringNumber.length()-a, stringNumber.length());
      }
      return stringNumber;
    }

    public static void main(String[] args) {
      for (String arg : args){
        int intArg = Integer.parseInt(arg);
        System.out.println(commafyR(intArg));
      }
/*
      // Testing commafyR
      System.out.println(commafyR(1));
      System.out.println(commafyR(10));
      System.out.println(commafyR(101));
      System.out.println(commafyR(1000));
      System.out.println(commafyR(12345));
      System.out.println(commafyR(100000000));
      
      System.out.println("");
      
      // Testing commafyF
      System.out.println(commafyF(1));
      System.out.println(commafyF(10));
      System.out.println(commafyF(101));
      System.out.println(commafyF(1000));
      System.out.println(commafyF(12345));
      System.out.println(commafyF(100000000));
*/
 }
}
