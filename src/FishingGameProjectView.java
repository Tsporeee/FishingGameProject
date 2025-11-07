import javax.swing.JFrame;

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
 * Creates the game visuals
 * 
 */

// A FishingGameProjectView is-a JFrame
// Idk why it yellow lines here
public class FishingGameProjectView extends JFrame
{
	
	// A fishingGameView has-a tile type amount
	public static final int TILE_TYPE_COUNT = 3;
	
	// A FishingGameProjectView has-a FishingGame
	private FishingGame game;
	
	// Repeat with the other tiles maybe.... maybe this can be done in FishingGame idk yet
	// A FishingGameProjectView has-many FreshwaterTiles
	private FreshwaterTile[] freshWaterTiles = new FreshwaterTile[TILE_TYPE_COUNT];
	
	// Creates GUI (TO DO)
	public static void main(String[] args)
	{
		new FishingGameProjectView().start();
	}
	
	// Start the game
	// DEBUG PRINTING HERE... LEAVING IT JUST IN CASE WE NEED IT
	public void start()
	{
		game = new FishingGame();
		WaterTile testTile1 = new FreshwaterTile(1, 1, game);
	    for (Fish f : testTile1.getFish()) 
	    {
	        System.out.println(f);
	    }
	    
		WaterTile testTile2 = new SaltwaterTile(1, 1, game);
	    for (Fish f : testTile2.getFish()) 
	    {
	        System.out.println(f);
	    }
	    
	    WaterTile testTile3 = new BrackishTile(1, 1, game);
	    for (Fish f : testTile3.getFish()) 
	    {
	        System.out.println(f);
	    }
	}
}
