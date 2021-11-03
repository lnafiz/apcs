public class Commafier {
    public static String commafyR(int input){
      String stringInput = Integer.toString(input);
      if (stringInput.length() <= 3){ // base case
        return stringInput;
      }
      else{ // recursive reduction
        return commafyR(Integer.parseInt(stringInput.substring(0, stringInput.length() - 3))) + "," + stringInput.substring(stringInput.length() - 3, stringInput.length());
      }
    }

    public static String commafyF(int input){
      String stringInput = Integer.toString(input);
      for (int counter = 3; counter < stringInput.length(); counter += 4){ // changes by 4 to account for extra comma character
        stringInput = stringInput.substring(0, stringInput.length() - counter) + "," + stringInput.substring(stringInput.length() - counter, stringInput.length());
      }
      return stringInput;
    }

    public static void main(String[] args) {
      // foreach loop
      for (String arg : args){
        int intArg = Integer.parseInt(arg);
        System.out.println(commafyR(intArg));
      }
 }
}
