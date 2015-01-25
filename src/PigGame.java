
/**
 * This class implements the logic for a computer player for
 * the game pig where decisions to stop or keep going are 
 * based on a cutoff value.  The interface allows a user to 
 * play a complete game and get various statistics about
 * the finished game.
 */
public class PigGame
{
  private Die d;
  private ScoreSheet s;
  private int cutoff;
  private int numBusts;

  /**
   * Once created, the game is ready to be played - i.e. it
   * has not yet been played.
   * 
   * @param cutoffValue the value the computer should use to 
   * make decisions
   */
  public PigGame(int cutoffValue)
  {
    d = new Die();
    s = new ScoreSheet();
    cutoff = cutoffValue;
    numBusts = 0;
  }

  /**
   * Play one complete game using the cutoff value to make
   * decisions.  All previous results are over-written.
   */
  public void playGame()
  {
    // reset the scorecard in case it already holds
    // information.
    s.reset();
    
    while(s.getScore() < 100)
    {
      int score = playTurn();
      
      s.recordTurn(score);
      
      if(score == 0)
        numBusts += 1;
    }
  }

  /**
   * Query to get the score of the last game
   * @return the score of the last game
   */
  public int getScore()
  {
    return s.getScore();
  }
  
  /**
   * Query to get the number of turns in the last game
   * @return the number of turns in the last game
   */
  public int getNumTurns()
  {
    return s.getNumTurns();
  }
  
  /**
   * Query to get the average score
   * @return the average score per turn in the last game
   */
  public double getTurnAverage()
  {
    return s.getTurnAverage();
  }
  
  /**
   * Get the number of times the player busted (rolled 1)
   * @return the number of busts
   */
  public int getNumBusts()
  {
    return numBusts;
  }
  
  /**
   * This method is marked "private," meaning that it cannot
   * be called from outside the class.  It is here because I
   * felt that the code was more readable by decomposing a
   * game into multiple turns.  
   * 
   * This method will play one turn using the cutoff value
   * and return the score for the turn
   */
  private int playTurn()
  {
    int score = 0;
    boolean rolledOne = false;
    
    // Three cases cause the end of turn:
    // 1. The roll is a 1.
    // 2. The turn score equals or exceeds the cutoff.
    // 3. The turn score plus the score sheet score equals or exceeds 100.
    while(!rolledOne && score < cutoff && score + s.getScore() < 100)
    {
      d.roll();
      if (d.getUpValue() == 1)
      {
        score = 0;
        rolledOne = true;
      }
      else
        score = score + d.getUpValue();
    }
    
    return score;
  }
}
  
  
    
  
