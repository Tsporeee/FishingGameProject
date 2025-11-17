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
 * WaterTile abstract class for inheritance
 * 
 */

public abstract class WaterTile 
{
	
	// A WaterTile has-an amount of fish
	public static final int FISH_AMOUNT = 3;
	
	// All these instance variables require a getter (note to self) 
	// Instance variables for location
	private int x;
	private int y;
	
	// A WaterTile has-many Fish
	private Fish[] fish = new Fish[FISH_AMOUNT];
	
	// // A WaterTile has-a FishingGame
	private FishGenerator generator; 
	
	// Constructor
	public WaterTile(int x, int y, FishGenerator generator)
	{
		this.x = x;
		this.y = y;
		this.generator = generator;
	}
	
	// Fish here depends on type of tile
	public void populateTile()
	{
	}
	
	// Getters
	public Fish[] getFish()
	{
		return fish;
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
	public FishGenerator getGenerator()	
	{
		return generator;
	}
}
