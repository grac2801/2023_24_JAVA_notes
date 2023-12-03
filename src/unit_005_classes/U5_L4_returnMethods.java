package unit_005_classes;

import edhesive.shapes.Circle;
import java.util.Scanner;

public class U5_L4_returnMethods
{

    public static void main(String[] args)
    {
        
        Scanner scan = new Scanner(System.in);
        Circle c = new Circle(3);
        double a = c.getArea();
        System.out.printf("The area is %-5.2f%n%n", a);
        
        /*
         * create a method which when passed 2 integers, it returns
         * the largest of both values.
         */
        int largest1 = whichLargerOfTheseTwo_Math(4, 5); //arguments
        System.out.println("The largest value is: " + largest1);
        
        int largest2 = whichLargerOfTheseTwo_If(4, 5); //arguments
        System.out.println("The largest value is: " + largest2);
        
        int largest3 = whichLargerOfTheseTwo_returns(4, 5); //arguments
        System.out.println("The largest value is: " + largest3);
        
        
        
        /*
         * Create a call and a method that take 3 double values, averages
         * them, and displays that average value.
         */
        
        /*
         *Ask for a word, and then check where in that word the letter "a" appears first,
         *if it does, you will return the index of where it was found, and stop the script. 
         */
        System.out.println("Enter a word (Looking for an a): ");
        String word = scan.nextLine();
        int index = foundA(word, scan);
        System.out.println("Found at index " + index );
        
        scan.close();
    }

    public static int whichLargerOfTheseTwo_returns(int i, int j)
    {
        if(i > j)
        {
            return i;
        }
        return j;
    }

    public static int whichLargerOfTheseTwo_If(int i, int j)
    {
        int largest = i;
        if(j > largest)
        {
            largest = j;
        }
        else
        {
            largest = i;
        }
        return largest;
    }

    public static int whichLargerOfTheseTwo_Math(int i, int j)//parameters
    {
        int largerOne = Math.max(i, j);
        return largerOne;
    }

    public static int foundA(String s, Scanner scan)
    {
        
        for (int i = 0; i < s.length(); i++)
        {

            if (s.substring(i, i + 1).equals("a"))
            {
                return i;

            }

        }
        return 0;
    }
    
    public static double average(double num1, double num2, double num3)
    {
        return (num1 + num2 + num3) / 3;
    }
    
    
    
}
