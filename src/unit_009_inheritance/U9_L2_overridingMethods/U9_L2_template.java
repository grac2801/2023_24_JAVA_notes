package unit_009_inheritance.U9_L2_overridingMethods;


public class U9_L2_template
{

    public static void main(String[] args)
    {
        Quadrilateral q = new Quadrilateral(3, 7, 6, 7);
        System.out.println("Perimeter: \t" + q.getPerimeter());
        
        Rectangle r = new Rectangle(2, 3);
        System.out.println("Perimeter: \t" + r.getPerimeter());
        
        
    }
}
