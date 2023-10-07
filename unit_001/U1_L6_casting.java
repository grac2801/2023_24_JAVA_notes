package unit_001;

public class U1_L6_casting
{

	public static void main(String[] args)
	{
//		int a = 6;
//		int b = 5.6;
//		double c = 5;
		
		/*
		 * widening = smaller data to larger data type
		 * narrowing = larger data to smaller data types.
		 * casting = convert from one data type to another even
		 * if some info may be lost.
		 */

		int e = (int)2.8777;
		System.out.println("e: " + e);
		
		//divide an integer in half
		int f1 = 13;
		double half = f1 / 2;
		System.out.println("half: " + half);
		
		//declare variable as double
		double f2 = 13;
		half =(f2/2);
		System.out.println("half: " + half);
		
		//using casting
		int f3 = 13;
		half = (double) f3 / 2;
		System.out.println("half: " + half);
		
		
		//just add a decimal point at the end
		double f4 = 13.;
		half = f4/2;
		System.out.println("half: " + half);
		
		//narrowing(lossy compression)
		double h1 = 13;
		int roundedHalf = (int)(h1 / 2.0);
		System.out.println("roundedHalf: " + roundedHalf);
		
		
		//rounding to the nearest value instead of truncating
		//positives = add 0.5;
		//negatives = subtract 0.5;
		
		final double pointFive = 0.5;
		double pos1 = 9.4756;
		double pos2 = 9.8964;
		double neg1 = -5.9878;
		double neg2 = -5.3452;
		System.out.println((int)(pos1 + pointFive));
		System.out.println((int)(pos2 + pointFive));
		System.out.println((int)(neg1 - pointFive));
		System.out.println((int)(neg2 - pointFive));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
