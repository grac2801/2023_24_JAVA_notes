package unit_009_inheritance.Polymorphism;


public class Parrot extends Animal
{

    private String owner;

    public Parrot(String owner)
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
        return "Polly wants cracker";
    }
    
    public String toString()
    {
        return "I am an parrot";
    }
    
}//End of main
