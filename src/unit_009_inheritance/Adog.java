package unit_009_inheritance;


public class Adog
{

    private String breed;
    private int weight;
    private String name;
    private String color;
    private static int totalNumDogs;

    /**
         * Default but adds a dog to total count
         */
        public Adog()
        {
            this.breed = "unknown";
            this.weight = 0;
            this.name = "none";
            this.color = "unknown";
    //        numberOfDogs();
        }

    /**
     * Using mutator methods
     * 
     * @param breed
     * @param color
     * @param name
     * @param weight
     */
    public Adog(String breed, String color, String name, int weight)
    {
        setBreed(breed);
        setColor(color);
        setName(name);
        setWeight(weight);
    
    }

    /**
     * all parameters constructor
     * 
     * @param breed
     * @param weight
     * @param name
     * @param color
     */
    public Adog(String breed, int weight, String name, String color)
    {
        this.breed = breed;
        this.weight = weight;
        this.name = name;
        this.color = color;
    }

    /**
     * Breed and name
     * 
     * @param breed
     * @param name
     */
    public Adog(String breed, String name)
    {
        this.breed = breed;
        this.name = name;
        this.weight = 0;
        this.color = "unknown";
    }

    public String getBreed()
    {
        return breed;
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

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public boolean equals(Adog otherDog)
    {

        if (this.getBreed().equals(otherDog.getBreed()) && this.getWeight() == otherDog.getWeight())
        {
            return true;
        }

        return false;

    }

    /**
     * Keeps track of the total number of dogs
     * @return
     */
    public static int numberOfDogs()
    {
        totalNumDogs += 1;
        return totalNumDogs;
    }

    public String toString()
    {
        return "A " + this.getWeight() + " lb. " + this.getBreed() + " named " + this.getName() + " with " + this.getColor() + " fur.";
    }
    
}
