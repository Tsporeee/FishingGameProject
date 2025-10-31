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
 * Version/date: 10/31/2025
 * 
 * Responsibilities of class:
 * 
 * 
 */

// I think having this be the same situation as the fish would be best
// Just with brackish, freshwater, and saltwater tiles
public abstract class WaterTile 
{
	
	// A WaterTile has-many Fish
	private Fish[] fish;
	
	// Constructor
	public WaterTile()
	{
	}
	
	// Getter
	public Fish[] getFish()
	{
		return fish;
	}
}
