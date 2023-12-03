package unit_005_classes;

import edhesive.shapes.Circle;

public class U5_L3_PrimitivesVsClasses
{

	public static void main(String[] args)
	{
		int number = 0;
		System.out.println("First print in main: " + number);
		changeNum(number);
		System.out.println("First print in main: " + number);
		
		Circle c = new Circle();
		System.out.println(c);
		change(c);
		System.out.println(c);
	}

	public static void change(Circle newC)
	{
		System.out.println(newC);
		newC.setRadius(5);
		System.out.println(newC);
	}

	public static void changeNum(int number)
	{
		System.out.println("first print in the method: " + number);
		number++;
		System.out.println("first print in the method: " + number);
	}

}
