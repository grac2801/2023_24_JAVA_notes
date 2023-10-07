package unit_004_Iteration;

import java.util.Scanner;

public class U4_L1_TimeTaken
{

	public static void main(String[] args)
	{
		System.out.println("You will be asked to enter an integer.");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first integer: ");
//		int first = scan.nextInt();
		long timeStart = System.currentTimeMillis();
		
		System.out.println("Enter second integer: ");
//		int second = scan.nextInt();
		long timeEnd = System.currentTimeMillis();
		
		long timePassed = timeEnd - timeStart;
		long timeInSecs = timePassed / 1000;
		
		System.out.println("It took " + timeInSecs + " seconds.");

		scan.close();
	}

}
