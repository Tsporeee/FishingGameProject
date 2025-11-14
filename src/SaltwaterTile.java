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

// A SaltwaterTile is-a WaterTile
public class SaltwaterTile extends WaterTile
{
	
	// Constructor
	public SaltwaterTile(int x, int y, FishGenerator generator) 
	{
		super(x, y, generator);
		populateTile();
	}
	
	// Populate the tile with Saltwater fish
	@Override
	public void populateTile()
	{
		
		// Create instance variables for the subclass
		FishGenerator game = getGenerator();
		Fish[] fish = getFish();
		
		// Add random fish to the tile
		for (int i = 0; i < FISH_AMOUNT; i++)
		{
			fish[i] = game.SaltwaterRandomFishGenerate();
		}
	}
	
}
