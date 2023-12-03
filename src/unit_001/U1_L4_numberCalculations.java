package unit_001;

import java.util.Scanner;

public class U1_L4_numberCalculations
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
//		int num1 = 15;
//		int num2 = 5;
//		
//		System.out.println(num1 + num2);
//		System.out.println("Enter first integer: ");
//		int x = scan.nextInt();
//		System.out.println("Enter second integer: ");
//		int y = scan.nextInt();
		
		//operations
//		int z = x + y * y;
//		System.out.println("The total is: " + z);
//		System.out.printf("The total is: %,d%n", z);
//		System.out.printf("The total is: % 10d%n", z);
		
		/*
		 * limits for Integers
		 */
//		System.out.printf("int upper limit: %,d%n", Integer.MAX_VALUE);
		
		//integer division
//		System.out.println("Enter a number: ");
//		int num3 = scan.nextInt();
//		System.out.println("Enter a second number: ");
//		int num4 = scan.nextInt();
//		double num5 = 1.0 * num3 / num4;
//		double num5 = (double)num3 / num4;
//		System.out.println("The division total is: " + num5 );
//		System.out.printf("The division total is: %.2f",  num5 );
		
		/*
		 * ask user for 3 integers and get the correct average to 3 sig figs.
		 */
		
//		String fn = "Oscar";
//		String ln = new String("Gracias");
//		
//		System.out.printf("%nMy name is : %s %s", fn , ln);
//		
//		System.out.println("\n2 x 10th power: " + 2E3);
		
		/*
		 * post and pre-increment
		 */
		int c = 5;
		System.out.println("initial c: " + c);
		
		System.out.println("\npost:");
		int post = c++;
		System.out.println("c = " + c);
		System.out.println("post = " + post);
		
		System.out.println("\n\npre");
		int pre = ++c;
		System.out.println("c: " + c);
		System.out.println("pre: " + pre);
		
		float largeValue = 5_125_652_765F;
		
		System.out.printf("largeValue: %,f", largeValue );
		
		
		
		

		scan.close();
	}

}
 