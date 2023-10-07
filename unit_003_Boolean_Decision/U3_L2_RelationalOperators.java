package unit_003_Boolean_Decision;

import java.util.Scanner;

public class U3_L2_RelationalOperators
{

	public static void main(String[] args)
	{
		/*
		 * ==, <, >, <=, >=, !=
		 * The results always will be True or False
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your grade: ");
		double grade = scan.nextDouble();
		
		if(grade < 60)
		{
			System.out.println("You failed the class.");
		}
//		System.out.println("You passed!!");
		
		System.out.println("\n\n***** athlete input *****");
		
		System.out.println("What is the length of the jump? ");
		double lengthOfJump = scan.nextDouble();
		
		
		if(lengthOfJump >= 8.95)
		{
			System.out.println("What is the name of the athlete? ");
			String nameOfAthlete = scan.nextLine();
			scan.nextLine();
			
			System.out.println("What is his/her nationality? ");
			String nationalityOfAthlete = scan.nextLine();
			
			System.out.printf("The length of the jump is: %.2f%nThe name of the athlete is %s%nHe/She is from %s",
					lengthOfJump, nameOfAthlete, nationalityOfAthlete);
		}
		if(lengthOfJump < 8.95)
		{
			System.out.println("Good try, but not a world record.");
		}
		
		
		
		
		
		

		scan.close();
		
		
	}

}
