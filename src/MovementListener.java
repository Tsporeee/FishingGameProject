import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

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
 * “How to Make a 2D Game in Java” Youtube, uploaded by RyiSnow, 2023, 
 * https://www.youtube.com/playlist?list=PL_QPQmz5C6WUF-pOQDsbsKbaBZqXj4qSq
 * 
 *  
 * Version/date: 11/7/2025
 * 
 * Responsibilities of class:
 * Creates functionality in the arrow keys
 * 
 */

// A MovementListener is-a KeyListener (interface) 
public class MovementListener implements KeyListener
{

	// A MovementListener has-a FishingGamePanel
	public FishingGamePanel fishingGamePanel;
	
	 // Constructor 
	public MovementListener(FishingGamePanel panel) 
	{
		this.fishingGamePanel = panel;
	}
	
	@Override
	public void keyTyped(KeyEvent e) 
	{
		// Not used 
		
	}

	@Override
	public void keyPressed(KeyEvent e) 
	{
		
		// Gets the keycode of the key pressed 
		int code = e.getKeyCode();
		if (code == KeyEvent.VK_UP)
		{
			fishingGamePanel.setPlayerY(fishingGamePanel.getPlayerY() - FishingGamePanel.SCALED_TILE_SIZE); 
		}
		
		if (code == KeyEvent.VK_DOWN)
		{
			fishingGamePanel.setPlayerY(fishingGamePanel.getPlayerY() + FishingGamePanel.SCALED_TILE_SIZE);
		}
		
		if (code == KeyEvent.VK_LEFT)
		{
			fishingGamePanel.setPlayerX(fishingGamePanel.getPlayerX() - FishingGamePanel.SCALED_TILE_SIZE); 
		}
		
		if (code == KeyEvent.VK_RIGHT)
		{
			fishingGamePanel.setPlayerX(fishingGamePanel.getPlayerX() + FishingGamePanel.SCALED_TILE_SIZE);
		}
		
		fishingGamePanel.repaint();
		
	}

	@Override
	public void keyReleased(KeyEvent e) 
	{
		// Not used
	}

}
