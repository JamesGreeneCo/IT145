package Guess;
import javax.swing.JOptionPane;

class guessGame	{
	public static void main(String[] Args) {
		
		final int LOW_NUM = 1;
		final int HIGH_NUM = 10;
		
		int userNum, randomNum;
		int attempts = 1;
		String inputMsg;
		String outputMsg = "";
		
		inputMsg = JOptionPane.showInputDialog(null, "Think of a number between " + LOW_NUM + " - " + HIGH_NUM + ".");
		userNum = Integer.parseInt(inputMsg);
		randomNum = LOW_NUM + (int)(Math.random()*HIGH_NUM);
		
		while (userNum != randomNum)	{
			if(userNum < randomNum)	{
				outputMsg = "too low";
				
				
			}	else {
				outputMsg = "too high";
			}
			
			inputMsg = JOptionPane.showInputDialog(null, "Your number is " + outputMsg + " Guess another number between " + LOW_NUM + " - " + HIGH_NUM + ".");
			userNum = Integer.parseInt(inputMsg);
			attempts++;
		}
		outputMsg = "success";
		JOptionPane.showMessageDialog(null, outputMsg + " Random number was " + randomNum + ".  You guessed in: " + attempts + " tries");
		
	}
}