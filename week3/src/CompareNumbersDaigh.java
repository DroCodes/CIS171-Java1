

/**  
* Deon Daigh - dmdaigh
* CIS171 23355
* Mar 5, 2023
* MacOS 13.2
*/

import java.util.Scanner;

public class CompareNumbersDaigh {

	public static void main(String[] args) {
//		initializes the scanner
		Scanner in = new Scanner(System.in);
		
//		gets user input
		System.out.println("Please enter the first number");
		double userInput1 = in.nextDouble();
		
		System.out.println("Please enter the Second number");
		double userInput2 = in.nextDouble();
		
//		compares the user input
		boolean isEqual = userInput1 == userInput2;
		boolean isGreaterThen = userInput1 > userInput2;
		boolean isLessThen = userInput1 < userInput2;
		
//		prints the results
		System.out.println(userInput1 + " is equal to " + userInput2 + ": " + isEqual);
		System.out.println(userInput1 + " is greater then " + userInput2 + ": " + isGreaterThen);
		System.out.println(userInput1 + " is less then " + userInput2 + ": " + isLessThen);
		

	}

}
