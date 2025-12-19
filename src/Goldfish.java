/**
 * Lead Author(s): 
 * @author Tian Schmidt
 * 
 * Other contributors:
 * 
 * 
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 *  
 * Version/date: 11/7/2025
 * 
 * Responsibilities of class:
 * 
 * 
 */

// A Goldfish is-a Carp
public class Goldfish extends Fish
{
	
	public Goldfish()
	{
		// A goldfish is worth 4 points
		super(4);
	}
   
	@Override
	public String toString() 
    {
		// toString for inventory
		return "Goldfish";
    }
}
