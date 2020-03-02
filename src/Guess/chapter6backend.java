package Guess;

public class chapter6backend 
{	//start of class
	
	//setting up varaibles
	private int LOW_NUM;
	private int HIGH_NUM;
	int userNum, randomNum;
	private int attempts = 1;
	private String inputMsg;
	private String outputMsg = "";
	
	public chapter6backend()	
	{	//start of pulbic
		LOW_NUM = 1;
		HIGH_NUM = 10;
	}	//end of public
	public chapter6backend(int L, int H, int R, String M, String O, int U, int A)	
	{	//start of public method
		LOW_NUM = L;
		HIGH_NUM = H;
		randomNum = R;
		inputMsg = M;
		outputMsg = O;
		userNum = U;
		attempts = A;
	}	//end of public method
	public int getLow()	
	{	//start of getLow mehtod
		return LOW_NUM;
	}	//end of getLowm mehtod
	public void setLow(int L)	
	{	//start og setLow method
		LOW_NUM = L;
	}	//end of setLow mehtod
	public int getHigh()	
	{	//start of getHIhg mehtod
		return HIGH_NUM;
	}	//end of getHigh mehtod
	public void setHigh(int H)	
	{	//start of setHigh mehtod
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
	{	//start of getInput mehtod
		return inputMsg;
	}	//end of getInput method
	public void setInput(String M)	
	{	//start of setInput method
		inputMsg = M;
	}	//end of steINput method
	public String getOutput(String outputMsg, int userNum, int randomNum)	
	{	//start of getOuput method
		
		System.out.println(randomNum);
		//outputMsg = "working2 " + userNum + randomNum;
		
		
		return outputMsg;
	}	//end of getInput method
	public void setOutput(String O)	
	{	//start of setOuput method
		outputMsg = O;
	}	//end of setouput mehtod
	public int getUser(String M)	
	{	//start of getUser method
		//userNum = Integer.parseInt(M);
		userNum = Integer.parseInt(M);
		return userNum;
	}	//end of getUser method
	public void setUser(int U)	
	{	//start of setUser method
		userNum = U;
	}	//end of setUser mehtod
	public int getAttempts(int attempts)	
	{	//start of getAttempts method
		return attempts;
	}	//end of getAttemtps method
	public void setAttempts(int A)	
	{	//start of setAttempts method
		attempts = A;
	}	//end of setAttempts mtehod

}	//end of class
