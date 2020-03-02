package week4;
import java.util.Scanner;

class carly4	
{	//start of class
	
	// setting up variables
	static int guess;
	static int cost = 35;
	static int cutoff = 30;
	static int total;
	static String contract;
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] Args) 
	{	//start of main
		//Attend a = new Attend(guess, cost, cutoff);
		intro();
		guess = kbGuess();
		cost = kbCost(guess, cost);
		contract = kbContract(contract);
		//System.out.println("guess: " + a.getGuess());
		//System.out.println("cost: " + a.getCost());
		
		Attend b = new Attend(guess, cost, total);
		System.out.println("The Amount of Guess is : " + b.getGuess());
		System.out.println("The Cost per person is : " + b.getCost(guess, cutoff));
		System.out.println("The Contract is : " + b.getContract(contract));
		System.out.println(("The Total Cost is : " + b.getTotal(guess, cost)));
	}	//end of main
	public static void intro()	
	{	//start of intro
		System.out.println("*********************************");
		System.out.println("*******Carly's Catering******");
		System.out.println("*********************************");
	}	//end of intro
	public static int kbGuess()	
	{	//start of kbGuess
		int g;
		System.out.println("How many guess do you have? ");
		g = kb.nextInt();
		return g;
	}	//end o fkbGuess
	public static int kbCost(int g, int c)	
	{	//start of kbCost
		return c;
	}	//end of kbCost
	public static int kbTotal(int g, int c, int t)	
	{	//start of kbTotal
		
		return t;
	}	//end of kbTotal
	public static String kbContract(String co)	{
		System.out.println("What event # ?");
		co = kb.next();
		return co;
	}
}	//end class
