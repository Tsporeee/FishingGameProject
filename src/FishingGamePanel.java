import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

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
 * Creates the game screen
 * 
 */

// A FishingGamePanel is-a JPanel
public class FishingGamePanel extends JPanel
{
	// Settings 
	public final static int TILE_SIZE = 64;
	public final static int SCALE = 3;
	
	public final static int SCALED_TILE_SIZE = TILE_SIZE * SCALE;
	
	public final static int SCREEN_COL = 5;
	public final static int SCREEN_ROW = 4;
	
	public final static int SCREEN_HEIGHT = SCALED_TILE_SIZE * SCREEN_ROW;
	public final static int SCREEN_WIDTH = SCALED_TILE_SIZE * SCREEN_COL;
	
	// A FishingGamePanel has-a MovementListener
	private MovementListener movementListener = new MovementListener(this);
	
	// Set player default position
	private int playerX = 0;
	private int playerY = 0;
	
	// Makes the game panel
	public FishingGamePanel()
	{
		this.setPreferredSize(new Dimension (SCREEN_WIDTH, SCREEN_HEIGHT));
		this.setBackground(Color.LIGHT_GRAY);	
		this.addKeyListener(movementListener);
		this.setFocusable(true);
	}
	
	// Creates the boat/player
	public void paintComponent (Graphics g)
	{
		super.paintComponent(g);
		Graphics2D boat = (Graphics2D)g;
		boat.setColor(Color.BLACK);
		boat.fillRect(getPlayerX(), getPlayerY(), SCALED_TILE_SIZE, SCALED_TILE_SIZE);
	}
	
	
	// Getters and setters
	public int getPlayerY() 
	{
		return playerY;
	}

	public void setPlayerY(int playerY) 
	{
		this.playerY = playerY;
	}

	public int getPlayerX() 
	{
		return playerX;
	}

	public void setPlayerX(int playerX) 
	{
		this.playerX = playerX;
	}
}
