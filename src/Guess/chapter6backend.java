package Guess;

public class chapter6backend {
	
	private int LOW_NUM;
	private int HIGH_NUM;
	int userNum, randomNum;
	private int attempts = 1;
	private String inputMsg;
	private String outputMsg = "";
	
	public chapter6backend()	{
		LOW_NUM = 1;
		HIGH_NUM = 10;
	}
	public chapter6backend(int L, int H, int R, String M, String O, int U, int A)	{
		LOW_NUM = L;
		HIGH_NUM = H;
		randomNum = R;
		inputMsg = M;
		outputMsg = O;
		userNum = U;
		attempts = A;
	}
	public int getLow()	{
		return LOW_NUM;
	}
	public void setLow(int L)	{
		LOW_NUM = L;
	}
	public int getHigh()	{
		return HIGH_NUM;
	}
	public void setHigh(int H)	{
		HIGH_NUM = H;
	}
	public int getRan(int H, int L)	{
		randomNum = L * (int)(Math.random()*H);
		return randomNum;
		
	}
	public void setRan(int R)	{
		randomNum = R;
	}
	public String getInput()	{
		return inputMsg;
	}
	public void setInput(String M)	{
		inputMsg = M;
	}
	public String getOutput(String outputMsg, int userNum, int randomNum)	{
		
		System.out.println(randomNum);
		//outputMsg = "working2 " + userNum + randomNum;
		
		
		return outputMsg;
	}
	public void setOutput(String O)	{
		outputMsg = O;
	}
	public int getUser(String M)	{
		//userNum = Integer.parseInt(M);
		userNum = Integer.parseInt(M);
		return userNum;
	}
	public void setUser(int U)	{
		userNum = U;
	}
	public int getAttempts(int attempts)	{
		return attempts;
	}
	public void setAttempts(int A)	{
		attempts = A;
	}

}
