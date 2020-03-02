/*
 * Author: Connor Greene
 * Class: IT-145
 * Sammy2 Example: Page 118
 */

package Chapter2;

import java.util.Scanner;
import javax.swing.*;

class inClass {
	static int hours;
	static int minutes;
	static int cost = 40;
	static int minuteCost = 1;
	static double total;
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] Args) {
		sammyMoto();
		rates();
		
	}
	public static void sammyMoto() {
		System.out.println("*********************************");
		System.out.println("*******Sammy's Fun in the Sun******");
		System.out.println("*********************************");
	}
	public static void rates() {
		System.out.println("How many hours do you want to rent? ");
		hours = kb.nextInt();
		
		System.out.println("How many minutes do you want to rent? ");
		minutes = kb.nextInt();
		
		total = (hours * cost) + (minutes * minuteCost);
		System.out.println(total);
		JOptionPane.showMessageDialog(null, "Your total is $" + total + " from " + hours + "hr " + minutes + "min ");
		
	}
	
}