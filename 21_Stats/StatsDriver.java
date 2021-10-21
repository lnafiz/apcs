public class StatsDriver{
	public static void main (String[] args){
	Stats teacher = new Stats();
	// creates new object with class Stats
	teacher.mean((int) 1,(int) 2);
/*
	// object teacher carries out method mean, which returns the value of the sum of 1 and 2 divided by 2 [(1+2)/2)]. The returned value is an integer.
	teacher.mean((double) 1,(double) 2);
	// object teacher carries out method mean, which returns the value of the sum of 1 and 2 divided by 2 [(1+2)/2)]. The returned value is a double.
	teacher.mean(10,10);
	// Expected value should be 10
	teacher.mean(-10,-10);
	// Expected value should be -10
	teacher.mean(-10.0,-2.0);
	// Expected value should be -6.0
	teacher.mean(0,10);
	// Expected Value should be 5
	teacher.mean(10,5.0);
	// Expected Value should be 7.5
	teacher.mean(-10,5);
	// Expected Value should be -2.5
	teacher.mean(0);
	// Should not run
	teacher.mean(0,0,0);
	// Should not run
	teacher.mean();
	// Should not run
	
	teacher.max((int) 1,(int) 2);
	// object teacher carries out method max, which compares arguments 1 and 2 and returns the greatest value [1 < 2, 2]. The returned value is an integer.
	teacher.max((double) 1,(double) 2);
	// object teacher carries out method max, which compares arguments 1 and 2 and returns the greatest value [1 < 2, 2]. The returned value is a double.
	teacher.max(0,0);
	// Should return 0
	teacher.max();
	// Should not run
	teacher.max(1,2,3);
	// Should not run
	teacher.max(10,10.0);
	// Should return 10.0
	teacher.max(-10,0);
	// Should return 0
	
	teacher.geoMean((int) 1,(int) 2);
	// object teacher carries out method geoMean, which takes the product of arguments 1 and 2 and raises it to the 1/nth power (in this case, n = 2). The returned value is an integer.
	teacher.geoMean((double) 1,(double) 2);
	// object teacher carries out method geoMean, which takes the product of arguments 1 and 2 and raises it to the 1/nth power (in this case, n = 2). The returned value is a double.
	teacher.geoMean(0,1);
	// Should return 0
	teacher.geoMean(1,1);
	// Should return 1
	teacher.geoMean(-1,3);
	// Should not run
	teacher.geoMean(-2,-3);
	// Should return sqrt6
*/	
	}
}