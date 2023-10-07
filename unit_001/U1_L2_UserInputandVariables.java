package unit_001;
import java.util.Scanner;

public class U1_L2_UserInputandVariables
{

	public static void main(String[] args)
	{
		//Instantiate my Scanner object
		Scanner myScanner = new Scanner(System.in);
		
		//Declaring my variables
		String fn;
		String student = "Joe Today";
		System.out.println(student);
		String ln;
		int age;
		
		
		//Ask question and user input
		System.out.println("What is your first name? ");
		fn = myScanner.nextLine();
		
		System.out.println("What is your age? ");
		age = myScanner.nextInt();
		myScanner.nextLine();
		//ALERT: don't forget scanner bug
		
		System.out.println("What is your last name? ");
		ln = myScanner.nextLine();
		
		System.out.println("Hello " + fn + " " + ln + ". Your age is " + age);
		
		
		
		
		myScanner.close();
		
		
	}

}
