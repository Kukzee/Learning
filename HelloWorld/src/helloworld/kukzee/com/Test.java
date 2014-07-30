package helloworld.kukzee.com;


public class Test {
	enum Day { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY }
	public static void main(String[] args) {
		Day  weekday;  // User's response as a value of type Day.
		while ( true ) {
		   String response;  // User's response as a String.
		   System.out.print("Please enter a day of the week: ");
		   response = utils.kukzee.com.TextIO.getln();
		   response = response.toUpperCase();
		   try {
		      weekday = Day.valueOf(response);
		      System.out.println(weekday);
		      break;
		   }
		   catch ( IllegalArgumentException e ) {
		      System.out.println( response + " is not the name of a day of the week." );
		   }
		}
		// At this point, a legal value has definitely been assigned to weekday.
	}
}