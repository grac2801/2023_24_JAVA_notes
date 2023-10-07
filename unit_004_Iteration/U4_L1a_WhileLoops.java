package unit_004_Iteration;

import java.util.Scanner;

public class U4_L1a_WhileLoops
{

	public static void main(String[] args)
	{
		/*
		 * Program 1: Positive numbers
		 */
		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter a positive integer: ");
//		int num = scan.nextInt();
//		int count = 1;
//		
//		while(num < 0)
//		{
//			System.out.println("You entered a negative value. Try again");
//			num = scan.nextInt();
//			count++;
//		}
//		
//		System.out.println(num + " is a positive number.");
//		System.out.println("It only took you " + count + " times.");
		
		/*
		 * Program 2: scores
		 */
		System.out.println("Enter your test grade: ");
		int grade = scan.nextInt();
		
		int counter = 1;
		int sum = grade;
		
		while(grade != -1)
		{
			System.out.println("Enter another grade. -1 to stop");
			grade = scan.nextInt();
			counter++;
			sum += grade;
		}
		counter--;
		sum +=1;
		double average = sum / counter;
		System.out.println("The average is: " + average);
		
		
		
		

		scan.close();
	}

}
