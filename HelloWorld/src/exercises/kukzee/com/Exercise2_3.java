/**
 * 
 */
package exercises.kukzee.com;
import java.util.Scanner;

import utils.kukzee.com.TextIO;
/**
 * @author Cruzm
 *
 */
public class Exercise2_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		System.out.print("Let me know your name : ");
		name = TextIO.getWord();
		System.out.println("Hello " + name.toUpperCase() + ", nice to meet you!");
		
		Scanner stdin = new Scanner(System.in);
		System.out.println("The next line uses a different mechanism for input");
		System.out.print("Let me know your name : ");
		name = stdin.nextLine();
		System.out.println("Hello " + name.toUpperCase() + ", nice to meet you!");
		stdin.close();
	}

}
