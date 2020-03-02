package Chapter2;
import java.util.*;

public class Sammy3 {
	
	static int hours, minutes, total;
	static int cost = 40;
	static int minuteCost = 1;
	static Scanner kb = new Scanner(System.in);
	
	public static void main(String[] Args){
		sammyMotto();
		hours = getHours();
		minutes = getMinutes();
		total = getTotal(hours, minutes);
		getEnding(total);
		
	}
	public static void sammyMotto() {
		System.out.println("*********************************");
		System.out.println("*******Sammy's Fun in the Sun-3******");
		System.out.println("*********************************");
	}
	public static int getHours()	{
		System.out.println("How many hours do you want to rent? ");
		
		hours = kb.nextInt();
		
		
		return hours;
	}
	public static int getMinutes() {
		
		System.out.println("How many minutes do you want to rent? ");
		minutes = kb.nextInt();
		
		return minutes;
	}
	public static int getTotal(int hours, int minutes)	{
		
		total = (hours * cost) + (minutes * minuteCost);
		
		return total;
	}
	public static void getEnding(int total)	{
		System.out.println(total);

	}
	
}