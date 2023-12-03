package unit_005_classes.points;

public class Point_client
{

    public static void main(String[] args)
    {
        Point p1 = new Point(7, 2);
        System.out.println(p1);
        p1.movePoint(1, 1);
        System.out.println(p1);
        double distToOrigin = p1.distanceFromOrigin();
        System.out.println("Distance to origin: " + distToOrigin);
        
        
        
        Point p2 = new Point(9, 5);
        System.out.println("Distance between points: " + p1.distanceBetweenPoints(p2));
        
        
    }

}
