public class Stats {

  public static int mean(int a, int b) {
     int mean = (a+b)/2;
        return mean;
     }
  
  public static double mean (double a, double b) {
     double mean = (a+b)/2;
        return mean;
     }

  public static int max(int a, int b) {
     if (a >= b){
     int max = a;
     return max;
     }
     else{
     int max = b;
     return b;
     }
  }

  public static double max(double a, double b) {
     if (a >= b){
     double max = a;
     return max;
     }
     else{
     double max = b; 
     return b;
     }
  }
   
  public static double geoMean(int a, int b) {
     double geoMean = Math.sqrt(a*b);
        return (int) geoMean;
  //IMPORTANT: LOOK AT DISCO
  //IMPORTANT: LOOK AT DISCO
  }
   
  public static double geoMean(double a, double b) {
     double geoMean = Math.sqrt(a*b);
     return geoMean;

  }

  public static int max(int a, int b, int c) {
     int max = a;
     if (a >= b && a >= c){
        max = a;
     }
     if (b >= a && b >= c){
        max = b;
     }
     if (c >= a && c >= b){
        max = c;
     }
     return max;
 }

  public static double max(double a, double b, double c) {
     double max = a; 
     if (a >= b && a >= c){
        max = a;
     }
     if (b >= a && b >= c){
        max = b;
     }
     if (c >= a && c >= b){
        max = c;
     }
     return max; 
 }

  public static int geoMean(int a, int b, int c) {
      double geoMean = Math.cbrt(a*b*c);
      return (int) geoMean;
  //IMPORTANT: LOOK AT DISCO
  //IMPORTANT: LOOK AT DISCO
  }

  public static double geoMean(double a, double b, double c) {
      double geoMean = Math.cbrt(a*b*c);
      return geoMean;
  }
  
  public static int gcd(int a, int b){
      int divisor;
      if (a > b){
      divisor = b;
      }
      else{
      divisor = a;
      }
      while (a % divisor != 0 || b % divisor != 0){
      divisor += -1;
      }
      return divisor;
      }
  
  
  public static void main(String [] args){
  System.out.println("GCD: " + gcd(9,12));
  }
}//end class
