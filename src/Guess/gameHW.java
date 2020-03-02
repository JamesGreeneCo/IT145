package Guess;
import javax.swing.JOptionPane;

class gameHW	{
	static int LOW_NUM = 1, HIGH_NUM = 10, randomNum, userNum, attempts;
	static String inputMsg;
	static String outputMsg = "";
	public static void main(String[] Args) {
		
		backend a = new backend(LOW_NUM, HIGH_NUM, randomNum, inputMsg, outputMsg, userNum, attempts);
		loop(LOW_NUM, HIGH_NUM, a, randomNum);
		box(inputMsg, outputMsg, LOW_NUM, HIGH_NUM, userNum, a);
		int x = loop(LOW_NUM, HIGH_NUM, a, randomNum);
		System.out.println("Random Number " + x);
		decision(a, randomNum, x, userNum, outputMsg, inputMsg, attempts);
		
		
	}
	public static int loop(int L, int H, backend a, int R)	{
		int x = a.getRan(H, L);
		return x;
	}
	
	public static void box(String M, String O, int L, int H, int U, backend a)	{
		inputMsg = JOptionPane.showInputDialog(null, "Think of a number between " + L + " - " + H + ".");
		userNum = Integer.parseInt(inputMsg);
		System.out.println("User Number " + a.getUser(inputMsg));
	}
	public static void decision(backend a, int R, int x, int U, String O, String M, int A)	{
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