package week4;

public class Attend 
{

	private int guess;
	private int cost = 35;
	private int cutoff = 30;
	private int total;
	private String contract = "A0000";
	
	public Attend(int g, int c, String co)	
	{
		guess = g;
		cost = c;
		contract = co;
		//cutoff = f;
	}
	public void setContract(String co)	{
		contract = co;
	}
	public String getContract(String co)	{
		return co;
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
			System.out.println("Large Event");
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
