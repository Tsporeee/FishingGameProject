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

// A Carp is-a Fish
public class Carp extends Fish
{
	
	public Carp()
	{
		// A Carp is worth 2 points
		super(2);
	}
	
	@Override
	public String toString() 
    {
		// toString for the inventory 
		return "Carp";
    }
}
