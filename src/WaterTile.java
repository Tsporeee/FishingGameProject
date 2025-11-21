import java.awt.Color;

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
 * Version/date: 11/20/2025
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
	private int row;
	private int col;
	
	// A WaterTile has-many Fish
	private Fish[] fish = new Fish[FISH_AMOUNT];
	
	// A WaterTile has-a FishGenerator
	private FishGenerator generator; 
	
	// A WaterTile has-a Color
	private Color color;
	
	// Constructor
	public WaterTile(int row, int col, FishGenerator generator)
	{
		this.row = row;
		this.col = col;
		this.generator = generator;
	}
	
	// Fish here depends on type of tile
	public void populateTile()
	{
	}
	
	// Getters and setters
	public Fish[] getFish()
	{
		return fish;
	}
	
	// The X value will be the column * the tile size 
	public int getX()
	{
		return col * FishingGamePanel.SCALED_TILE_SIZE;
	}
	
	// TheYX value will be the row * the tile size 
	public int getY()
	{
		return row * FishingGamePanel.SCALED_TILE_SIZE;
	}
	
	public Color getColor() 
	{
		return color;
	}
	
	public void setColor(Color newColor)
	{
		color = newColor;
	}

	public FishGenerator getGenerator()	
	{
		return generator;
	}
}
