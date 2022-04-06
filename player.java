public class player 
{
	
	private final String name;
	private static int numberOfGames = 0;
	private int playerScore;
	
	public player (String name)
	{
		this.name = name;
		this.numberOfGames++;
		this.playerScore = numberOfGames;
	}
	
	public int getNumberOfGames ()
	{
		return numberOfGames;
	}
	
	public int getPlayerScore ()
	{
		return playerScore;
	}

}