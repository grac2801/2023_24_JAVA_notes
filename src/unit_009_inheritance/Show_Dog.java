package unit_009_inheritance;

public class Show_Dog extends Adog
{
    private String owner;
    public Show_Dog(String breed, int weight, String name, String color, String owner)
    {
        super(breed, color, name, weight);
        this.owner = owner;
    }
    
    public String toString(String owner)
    {
       return super.toString() + " The owner is " + getOwner();
    }
    
    public String getOwner()
    {
        return this.owner;
    }
}
