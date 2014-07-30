/**
 * 
 */
package helloworld.kukzee.com;

import utils.kukzee.com.TextIO;

/**
 * @author Cruzm
 *
 */
public class Menu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String units;       // Unit of measurement, entered by user.
		
		

		/* Read the user's unit of measurement. */

		TextIO.putln("What unit of measurement does your input use?");
		TextIO.put("inches, feet, yards, or miles ?");
		units = TextIO.getln().toLowerCase();

		/* Read user's measurement and convert to inches. */

		TextIO.put("Enter the number of " + units + ":  ");
		switch ( units ) {  // Requires Java 7 or higher!
		   case "inches":
		       break;          
		   case "feet":
		       break;          
		   case "yards":
		       break;          
		   case "miles":
		       break;
		   default:
		       TextIO.putln("Wait a minute!  Illegal unit of measure!  I quit!");
		       System.exit(1);          
		} // end switch
	}

}
