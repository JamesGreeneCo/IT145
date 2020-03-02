package Guess;
import javax.swing.JOptionPane;

class chapter6HW	{
	static int LOW_NUM, HIGH_NUM, randomNum, userNum, attempts;
	static String inputMsg;
	static String outputMsg = "";
	public static void main(String[] Args) {
		chapter6backend b = new chapter6backend(LOW_NUM, HIGH_NUM, randomNum, inputMsg, outputMsg, userNum, attempts);
		System.out.println(setBoundLow(LOW_NUM, b, inputMsg));
		System.out.println(setBoundHigh(HIGH_NUM, b, inputMsg));
		loop(LOW_NUM, HIGH_NUM, b, randomNum);
		box(inputMsg, outputMsg, LOW_NUM, HIGH_NUM, userNum, b);
		int x = loop(LOW_NUM, HIGH_NUM, b, randomNum);
		System.out.println("Random Number " + x);
		decision(b, randomNum, x, userNum, outputMsg, inputMsg, attempts);
	}
	public static int loop(int L, int H, chapter6backend b, int R)	{
		int x = b.getRan(H, L);
		return x;
	}
	public static int setBoundLow(int L, chapter6backend b, String M)	{
		inputMsg = JOptionPane.showInputDialog(null, "Pick a low bound");
		LOW_NUM = Integer.parseInt(inputMsg);
		return LOW_NUM;
	}
	public static int setBoundHigh(int H, chapter6backend b, String M)	{
		inputMsg = JOptionPane.showInputDialog(null, "Pick a high bound");
		HIGH_NUM = Integer.parseInt(inputMsg);
		return HIGH_NUM;
	}
	
	public static void box(String M, String O, int L, int H, int U, chapter6backend b)	{
		inputMsg = JOptionPane.showInputDialog(null, "Think of a number between " + L + " - " + H + ".");
		userNum = Integer.parseInt(inputMsg);
		System.out.println("User Number " + b.getUser(inputMsg));
	}
	public static void decision(chapter6backend b, int R, int x, int U, String O, String M, int A)	{
		while (userNum != x)	{
			if (userNum < x)	{
				JOptionPane.showMessageDialog(null, "Too Low");
				
				
			}	else	{
				JOptionPane.showMessageDialog(null, "Too High");
				
			}
			
			inputMsg = JOptionPane.showInputDialog(null, "Your number is " + userNum + " Guess another number between " + LOW_NUM + " - " + HIGH_NUM + ".");
			userNum = Integer.parseInt(inputMsg);
			attempts++;
		}
		outputMsg = "Success!";
		JOptionPane.showMessageDialog(null, outputMsg + " Random number was " + x + ".  You guessed in: " + attempts + " tries");
	}
	
	
}