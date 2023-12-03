package unit_004_Iteration;

import java.util.Scanner;

public class U4_L3_AlgorithmsWithNumbers
{

	public static void main(String[] args)
	{
		/*
		 * Algorithm for evenly divisible
		 */
		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter the larger integer: ");
//		int large = scan.nextInt();
//		
//		System.out.println("Enter the smaller integer: ");
//		int small = scan.nextInt();
//		
//		if(large % small == 0)
//		{
//			System.out.println(large + " is divisible by " + small);
//		}
//		else
//		{
//			System.out.println(large + " is NOT divisible by " + small);
//		}
		
		
		/*
		 * Removing one digit at a time.
		 */
//		System.out.println("Enter a large number: ");
//		int number = scan.nextInt();
//		
//		while(number > 0)
//		{
//			int digit = number % 10;
//			System.out.println(digit);
//			number /= 10;
//		}
		
		/*
		 * Sentinel counter. Code the largest number input until 
		 * user inputs -1c
		 */
			System.out.println("Enter integers and put -1 to end");
			int answer = scan.nextInt();
			int max = answer;
			while (answer != -1)
			{
				answer = scan.nextInt();
				if (answer > max)
				{
					max = answer;
				}
			}
			System.out.println(max + " is the largest value inputed");
		
		
		
		
		
		
		scan.close();
		
		
		
		
		
	}

}
