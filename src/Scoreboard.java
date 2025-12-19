import java.io.*;
import java.util.ArrayList;
/**
 * Lead Author(s): 
 * @author Robert Fuentes
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
 * Version/date: 12/18/2025
 * 
 * Responsibilities of class:
 * 
 * 
 */

 public class Scoreboard
{
    // A Scoreboard has-many scores
    private ArrayList<String> scores = new ArrayList<String>();

    // Add a score
    public void addScore(String score)
    {
        scores.add(score);
    }

    // Get all scores
    public ArrayList<String> getScores()
    {
        return scores;
    }

    // Save scores to file
    public void saveScores()
    {
        try
        {
            FileWriter writer = new FileWriter("scoreboard.txt", true);
            for (String score : scores)
            {
                writer.write(score + "\n");
            }
            writer.close();
        }
        
        // Error in saving file
        catch (IOException e)
        {
            System.out.println("Something went wrong in saving score");
        }
    }
}