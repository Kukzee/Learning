/**
 * If you have N eggs, then you have N/12 dozen eggs, with N%12 eggs left over. 
 * (This is essentially the definition of the / and % operators for integers.) 
 * Write a program that asks the user how many eggs she has and then tells the 
 * user how many dozen eggs she has and how many extra eggs are left over.
 * 
 * A gross of eggs is equal to 144 eggs. Extend your program so that it will 
 * tell the user how many gross, how many dozen, and how many left over eggs 
 * she has. For example, if the user says that she has 1342 eggs, then your 
 * program would respond with
 * 
 * Your number of eggs is 9 gross, 3 dozen, and 10
 * 
 * since 1342 is equal to 9*144 + 3*12 + 10.
 */
package exercises.kukzee.com;

import java.util.Scanner;

/**
 * @author Cruzm
 *
 */
public class Exercise2_5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalEggs, gross, dozen, leftover;
		Scanner stdin = new Scanner(System.in);
		System.out.println("This program asks how many eggs you "
				+ "have and calculate the number of gross, dozen and leftover eggs");
		System.out.print("\n\nHow many eggs you have?");
		totalEggs = stdin.nextInt();
		stdin.nextLine();
		
		gross = totalEggs/145;
		dozen = (totalEggs%145)/12;
		leftover = (totalEggs%145)%12;
		System.out.printf("You have %d gross, %d dozen, and %d leftover eggs.",gross,dozen,leftover);
		stdin.close();
	}

}
