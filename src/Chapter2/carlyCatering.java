/*
 * Author: Connor Greene
 * Class: IT-145
 * Chapter 1 Homeword
 */

package Chapter2;

import java.util.Scanner;
import javax.swing.*;

class carlyCatering 
{	//Start of Class
	
	//Setting up Global Var.
	static int personCost = 35;
	static int guessAmount;
	static int largeGuess = 50;
	static double total;
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] Args) 
	{	//Start of main method
		entryMoto();
		guessCalculations();
}	//End of main method
	
	public static void entryMoto() 
	{	//Start of entryMoto method
		System.out.println("*********************************");
		System.out.println("*******Carly's Catering******");
		System.out.println("*********************************");
	}	//End of entryMoto method
	public static void guessCalculations() 
	{	//Start of guessCalucations method
		System.out.println("How many people are going to be on the guess list? ");
		guessAmount = kb.nextInt();
		if (guessAmount >= largeGuess) 
		{	//Start of if statement
			System.out.println("Large Guess List? ");
			System.out.println(true);
		}	//End of if statement
		total = (personCost * guessAmount);
		System.out.println("The total cost is: " + total);
		JOptionPane.showMessageDialog(null, "The total cost is: " + total);
		
	}	//end of guessCalucations method
	
}	//End of class