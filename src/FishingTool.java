/**
 * Lead Author(s): 
 * @author Robert Fuentes
 * 
 * Other contributors:
 * 
 * 
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 *  
 * Version/date: 10/31/2025
 * 
 * Responsibilities of class:
 * 
 * 
 */
public abstract class FishingTool 
{
    // A FishingTool has-a name
    private String name;

    // Constructor
    public FishingTool(String name)
    {
        this.name = name;
    }

    // Getter
    public String getName()
    {
        return name;
    }

}