public class StatsDriver{
	public static void main (String[] args){
	Stats teacher = new Stats();
	// creates new object with class Stats
	System.out.println(teacher.mean(1,2));
	// While answer is 1.5, java has to return an integer, so it rounds down to 1.
	System.out.println(teacher.mean(10,10));
	// returns 10
	System.out.println(teacher.mean(-10,-10));
	// returns -10
	System.out.println(teacher.mean(-10.0,-2.0));
	// returns -6.0
	System.out.println(teacher.mean(0,10));
	// returns 5
	System.out.println(teacher.mean(10,5.0));
	// returns 7.5
	System.out.println(teacher.mean(-10,5));
	// returns -2
/*
	System.out.println(teacher.mean(0));
	// Does not run
	System.out.println(teacher.mean(0,0,0));
	// Does not run
	System.out.println(teacher.mean());
	// does not run
	THESE DO NOT RUN BECAUSE THESE ARE NOT APPLICABLE TO MEAN METHODS
*/		
	teacher.max((int) 1,(int) 2);
	// object teacher carries out method max, which compares arguments 1 and 2 and returns the greatest value [1 < 2, 2]. The returned value is an integer.
	teacher.max((double) 1,(double) 2);
	// object teacher carries out method max, which compares arguments 1 and 2 and returns the greatest value [1 < 2, 2]. The returned value is a double.
	teacher.max(0,0);
	// Should return 0
	teacher.max(1,2,3);
	// Should not run
	teacher.max(10,10.0);
	// Should return 10.0
	teacher.max(-10,0);
	// Should return 0
/*
	teacher.max();
	// Should not run
*/
/*
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
