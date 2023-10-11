package temp;

public class Dog
{

 // instance variables or fields
    private String breed;
    private int weight;
    private String name;
    private String color;
//  private static int numberOfDogs = 0;

    // constructor
    public Dog(String breed, int weight, String name, String color)
    {
        this.breed = breed;
        if (weight <= 0)
        {

            this.weight = Math.abs(weight);
        }
        else
        {
            this.weight = weight;
        }
        

        this.name = name;
        this.color = color;
//      numberOfDogs++;
    }

    public String getColor()
    {
        return this.color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    // setters and getters
//  mutators and accessors
    public String getBreed()
    {
        return this.breed;
    }

    public void setBreed(String breed)
    {
        this.breed = breed;
    }

    public int getWeight()
    {
        return weight;
    }

    public void setWeight(int weight)
    {
        this.weight = weight;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        String message = "Dog breed: " + this.getBreed() + "\n" + 
                "Weight: " + this.getWeight() + "\n" + 
                "Name: "+ this.getName() + "\n" + 
                "Color: " + this.getColor();
        return message;
    }

//  equals
    public boolean equals(Dog other)
    {
        if (this.breed.equals(other.getBreed()) && this.weight == other.getWeight()
                && this.name.equals(other.getName()))
        {
            return true;
        }
        return false;
    }

    /*
     * Student activity: Add the field color that stores the dog's fur color add to
     * the constructor, mutator, and accessor, and toString .
     */
}
