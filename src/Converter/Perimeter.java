/*
 * Author: Connor Greene
 * Class: INT-145
 * Chapter 1: Perimeter & Area 
 */

package Converter;
import javax.swing.*;
import java.util.*;

class Perimter 
{	//Start of class
	
	//Declaring Global Var.
	
	static int width;
	static int length;
	static int result;
	static Scanner kb = new Scanner(System.in);
	
	public static void main(String[] Args)	
	{
		//Declaring methods
		area();
		perimeter();
	}
	
	public static void area() 
	{	//Start of area method
		System.out.print("Enter the width for the Area: ");
		width = kb.nextInt();
		
		System.out.print("Enter the Length for the Area: ");
		length = kb.nextInt();
		
		result = width * length;
		System.out.println("The Area is " + result);
		JOptionPane.showMessageDialog(null, "The Area is " + result);
		
	}	//End of area method
	public static void perimeter() 
	{	//Start of perimeter method
		System.out.print("Enter the width for the Perimeter: ");
		width = kb.nextInt();
		
		System.out.print("Enter the length for the Perimeter: ");
		length = kb.nextInt();
		
		result = 2*(width+length);
		System.out.println("The Perimter is " + result);
		JOptionPane.showMessageDialog(null, "The Perimteter is " + result);
		
	}	//End of perimeter method
	
	
}	//End of Class