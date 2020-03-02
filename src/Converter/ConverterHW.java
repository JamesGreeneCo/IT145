package Converter;
import javax.swing.*;
import java.util.*;

public class ConverterHW {
	
	// Setting Global Var.
	static final double CENTIMETER_CONVERTER = 2.54;
	static double inches = 10;
	static double result;
	static String myName;
	static Scanner kb = new Scanner(System.in);
	
	public static void main(String[] args) {
		main();
		Output();
	}

	
	public static void main() {
		
				
	}
	public static void Output() {
		
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