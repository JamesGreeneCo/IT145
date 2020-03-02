package Chapter2;
import java.util.Scanner;

class Carly4	{
	static int guessAmount;
	int total;
	static Scanner kb = new Scanner(System.in);
	public static void main(String[] Args) {
		displayMotto();
		
		
		guessAmount = kbAmount();
		//guessCost firstCost = new guessCost(guessAmount);
		
		
		
		
	}
	public static void displayMotto()	
	{	//Start of displayMotto method
		System.out.println("*********************************");
		System.out.println("*******Carly's Catering******");
		System.out.println("*********************************");
	}	//Start of displayMotto method
	
	private static int kbAmount()	{
		int guessAmount;
		System.out.println("How many people? ");
		guessAmount = kb.nextInt();
		return guessAmount;
	}
}