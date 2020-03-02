package Chapter2;
import java.util.*;
import javax.swing.JOptionPane;

class chapter3Carly	
{	//Start of class
	
	//Setting up Global Var.
	static int personCost = 35;
	static int guessAmount;
	static int largeGuess = 50;
	static int total;
	static Scanner kb = new Scanner(System.in);
		
	public static void main(String[] Args)	
	{	//Start of main method
		displayMotto();
		guessAmount = numberOfGuest();
		total = calculateGuest(guessAmount);
		displayTotal(total);
	}	//End of main method
	public static void displayMotto()	
	{	//Start of displayMotto method
		System.out.println("*********************************");
		System.out.println("*******Carly's Catering******");
		System.out.println("*********************************");
	}	//Start of displayMotto method
	public static int numberOfGuest()	
	{	//Start of numberOfGuest method
		System.out.println("How many people are going to be on the guess list? ");
		guessAmount = kb.nextInt();
		if (guessAmount >= largeGuess)	
			
		{	//Start of if statement
			System.out.println("Large Guess List? ");
			
			System.out.println(true);
			
		}	//End of if statement
		return guessAmount;
	}	//End of numberOfGuest method
	public static int calculateGuest(int guessAmount)	
	{	//Start of calculatedGuest method
		
		total = (personCost * guessAmount);
		
		return total;
	}	//End of calculateGuest method
	public static void displayTotal(int total)
	
	{	//Start of displayTotal method
		System.out.println("The total cost is: " + total);
		
		JOptionPane.showMessageDialog(null, "The total cost is: " + total);
	}	//End of displayTotal method
	
}	//End of class