package Guess;

public class backend
{	//start of class
	//setting up variables
	private int LOW_NUM;
	private int HIGH_NUM;
	int userNum, randomNum;
	private int attempts = 1;
	private String inputMsg;
	private String outputMsg = "";
	
	public backend()	
	{	//start of backend
		LOW_NUM = 1;
		HIGH_NUM = 10;
	}	//end of backend
	public backend(int L, int H, int R, String M, String O, int U, int A)	
	{	//start of backend
		LOW_NUM = L;
		HIGH_NUM = H;
		randomNum = R;
		inputMsg = M;
		outputMsg = O;
		userNum = U;
		attempts = A;
	}	//end of backend
	public int getLow()	
	{	//start of getLow method
		return LOW_NUM;
	}	//end of getLow method
	public void setLow(int L)	
	{	//start of setLow method
		LOW_NUM = L;
	}	//end of setLow method
	public int getHigh()	
	{	//start of getHigh mehtod
		return HIGH_NUM;
	}	//end of getHigh method
	public void setHigh(int H)	
	{	//start of setHigh method
		HIGH_NUM = H;
	}	//end of setHigh method
	public int getRan(int H, int L)	
	{	//start of getRan method
		randomNum = L * (int)(Math.random()*H);
		return randomNum;
		
	}	//end of getRan method
	public void setRan(int R)	
	{	//start of setRan method
		randomNum = R;
	}	//end of setRan mehtod
	public String getInput()	
	{	//start of getInput method
		return inputMsg;
	}	//end of getInput method
	public void setInput(String M)	
	{	//start of setInput method
		inputMsg = M;
	}	//end of setinput method
	public String getOutput(String outputMsg, int userNum, int randomNum)	
	{	//start of getOutput method
		
		System.out.println(randomNum);
		//outputMsg = "working2 " + userNum + randomNum;
		
		
		return outputMsg;
	}	//end of getOutput method
	public void setOutput(String O)	
	{	//start of setOuput method
		outputMsg = O;
	}	//end of setOutput method
	public int getUser(String M)	
	{	//start of getUser method
		//userNum = Integer.parseInt(M);
		userNum = Integer.parseInt(M);
		return userNum;
	}	//end of getUser method
	public void setUser(int U)	
	{	//start of setUser mehtod
		userNum = U;
	}	//end of setUser method
	public int getAttempts(int attempts)	
	{	//start of getAttempts mehtod
		return attempts;
	}	//end of getAttemtps method
	public void setAttempts(int A)	
	{	//start of setAttempts method
		attempts = A;
	}	//end of setAttempts method

}	//end of class
