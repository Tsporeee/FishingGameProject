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

// A Squid is-a Fish
public class Squid extends Fish
{

	// Ability (UNUSED)
	public void ink()
	{
		// Blacks out a tile
	}
	
	public Squid()
	{
		super(6);
	}
	
	@Override
	public String toString()
	{
		return "Squid";
	}
}
