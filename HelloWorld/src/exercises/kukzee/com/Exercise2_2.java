/**
 * 2 dice simulation
 */
package exercises.kukzee.com;
/**
 * @author Cruzm
 *
 */
public class Exercise2_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int FirstDice;
		int SecondDice;
		
		FirstDice = (int) (Math.random()*6) + 1;
		SecondDice = (int) (Math.random()*6) + 1;
		System.out.println("The first die comes up " + FirstDice);
		System.out.println("The second die comes up " + SecondDice);
		System.out.println("Your total roll is " + (FirstDice + SecondDice));
	}

}
