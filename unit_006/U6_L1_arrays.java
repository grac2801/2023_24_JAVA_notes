package unit_006;
import java.util.Arrays;
import edhesive.shapes.*;

public class U6_L1_arrays
{
    public static void main(String[] args)
    {
     // they have index values starting with 0
        int[] numbers = { 10, 15, -5, 4, 1 };

        // they can be treated as regular numbers
        numbers[0] = 89;
        numbers[1]++;
        numbers[2] = numbers[2] + 4;

        double[] doubleArray = new double[3];
        doubleArray[0] = 10.6;
        doubleArray[1] = 20.5;
        doubleArray[2] = 30.9;
        System.out.println("doubleArray: " + doubleArray[2]);
        
        //You can add elements of the array
        double answer = doubleArray[0] + doubleArray[1];
        System.out.println("Total of first 2 elements: " + answer);
        
        
        //default values for an array
        int[] defaultInt = new int[3];
        System.out.println("default integer = " + defaultInt[1]);
        
        double[] defaultDou = new double[3];
        System.out.println("default double = " + defaultDou[1]);
        
        Boolean[] defaultBoo = new Boolean[3];
        System.out.println("default Boolean = " + defaultBoo[1]);

        Circle[] defaultCircle = new Circle[3];
        System.out.println("default Circle = " + defaultCircle[1]);
        
        
        //objects can be added to the array
        Circle[] myCircles = new Circle[2];
        myCircles[0] = new Circle(5.8);
        myCircles[1] = new Circle();
        
        System.out.println(myCircles[0]);
        System.out.println(myCircles[1]);
        
        char[] myChars = new char[2];
        myChars[0] = 'a';
        System.out.println(myChars[0]);
        System.out.println(myChars[1]);
        
        char[] word = {'h', 'e', 'l', 'l', 'o'};
        System.out.println(word);
        
        
        String[] words = {"dog", "cat", "bird"};
        System.out.println(words);
        System.out.println(Arrays.toString(words));
        
         
        //Using a loop to make objects
        Circle[] cir = new Circle[5];
        for (int i = 0; i < 5; i++)
        {
            int randRadius = (int)(Math.random() * 10 + 1);
            cir[i] = new Circle(randRadius);
        }
     System.out.println(Arrays.toString(cir));
        
    }
}
