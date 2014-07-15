package helloworld.kukzee.com;

import utils.kukzee.com.TextIO;

/**
 * A program that reads an integer that is typed in by the
 * user and computes and prints the square of that integer.
 */
 
public class PrintSquare {
    
     public static void main(String[] args) {
 
        int userInput;  // The number input by the user.
        int square;     // The userInput, multiplied by itself.
        String test = new String();
        System.out.print("Please type a number: ");
        userInput = TextIO.getlnInt();
        square = userInput * userInput;
        TextIO.putln("The square of that number is " + square);
        test = TextIO.getln();
        TextIO.putln(test);
     } // end of main()
  
} //end of class PrintSquare