package unit_009_inheritance.U9_L2_overridingMethods;


public class Quadrilateral
{

    private int side1;
    private int side2;
    private int side3;
    private int side4;

    public Quadrilateral(int a, int b, int c, int d)
    {
        this.side1 = a;
        this.side2 = b;
        this.side3 = c;
        this.side4 = d;
    }

    public int getSide1()
    {
        return this.side1;
    }

    public void setSide1(int side1)
    {
        this.side1 = side1;
    }

    /**
     * @return the side2
     */
    public int getSide2()
    {
        return side2;
    }

    /**
     * @param side2 the side2 to set
     */
    public void setSide2(int side2)
    {
        this.side2 = side2;
    }

    /**
     * @return the side3
     */
    public int getSide3()
    {
        return side3;
    }

    /**
     * @param side3 the side3 to set
     */
    public void setSide3(int side3)
    {
        this.side3 = side3;
    }

    /**
     * @return the side4
     */
    public int getSide4()
    {
        return side4;
    }

    /**
     * @param side4 the side4 to set
     */
    public void setSide4(int side4)
    {
        this.side4 = side4;
    }

    public int getPerimeter()
    {
        return this.getSide1() + this.getSide2() + this.getSide3() + this.getSide4();
    }
}
