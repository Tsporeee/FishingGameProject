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
 * Creates a BrackishTile with Fish
 * 
 */

// A BrackishTile is-a WaterTile
public class BrackishTile extends WaterTile
{
	
	// Constructor
	public BrackishTile(int row, int col, FishGenerator generator) 
	{
		super(row, col, generator);
		populateTile();
		setColor (Color.GREEN);
	}

	// Populate the tile with Brackish fish
	@Override
	public void populateTile()
	{
		
		// Create instance variables for the subclass
		FishGenerator generator = getGenerator();
		Fish[] fish = getFish();
		
		// Add random fish to the tile
		for (int i = 0; i < FISH_AMOUNT; i++)
		{
			try
			{
			fish[i] = generator.BrackishRandomFishGenerate();
			}
			catch ( NullFishException e)
			{
			System.out.println(e.getMessage());
			fish[i] = new BullShark();
			}
		}
	}
}
