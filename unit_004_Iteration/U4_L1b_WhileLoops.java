package unit_004_Iteration;

import java.util.Scanner;

public class U4_L1b_WhileLoops
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		/*
		 * Program 2: scores
		 */
		int counter = 0;
		int sum = 0;
		
		System.out.println("Enter your test grade: ");
		int grade = scan.nextInt();
		
		
		while(grade != -1)
		{
			counter++;
			sum += grade;
			System.out.println("Enter another grade. -1 to stop");
			grade = scan.nextInt();
		}
		
		double average = sum / counter;
		System.out.println("The average is: " + average);
		
		
		
		

		scan.close();
	}

}
