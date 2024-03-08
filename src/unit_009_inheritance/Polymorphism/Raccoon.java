package unit_009_inheritance.Polymorphism;


public class Raccoon extends Animal
{

    private String owner;

    public Raccoon(String owner)
    {
        super("Black and white", 5, "rrrrh");
        this.owner = owner;
    }

    public String getOwner()
    {
        return owner;
    }

    public void setOwner(String owner)
    {
        this.owner = owner;
    }
    
    public String getSound()
    {
        return "Overriden sound: mmmmh";
    }
    
    
}//End of main
