package unit_009_inheritance.U9_L2_overridingMethods;


public class Rectangle extends Quadrilateral
{

    public Rectangle(int a, int b)
    {
        super(a, b, a, b);
    }
    
    public int getPerimeter()
    {
        return super.getSide1() * 2 + super.getSide2() * 2;
        
    }
    
    

}
