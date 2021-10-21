/**
Nafiz Labib, Jing Yi Feng, Jomin Zhang - Heroes of the Zeroes
APCS
HW 21 - STAtisTically Speaking...
2021-10-20
DISCO -
 - When using Math.sqrt and Math.cbrt operations, for the geoMean methods we want to return integers, we have to specify for integers in the return statement. However, the declaration of the variable must start off with double, no matter what.
QCC -
 - How compound can if methods be (there's two so far, if and else)?
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

