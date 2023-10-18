package unit_005_classes.documentation;

public class Rectangle
{
    private double length;
    private double width;
    
    /**
     * Constructs the default Rectangle of 1 x 1
     */
    public Rectangle()
    {
        this(1.0, 1.0);
    }
    
    /**
     * Constructor for a square 
     * @param length = length of the rectangle
     */
    public Rectangle(double length)
    {
        this(length, length);
    }
    
    /**
     * Constructor with 2 parameters to build a rectangle
     * @param length = length of the rectangle
     * @param width = width of the rectangle
     */
    public  Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }

    /**
     * @return the length
     */
    public double getLength()
    {
        return length;
    }

    /**
     * @return the width
     */
    public double getWidth()
    {
        return width;
    }
    
    /**
     * I like to get the perimeter measurements first
     * @return
     */
    public double getPerimeter()
    {
        return this.width * 2 + this.length * 2;
    }
    
    public String toString()
    {
        return "Rectangle with length " + this.getLength() +
                ", width " + this.getWidth();
    }
    
    
    
    
    
    
    
    
    
    
}
