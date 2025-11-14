import java.util.Random;

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
 * Generates fish
 * 
 */

// Could use more fish, that would be good maybe after we get this thing fully working
public class FishGenerator
{

	// Constructor 
	public FishGenerator()
	{
		
	}
	
	// Generate a random fish for a FreshwaterTile
	public Fish FreshwaterRandomFishGenerate() 
	{
		
		// Create random numbers for the switch
		Random random = new Random();
		int randomFishCase = random.nextInt(3);	
		
		// Depending on the random number, return a freshwater fish
		switch(randomFishCase)
		{
			case 0: 
				return new BullShark();
			case 1:
				return new Carp();
			case 2:
				return new Goldfish();
			default:
				return null;
		}
	}
	
	// Generate a random fish for a SaltwaterTile
	public Fish SaltwaterRandomFishGenerate()
	{
		
		// Create random numbers for the switch
		Random random = new Random();
		int randomFishCase = random.nextInt(2);	
		
		// Depending on the random number, return a Saltwater fish
		switch(randomFishCase)
		{
			case 0: 
				return new BullShark();
			case 1:
				return new Squid();
			default:
				return null;
		}
	}
		
	// Generate a random fish for a BrakishTile
	// add more brackish fish at some point!!!!
	public Fish BrackishRandomFishGenerate()
	{
		
		// Create random numbers for the switch
		Random random = new Random();
		int randomFishCase = random.nextInt(1);	
		
		// Depending on the random number, return a Brackish fish
		switch(randomFishCase)
		{
			case 0: 
				return new BullShark();
			default:
				return null;
		}
	}
}
