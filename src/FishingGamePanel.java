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
 * Version/date: 11/20/2025
 * 
 * Responsibilities of class:
 * Creates the game screen
 * 
 */

// A FishingGamePanel is-a JPanel
public class FishingGamePanel extends JPanel
{
	
	// Settings 
	public static final int TILE_SIZE = 64;
	public static final int SCALE = 3;
	
	public static final int SCALED_TILE_SIZE = TILE_SIZE * SCALE;
	
	public static final int SCREEN_COL = 5;
	public static final int SCREEN_ROW = 4;
	
	public static final int SCREEN_HEIGHT = SCALED_TILE_SIZE * SCREEN_ROW;
	public static final int SCREEN_WIDTH = SCALED_TILE_SIZE * SCREEN_COL;
	
	public static final int WINNING_SCORE = 35;
	
	// A FishingGamePanel has-a MovementListener
	private MovementListener movementListener = new MovementListener(this);
	
	// A FishingGamePanel has-many WaterTiles
	private WaterTile[][] waterTiles = new WaterTile[SCREEN_ROW][SCREEN_COL];
	
	// A FishingGamePanel has-a FishGenerator
	private FishGenerator generator;
	
	private int score;
	
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
		
		generator = new FishGenerator();
		createWaterTiles();
	}
	
	// Create the three different WaterTiles
	public void createWaterTiles()
	{
		for (int row = 0; row < SCREEN_ROW; row++)
		{
			for (int col = 0; col < SCREEN_COL; col++)
			{
				// Creates salt water tiles in columns 1-2
				if (col <= 1)
				{
					waterTiles[row][col] = new SaltwaterTile(row, col, generator);
				}
				
				// Creates brackish water tiles in column 2
				if (col == 2)
				{
					waterTiles[row][col] = new BrackishTile(row, col, generator);
				}
				
				// Creates fresh water tiles in columns 3-4
				if (col > 2)
				{
					waterTiles[row][col] = new FreshwaterTile(row, col, generator);
				}
			}
		}
	}
	
	// Creates the visuals for the game
	public void paintComponent (Graphics g)
	{
		
		// Set up graphics 
		super.paintComponent(g);
		Graphics2D g2D = (Graphics2D)g;
		
		// Draw the tiles
		for (int row = 0; row < SCREEN_ROW; row++)
		{
			for (int col = 0; col < SCREEN_COL; col++)
			{
				WaterTile waterTile = waterTiles[row][col];
	            g2D.setColor(waterTile.getColor());
	            g2D.fillRect(waterTile.getX(), waterTile.getY(), SCALED_TILE_SIZE, SCALED_TILE_SIZE);
			}
		}
		
		// Draw the boat
		g2D.setColor(Color.BLACK);
		g2D.fillRect(getPlayerX(), getPlayerY(), SCALED_TILE_SIZE, SCALED_TILE_SIZE);
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
	
	public WaterTile[][] getWaterTiles()
	{
		return waterTiles;
	}
	
	public int getScore() 
	{
		return score;
	}
	
	public void addScore(int points)
	{
		score += points;
	}
}
