/**
   Clyde "Thluffy" Sinclair
   APCS
   HW20 --
   2021-10-21
   TASK:
   Implement each method without typecasting.
   xtra: harmonic mean is the reciprocal of the
   arithmetic mean of the reciprocals
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
/*
  public static int geoMean(int a, int b) {
     int geoMean = Math.pow(a*b,1/2);
        return geoMean;
  POWER FUNCTION DOES NOT RETURN INTEGERS, ONLY DOUBLES.
  }
*/
   
  public static double geoMean(double a, double b) {
     double geoMean = Math.pow(a*b,1/2);
     return geoMean;

  }
/*
  public static int max(int a, int b, int c) {

  }

  public static double max(double a, double b, double c) {

  }

  public static int geoMean(int a, int b, int c) {

  }

  public static double geoMean(double a, double b, double c) {

  }


  //main method for testing functionality
  public static void main( String[] args ) {

  }
*/
}//end class

