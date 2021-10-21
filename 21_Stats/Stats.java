/**
Nafiz Labib, Jing Yi Feng, Jomin Zhang - Heroes of the Zeroes
APCS
HW 21 - STAtisTically Speaking...
2021-10-20
DISCO -
 - Square root, cube root, and power operations are written as methods which don't need a heading because their functions are already stated.
 - When using Math.sqrt and Math.cbrt operations, for the geoMean methods we want to return integers, we have to specify for integers in the return statement. However, the declaration of the variable must start off with double, no matter what.
QCC -
 - I tried using the power method before switching to root methods. When I used power, I tried entering the power as a fraction and decimal, with the fraction using both decimals and integers. When I used a fraction, the return would be an integer, while a decimal provided with the approximation. Why is that? Power method inherently returns doubles, and even when using fractions, you get decimals, so how does the answer somehow become integers even without the specification for integers?
**/


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
}//end class

