package Guess;
import javax.swing.JOptionPane;

class chapter6HW
{	//start of class
	//setting up varibales
	static int LOW_NUM, HIGH_NUM, randomNum, userNum, attempts;
	static String inputMsg;
	static String outputMsg = "";
	public static void main(String[] Args) 
	{	//start of main mehtod
		//calling backend class
		chapter6backend b = new chapter6backend(LOW_NUM, HIGH_NUM, randomNum, inputMsg, outputMsg, userNum, attempts);
		//calling methods
		System.out.println(setBoundLow(LOW_NUM, b, inputMsg));
		System.out.println(setBoundHigh(HIGH_NUM, b, inputMsg));
		loop(LOW_NUM, HIGH_NUM, b, randomNum);
		box(inputMsg, outputMsg, LOW_NUM, HIGH_NUM, userNum, b);
		int x = loop(LOW_NUM, HIGH_NUM, b, randomNum);
		System.out.println("Random Number " + x);
		decision(b, randomNum, x, userNum, outputMsg, inputMsg, attempts);
	}	//end of main mehtod
	public static int loop(int L, int H, chapter6backend b, int R)	
	{	//start of loop mehtod
		int x = b.getRan(H, L);
		return x;
	}	//end of loop method
	public static int setBoundLow(int L, chapter6backend b, String M)	
	{	//start of setBoundLow mehtod
		inputMsg = JOptionPane.showInputDialog(null, "Pick a low bound");
		LOW_NUM = Integer.parseInt(inputMsg);
		return LOW_NUM;
	}	//end of setBoundLow method
	public static int setBoundHigh(int H, chapter6backend b, String M)
	{	//start of setBoundHigh method
		inputMsg = JOptionPane.showInputDialog(null, "Pick a high bound");
		HIGH_NUM = Integer.parseInt(inputMsg);
		return HIGH_NUM;
	}	//end of setBoundHigh method
	
	public static void box(String M, String O, int L, int H, int U, chapter6backend b)	
	{	//start of box method
		inputMsg = JOptionPane.showInputDialog(null, "Think of a number between " + L + " - " + H + ".");
		userNum = Integer.parseInt(inputMsg);
		System.out.println("User Number " + b.getUser(inputMsg));
	}	//end of box method
	public static void decision(chapter6backend b, int R, int x, int U, String O, String M, int A)	
	{	//start of decision method
		while (userNum != x)	
		{	//start of while
			if (userNum < x)	
			{	//starrt of if
				JOptionPane.showMessageDialog(null, "Too Low");
				
				
			}	//end of if
			else	
			{	//start of else
				JOptionPane.showMessageDialog(null, "Too High");
				
			}	//end of else
			
			inputMsg = JOptionPane.showInputDialog(null, "Your number is " + userNum + " Guess another number between " + LOW_NUM + " - " + HIGH_NUM + ".");
			userNum = Integer.parseInt(inputMsg);
			attempts++;
		}	//end of while
		outputMsg = "Success!";
		JOptionPane.showMessageDialog(null, outputMsg + " Random number was " + x + ".  You guessed in: " + attempts + " tries");
	}	//end of decision method
	
	
}	//end of class
