
/**
 * A scoresheet records the score for each turn of a game.
 * In addition to reporting the current score, it also
 * has capabilities to report various statistics.
 */
public class ScoreSheet
{
  private int score;
  private int numTurns;

  /**
   * In a new scoresheet, the score is 0 and no turns
   * have occurred.
   */
  public ScoreSheet()
  {
    score = 0;
    numTurns = 0;
  }
  
  /**
   * Record the fact that one more turn has been completed
   * and add its score to the total
   * @param turnScore the score of the last turn
   */
  public void recordTurn(int turnScore)
  {
    score += turnScore;
    numTurns += 1;
  }
  
  /**
   * Query for the current score
   * @return the current score as an integer
   */
  public int getScore()
  {
    return score;
  }
  
  /**
   * Query for the number of turns
   * @return the number of turns recorded so far
   */
  public int getNumTurns()
  {
    return numTurns;
  }
  
  /**
   * Query for the average score for the turns recorded so far
   * @return the average score per turn as a double
   */
  public double getTurnAverage()
  {
    if(numTurns == 0)
    {
      return 0.0;
    }
    
    return score / (double)numTurns;
  }
  
  /**
   * Reset the score to zero and the number of turns to 0
   */
  public void reset()
  {
    score = 0;
    numTurns = 0;
  }
}
