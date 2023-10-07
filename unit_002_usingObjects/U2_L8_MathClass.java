package unit_002_usingObjects;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class U2_L8_MathClass
{

	public static void main(String[] args)
	{
		/*
		 * Fields
		 */
		System.out.println("PI is = " + Math.PI);
		System.out.printf("truncated PI: %.4f%n", Math.PI);
		
		/*
		 * methods
		 */
		Scanner scan = new Scanner(System.in);
		
//
//		System.out.println("Enter a negative integer: ");
//		int n1 = scan.nextInt();
//		System.out.println("Absolute value of " + n1 + " is: " + Math.abs(n1));
		
//		System.out.println("Enter 2 doubles: ");
//		double n2 = scan.nextDouble();
//		double n3 = scan.nextDouble();
//		
//		System.out.println("n2 to the n3 power is: " + (int)Math.pow(n2, n3));
//		
//		System.out.println("square root of n3: " + Math.sqrt(n3));
		
		//Non-static calls
		String word = new String("Apple");
		System.out.println(word.length());
		
		
		/*
		 * Randomizer (3 examples)
		 */
		System.out.println(Math.random());
		
		/*
		 * Random value between 10 and 15
		 */
		int randNum = (int)(Math.random() * 6) + 10;
		System.out.println("random 10-15: " + randNum);
		
		//Provide a random int number from 1-100 including 100
		int upTo100 = (int)(Math.random() * 100) + 1;
		System.out.println("random 1-100: " + upTo100);
		
		//Provide a random int number from 10-34 inclusive
		int upTo34 = (int)(Math.random() * 25) + 10;
		System.out.println("random 10-34: " + upTo34);
		
		//Provide a random int number from -10 to 10 inclusive
		int neg = (int)(Math.random() * 21) -10;
		System.out.println("random neg: " + neg);
		
		
		//Provide a random even number from 1 to 100
		int evens = ((int)(Math.random() * 50) + 1) * 2 ;
		System.out.println("random evens: " + evens);
		
		
		
		
		//Provide a random odd number from 1 to 100
		int odds = ((int)(Math.random() * 50) * 2) + 1;
		System.out.println("random odds: " + odds);
		
		//All numbers 0-25 multiples of 3
		int mult3 = (int)(Math.random() * 8 + 1) * 3;
		System.out.println("random mult3: " + mult3);
		
		//Second way to randomize [Random class]
		Random rand = new Random();
		int newNum1_100 = rand.nextInt(100) + 1;
		System.out.println(newNum1_100);
		
		
		//Third way to randomize
		int day = ThreadLocalRandom.current().nextInt(31) + 1;
		System.out.println("The day selected is: " + day);
		
		scan.close();		
		
		
		
		
		
	}

}
