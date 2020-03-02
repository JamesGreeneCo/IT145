package Guess;
import javax.swing.JOptionPane;

class gameHW
{	//start of class
	//setting up varibales
	static int LOW_NUM = 1, HIGH_NUM = 10, randomNum, userNum, attempts;
	static String inputMsg;
	static String outputMsg = "";
	public static void main(String[] Args)
       	{	//start of main method
		
		//calling methods
		backend a = new backend(LOW_NUM, HIGH_NUM, randomNum, inputMsg, outputMsg, userNum, attempts);
		loop(LOW_NUM, HIGH_NUM, a, randomNum);
		box(inputMsg, outputMsg, LOW_NUM, HIGH_NUM, userNum, a);
		int x = loop(LOW_NUM, HIGH_NUM, a, randomNum);
		System.out.println("Random Number " + x);
		decision(a, randomNum, x, userNum, outputMsg, inputMsg, attempts);
		
		
	}	//end of main method
	public static int loop(int L, int H, backend a, int R)	
	{	//start of loop mehtod
		int x = a.getRan(H, L);
		return x;
	}	//end of loop method
	
	public static void box(String M, String O, int L, int H, int U, backend a)
	{	//start of box method
		inputMsg = JOptionPane.showInputDialog(null, "Think of a number between " + L + " - " + H + ".");
		userNum = Integer.parseInt(inputMsg);
		System.out.println("User Number " + a.getUser(inputMsg));
	}	//end of box method
	public static void decision(backend a, int R, int x, int U, String O, String M, int A)	
	{	//start of decision method
		while (userNum != x)	
		{	//start of while
			if (userNum < x)	
			{	//start of if
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
	}	//end of decision mehtod
	
	
}	//end of class
