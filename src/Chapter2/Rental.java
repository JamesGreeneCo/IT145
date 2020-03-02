package Chapter2;

public class Rental {
	//instance variables
	private String contract;
	private int minutes;
	private int hours;
	final int HOUR_RENTAL = 40;
	final int MINUTE_RENTAL = 1;
	
	
	public Rental()	{
		contract = "A1";
		minutes = 0;
		hours = 1;
	}	//end constructor
	public Rental(int m, int h, String c)	{
		contract = c;
		minutes = m;
		hours = h;
	}
	//Getter Setter Methods
	public int getMinutes()	{
		return minutes;
	}//end of getMinutes
	public void setMinutes(int m)	{
		minutes = m;
	}//end of setMinutes
	public int getHours()	{
		return hours;
	}
	public void setHours(int h)	{
		hours = h;
	}
	public int calcTotal()	{
		int total;
		total = (hours * HOUR_RENTAL) + (minutes * MINUTE_RENTAL);
		return total;
	}
	public String getContract()	{
		return contract;
	}
	public void setContract(String c)	{
		contract = c;
	}
}	//end class
