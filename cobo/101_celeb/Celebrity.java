/**
 * Celebrity base class for the Celebrity game.
 * @author cody.henrichsen
 * @version 1.4 17/09/2018
 */
public class Celebrity
{
	/**
	 * The clue to determine the celebrity
	 */
	private String _clue;
	/**
	 * The answer or name of the celebrity.
	 */
	private String _answer;
	/**
	 * Creates a Celebrity instance with the supplied answer and clue
	 * @param answer
	 * @param clue
	 */
	public Celebrity(String answer, String clue)
	{
		_answer = answer;
		_clue = clue;
	}

	/**
	 * Supplies the clue for the celebrity
	 * @return
	 */
	public String getClue()
	{
		return _clue;
	}

	/**
	 * Supplies the answer for the celebrity.
	 * @return
	 */
	public String getAnswer()
	{
		return _answer;
	}

	/**
	 * Updates the clue to the provided String.
	 * @param clue The new clue.
	 */
	public void setClue(String clue)
	{
		_clue = clue;
	}

	/**
	 * Updates the answer to the provided String.
	 * @param answer The new answer.
	 */
	public void setAnswer(String answer)
	{
		_answer = answer;
	}

	/**
	 * Provides a String representation of the Celebrity.
	 */
	@Override
	public String toString()
	{
		return _answer;
	}

public static void main (String[] args){
	Celebrity jebronLames = new Celebrity("Lebron James", "Played in NBA since 2003, has won 4 championships, argued as the G.O.A.T of basketball alongside Michael Jordan");
	System.out.println("Name: " + jebronLames.getAnswer());
	System.out.println("Clue: " + jebronLames.getClue());
	jebronLames.setAnswer("Jackie Chan");
	jebronLames.setClue("One of the greatest stuntsmen of all time, acted in movies including Rush Hour, The Legend of Drunken Master, The Karate Kid, and more.");
	System.out.println("\n");
  System.out.println("Name: " + jebronLames.getAnswer());
	System.out.println("Clue: " + jebronLames.getClue());
	}
}
