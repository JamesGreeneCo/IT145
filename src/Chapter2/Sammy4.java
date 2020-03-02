package Chapter2;
import java.util.Scanner;

class Sammy4	{
	//Get Input
	static Scanner kb = new Scanner(System.in);
	public static void main(String[] Args) {
		int minutes, hours, total;
		String contract;
		displayMotto();
		
		//Create an instance of Rental hardcode constructor
		Rental myRental = new Rental();
		System.out.println("Contract: " + myRental.getContract());
		System.out.println("Hours: " + myRental.getHours());
		System.out.println("Minutes: " + myRental.getMinutes());
		System.out.println("The total is: " + myRental.calcTotal());
		
		System.out.println("");
		//Create an instance of Rental overloaded constructor
		Rental secondRental = new Rental(30, 1, "B2");
		System.out.println("Contract: " + secondRental.getContract());
		System.out.println("Hours: " + secondRental.getHours());
		System.out.println("Minutes: " + secondRental.getMinutes());
		System.out.println("The total is: " + secondRental.calcTotal());
		
		//Create an instance of Rental using Scanner
		hours = kbHours();
		minutes = kbMinutes();
		contract = kbContract();
		Rental thirdRental = new Rental(minutes, hours, contract);
		System.out.println("Contract: " + thirdRental.getContract());
		System.out.println("Hours: " + thirdRental.getHours());
		System.out.println("Minutes: " + thirdRental.getMinutes());
		System.out.println("The total is: " + thirdRental.calcTotal());
		System.out.println("");
		
	}
	private static void displayMotto()	{
		System.out.println("***********************************************");
		System.out.println("*********Sammy's Fun in the Sun -4 ******");
		System.out.println("***********************************************");
	}
	private static int kbMinutes()	{
		int minutes;
		System.out.println("How many minutes do you want? ");
		minutes = kb.nextInt();
		return minutes;
	}
	private static int kbHours()	{
		int hours;
		System.out.println("How many hours do you want? ");
		hours = kb.nextInt();
		return hours;
	}
	private static String kbContract()	{
		String contract;
		System.out.println("Contract Number: ");
		contract = kb.next();
		return contract;
	}
	
}