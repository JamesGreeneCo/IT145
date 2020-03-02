/*
 * Connor Greene
 * Chapter 2
 * 
 * IPO Structure
 * 
 * 
 * 
 */

package Converter;
import javax.swing.*;
import java.util.Scanner;

public class converter {

	public static void main(String[] Args)
	{
		//Scanner
		Scanner kb = new Scanner(System.in);
		// Constant Variables
		final double CENTIMETER_CONVERTER = 2.54;
		
		// Var
		double inches = 10;
		double result;
		String myName;
		
		//Input
		System.out.print("Enter your name: ");
		myName = kb.next();
		
		System.out.println();
		
		System.out.print("Enter the inches: ");
		inches = kb.nextDouble();
		
		//Calculation
		result = inches * CENTIMETER_CONVERTER;
		
		//Output
		System.out.println(myName + " the Conversion is: " + result);
		JOptionPane.showMessageDialog(null, myName +  " the conversion is: " + result);
		
	}
	
	

}
