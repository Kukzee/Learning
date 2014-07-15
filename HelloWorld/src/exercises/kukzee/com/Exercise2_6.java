/**
 * Suppose that a file named "testdata.txt" contains the following information: 
 * The first line of the file is the name of a student. Each of the next three
 *  lines contains an integer. The integers are the student's scores on three 
 *  exams. Write a program that will read the information in the file and display
 *   (on standard output) a message the contains the name of the student and the
 *    student's average grade on the three exams. The average is obtained by 
 *    adding up the individual exam grades and then dividing by the number of exams. 
 */
package exercises.kukzee.com;

import utils.kukzee.com.TextIO;

/**
 * @author Cruzm
 *
 */
public class Exercise2_6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		double exam1, exam2, exam3;
		TextIO.putln("Good Afternoon!  This program will read");
	    TextIO.putln("your exams from file and display the average.");
	    TextIO.putln();
	    TextIO.readFile("testdata.txt");
	    name = TextIO.getln();
	    exam1 = TextIO.getlnDouble();
	    exam2 = TextIO.getlnDouble();
	    exam3 = TextIO.getlnDouble();
	    System.out.printf("Hi %s, your average is %1.2f", name, (exam1+exam2+exam3)/3);
	}

}
