package Chapter2;

public class guessCost {
	private final int personCost = 40;
	int guessAmount;
	private final int largeGuess = 50;
	boolean large;
	static int total;
	
	public int getGuess(int g)	{
		return guessAmount;
	}
	public void setGuess(int g)	{
		guessAmount = g;
	}
	public boolean getLargeParty()	{
		if (guessAmount <= largeGuess)	{
			large = false;
		}	else {
			large = true;
		}
		return large;
	}
	public void setLargeParty(boolean l)	{
		large = l;
	}
	public int getTotal()	{
		return total;
	}
	public void setTotal(int to)	{
		total = to;
	}
}
