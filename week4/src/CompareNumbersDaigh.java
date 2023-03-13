

/**  
* Deon Daigh - dmdaigh
* CIS171 23355
* Mar 11, 2023
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
		
//		if statements that compare the numbers then prints the appropriate message.
		if(userInput1 == userInput2) {
			System.out.println(userInput1 + " is equal to " + userInput2);
		} else if(userInput1 > userInput2) {
			System.out.println(userInput1 + " is greater then " + userInput2);
		} else if(userInput1 < userInput2) {
			System.out.println(userInput1 + " is less then " + userInput2);
		}
	
		

	}

}
