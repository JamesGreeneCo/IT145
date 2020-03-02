package Intro;
import javax.swing.*;
/*
 * Week 1:
 * Lecture 1:
 * 
 * 
 * 
 * 
 */
public class MyClass extends javax.swing.JOptionPane {

	public static void main(String[] args) 
	{ 
		//Output to console
		System.out.println("Connor Greene"); 
		System.out.println();
		System.out.println("My Guessing Game");
		
		//Output to dialog
		JOptionPane.showMessageDialog(null, "Think of a number between 1 & 10", "Guessing Game", JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Number: " + (1 + (int)(Math.random() * 10)), "Guessing Game", JOptionPane.INFORMATION_MESSAGE );
		
	}
	
}
