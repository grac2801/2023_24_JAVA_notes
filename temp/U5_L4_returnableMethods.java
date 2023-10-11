package temp;

import java.util.Scanner;

import edhesive.shapes.*;


public class U5_L4_returnableMethods
{
    public static void main(String[] args)
    {
        Circle c = new Circle(3);
        double a = c.getArea();// returned a double (non-void method)
        System.out.printf("The area is %-5.2f%n%n", a);

        /*
         * create a method which when passed two integers it returns back which one is
         * larger.
         */

        int larger1 = whichLargerOfTheseTwo_Math(4, 5);// arguments
        System.out.println("The largest of the two numbers is " + larger1);

        int larger2 = whichLargerOfTheseTwo_if(14, 5);// arguments
        System.out.println("The largest of the two numbers is " + larger2);

        int larger3 = whichLargerOfTheseTwo_2_returns(45, 3);
        System.out.println("The largest of the two numbers is " + larger3);

        /*
         * activity: method returns a double name is average in main, user inputs 3
         * doubles method should return value
         */

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter first number: ");
        double num1 = scan.nextDouble();
        System.out.println("Enter second number: ");
        double num2 = scan.nextDouble();
        System.out.println("Enter third number: ");
        double num3 = scan.nextDouble();
        System.out.printf("The average is: %-5.2f%n%n", average(num1, num2, num3));

        /*
         * return can be used to end algorithm in other structures. For example a for
         * loop
         */
        System.out.println("Enter a word (Looking for an a): ");
        scan.nextLine();
        String word = scan.nextLine();
        System.out.println("word: " + word);

        scan.close();
        for (int i = 0; i < word.length(); i++)
        {

            if (word.substring(i, i + 1).equals("a"))
            {
                System.out.println("There is an a in " + word + " at index: " + i);
                return;

            }

        }

        scan.close();
    }


    public static int whichLargerOfTheseTwo_Math(int a, int b)// parameters
    {
        int largerOne = Math.max(a, b);
        return largerOne;
    }


    public static int whichLargerOfTheseTwo_if(int a, int b)
    {
        int largest = a;

        if (b > largest)
        {
            largest = b;
        }

        return largest;

    }


    private static int whichLargerOfTheseTwo_2_returns(int a, int b)
    {

        if (a > b)
        {
            return a;
        }

        return b;
    }


    private static double average(double num1, double num2, double num3)
    {
        return (num1 + num2 + num3) / 3;
    }

}
