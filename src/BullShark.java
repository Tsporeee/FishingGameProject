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

// A BullShark is-a Fish
public class BullShark extends Fish
{
	
	public BullShark()
	{
		super(10);
	}
	
	// Ability
	public void bite()
	{
		// Destroys player's boat
	}
	
	@Override
	public String toString() 
    {
       return "Bullshark";
    }
	
}

