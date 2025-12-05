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

public abstract class Fish
{
	
	// A fish has-a point value
	private int points;
	
	// Constructor
	public Fish(int points)
	{
		this.points = points;
	}
	
	// Getter
	public int getPoints()
	{
		return points;
	}
}
