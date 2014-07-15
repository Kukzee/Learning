/**
 * 
 */
package exercises.kukzee.com;

import java.util.Scanner;

/**
 * @author Cruzm
 *
 */
public class Exercise2_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int quarters, dimes, nickels, pennies;
		
		Scanner stdin = new Scanner(System.in);
		System.out.println("This program computes your money in dollars");
		System.out.println("by letting it know how much quarters, dimes, nickels or pennies you have");
		System.out.print("\nHow many quarters you have?");
		quarters = stdin.nextInt();
		System.out.print("\nHow many dimes you have?");
		dimes = stdin.nextInt();
		System.out.print("\nHow many nickels you have?");
		nickels = stdin.nextInt();
		System.out.print("\nHow many pennies you have?");
		pennies = stdin.nextInt();
		System.out.printf("\n\nYou have a total of $%1.2f ", quarters*0.25 + dimes *0.10 + nickels * 0.05 + pennies * 0.01);
		stdin.close();
	}

}
