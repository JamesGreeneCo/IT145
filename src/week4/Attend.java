package week4;

public class Attend 
{

	private int guess;
	private int cost = 35;
	private int cutoff = 30;
	private int total;
	
	public Attend(int g, int c)	
	{
		guess = g;
		cost = c;
		//cutoff = f;
	}
	public void setGuess(int g)	
	{
		guess = g;
	}
	public void setCost(int c)	
	{
		cost = c;
	}
	public void setCutoff(int f)	
	{
		cutoff = f;
	}
	public int getCutoff()	
	{
		return cutoff;
	}
	public int getGuess()	
	{
		return guess;
	}

	public int getCost(int g, int f)	
	{
		if (g >= 50)	{
			cost = cutoff;
		}
		return cost;
	}
	public void setTotal(int t)	
	{
		total = t;
	}
	public int getTotal(int g, int c)	
	{
		total = g * c;
		return total;
	}
	public Attend(int g, int c, int t)	
	{
		guess = g;
		cost = c;
		total = t;
	}
}
