package unit_005_classes.points;

public class Point
{
    //instance variables or fields
    private int x;
    private int y;
    
    //Constructor
    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    
    //getters
    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    //setters
    public void setY(int y)
    {
        this.y = y;
    }
    

    public String toString()
    {
        return "(" + this.getX() + ", " + this.getY() + ")";
    }
    
    
    public void movePoint(int dx, int dy)
    {
        this.x += dx;
        this.y += dy;
    }
    
    public double distanceFromOrigin()
    {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }
    
    public double distanceBetweenPoints(Point other)
    {
        double x1_x2 = Math.pow(this.getX() - other.getX(), 2);
        double y1_y2 = Math.pow(this.getY() - other.getY(), 2);
        double dist = Math.sqrt(x1_x2 + y1_y2); 
        return dist;
    }
    
    
    
}
