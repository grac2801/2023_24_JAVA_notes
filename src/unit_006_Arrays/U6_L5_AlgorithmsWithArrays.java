package unit_006_Arrays;

import java.util.Scanner;

public class U6_L5_AlgorithmsWithArrays
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int[] grades = new int[10];
        System.out.printf("[");

        for (int i = 0; i < grades.length; i++)
        {
            grades[i] = (int) (Math.random() * 11);
            System.out.print(grades[i] + " ");

        }
        System.out.printf("]");

        // Second part: inserting a value
        System.out.println("\nEnter a value to insert: ");
        int value = scan.nextInt();

        System.out.println("in which position? ");
        int position = scan.nextInt();

        for (int i = grades.length - 1; i > position - 1; i--)
        {
            grades[i] = grades[i - 1];
        }
        grades[position - 1] = value;

        for (int i = 0; i < grades.length; i++)
        {
            System.out.print(grades[i] + " ");

        }
        System.out.println("\n");

        // Deleting a value in the array
        System.out.println("TOPIC: deletion in an array, " + "but last value remains the same");

        System.out.println("\n\nWhich position to remove? ");
        int pos = scan.nextInt();

        for (int i = pos - 1; i < grades.length - 1; i++)
        {
            grades[i] = grades[i + 1];
        }

        for (int i = 0; i < grades.length; i++)
        {
            System.out.print(grades[i] + " ");
        }
        System.out.println("\n");

        scan.close();
    }

}
