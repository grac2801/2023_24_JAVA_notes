package unit_002_usingObjects;

import edhesive.shapes.Circle;
import edhesive.shapes.Rectangle;
import edhesive.shapes.RegularPolygon;

public class U2_L5_Constructors
{

	public static void main(String[] args)
	{
		System.out.println("\n\n***** Default Circle *****");
		Circle c = new Circle();
		System.out.println("Default circle: " + c);
		
		System.out.println("\n\n***** double parameter Circle *****");
		Circle c1 = new Circle(5.876);
		System.out.println("Default circle: " + c1);
		
		System.out.println("\n\n***** Methods of circles *****");
		System.out.println("Area of c1 is " + c1.getArea());
		
		
		System.out.println("\n\n***** Rectangle *****");
//		Rectangle r1 = new Rectangle();
//		Rectangle r2 = new Rectangle(3.0);
		Rectangle r3 = new Rectangle(4.0, 5.0);
		System.out.println(r3);
		System.out.println(r3.toString());
		
		System.out.println("\n\n***** Polygon *****");
		RegularPolygon rp1 = new RegularPolygon(10, 5);
		System.out.println(rp1);
		System.out.println("Perimeter: " + rp1.getPerimeter());
		
		
		
		
		
		
		
		
	}

}
