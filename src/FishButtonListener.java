import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

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
 * Version/date: 12/5/2025
 * 
 * Responsibilities of class:
 * Adds functionality to the fish button
 * 
 */

public class FishButtonListener implements ActionListener
{
	
	// A FishButtonListener has-a FishingGamePanel
	private FishingGamePanel gamePanel;
		
	// A FishListener has-a JTextArea
	private JTextArea boatInventory;
	private JTextArea gameUpdates;
		
	public FishButtonListener(FishingGamePanel panel, JTextArea boatInventory, JTextArea gameUpdates)
	{
		this.gamePanel = panel;
		this.boatInventory = boatInventory;
		this.gameUpdates = gameUpdates; 
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
		//
		int col = gamePanel.getPlayerX() / FishingGamePanel.SCALED_TILE_SIZE;
        int row = gamePanel.getPlayerY() / FishingGamePanel.SCALED_TILE_SIZE;
        
		// Identity the watertile from the array
		WaterTile currentTile = gamePanel.getWaterTiles()[row][col];
		
		// Get the fish from the tile
		Fish caughtFish = currentTile.catchFish();
		
		if (caughtFish != null) 
		{
			boatInventory.append(caughtFish.toString() + "\n");
			gameUpdates.append("You caught a " + caughtFish.toString() + "\n");
			gamePanel.addScore(caughtFish.getPoints());
		}
		else
		{
			gameUpdates.append("There are no more fish here!\n");
		}
		
		if (gamePanel.getScore() >= FishingGamePanel.WINNING_SCORE)
		{
			JOptionPane.showMessageDialog(gamePanel, "WINNER! Your score is: " + gamePanel.getScore());
			System.exit(0);
		}
		
		gamePanel.requestFocusInWindow();
	}
}
