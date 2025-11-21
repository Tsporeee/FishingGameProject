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
 * Creates a FreshwaterTile with Fish
 * 
 */

// A FreshwaterTile is-a WaterTile
public class FreshwaterTile extends WaterTile
{ 
	
	// Constructor
	public FreshwaterTile(int row, int col, FishGenerator generator)
	{
		super(row, col, generator);
		populateTile();
		setColor (Color.CYAN);
	}
	
	// Populate the tile with Freshwater fish
	@Override
	public void populateTile()
	{
		
		// Create instance variables for the subclass
		FishGenerator game = getGenerator();
		Fish[] fish = getFish();
		
		// Add random fish to the tile
		for (int i = 0; i < FISH_AMOUNT; i++)
		{
			try
			{
				fish[i] = game.FreshwaterRandomFishGenerate();
			}
			catch (NullFishException e)
			{
				System.out.println(e.getMessage());
				 fish[i] = new Carp();
			}
		}
	}
}
