public class StatsDriver{
	public static void main (String[] args){
	Stats teacher = new Stats();
	// creates new object with class Stats
	teacher.mean((int) 1,(int) 2);
	// object teacher carries out method mean, which returns the value of the sum of 1 and 2 divided by 2 [(1+2)/2)]. The returned value is an integer.
	teacher.mean((double) 1,(double) 2);
	// object teacher carries out method mean, which returns the value of the sum of 1 and 2 divided by 2 [(1+2)/2)]. The returned value is a double.
	teacher.max((int) 1,(int) 2);
	// object teacher carries out method max, which compares arguments 1 and 2 and returns the greatest value [1 < 2, 2]. The returned value is an integer.
	teacher.max((double) 1,(double) 2);
	// object teacher carries out method max, which compares arguments 1 and 2 and returns the greatest value [1 < 2, 2]. The returned value is a double.
	teacher.geomean((int) 1,(int) 2);
	// object teacher carries out method geoMean, which takes the product of arguments 1 and 2 and raises it to the 1/nth power (in this case, n = 2). The returned value is an integer.
	teacher.geomean((double) 1,(double) 2);
	// object teacher carries out method geoMean, which takes the product of arguments 1 and 2 and raises it to the 1/nth power (in this case, n = 2). The returned value is a double.
	}
}
