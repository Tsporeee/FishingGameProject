import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
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
 * Version/date: 11/14/2025
 * 
 * Responsibilities of class:
 * Creates the game visuals
 * 
 */

public class FishingGameProjectView 
{
	
	// Creates GUI (TO DO)
	public static void main(String[] args)
	{
		
		// Create frame
		JFrame gameScreen = new JFrame(); 
		gameScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gameScreen.setTitle("Quick Casts!"); // Working title
		gameScreen.setLayout(new BorderLayout());
		
		// Add game panel
		FishingGamePanel gamePanel = new FishingGamePanel();
		
		// Create textarea for inventory
		JTextArea boatInventory = new JTextArea(20, 45);
		boatInventory.setBackground(Color.WHITE);
		boatInventory.setFocusable(false); // Make it so the game only focuses on the game panel
		
		// Create panel for the south GUI
		JPanel southGUI = new JPanel(); 
		southGUI.setLayout(new BorderLayout());
		
		// Create textarea and button for south GUI
		JTextArea gameUpdates = new JTextArea(20, 75);
		gameUpdates.setFocusable(false);
		JButton fishingButton = new JButton(); // Should we make this another class? 
		fishingButton.setFocusable(false);
		
		// Add textarea and button to south GUI
		southGUI.add(gameUpdates, BorderLayout.EAST);
		southGUI.add(fishingButton, BorderLayout.CENTER);
		
		// Add boatinventory, southgui, gamepanel to frame and pack
		gameScreen.add(boatInventory, BorderLayout.WEST);
		gameScreen.add(southGUI, BorderLayout.SOUTH);
		gameScreen.add(gamePanel, BorderLayout.CENTER);
		gameScreen.pack();
		
		// Puts screen in the middle
		gameScreen.setLocationRelativeTo(null);
		gameScreen.setVisible(true);
		
		// Make it so the gamepanel is in focus
		gamePanel.requestFocusInWindow();
	}

}
