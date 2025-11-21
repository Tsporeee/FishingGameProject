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
 * Version/date: 11/14/2025
 * 
 * Responsibilities of class:
 * Handles exceptions when a null is encountered instead of a fish
 * 
 */

// A NullFishException is-an Exception
public class NullFishException extends Exception
{

	// Constructor
	public NullFishException()
	{
		// Creates error message
		super("No fish was found");
	}
}
