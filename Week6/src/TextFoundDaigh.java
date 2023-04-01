
/**  
* Deon Daigh - dmdaigh
* CIS171 23355
* Apr 1, 2023
* MacOS 13.2
*/

import java.util.Scanner;
public class TextFoundDaigh {
	
	public static boolean CheckInputString(String input) {
		boolean vowelsAreGrouped = false;
//		loops through input
		for(int i = 0; i < input.length() - 1; i++) {
//			gets 2 characters at a time
			String sub = input.substring(i, i + 2);
//			checks the two characters to see if they match the string
			if(sub.equals("ee")) {
				vowelsAreGrouped = true;
				break;
			} else if(sub.equals("oo")) {
				vowelsAreGrouped = true;
				break;
			}
		}
		
		return vowelsAreGrouped;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		gets user input
		System.out.println("Please input a string");
		String userInput = in.next();
		
		System.out.println(CheckInputString(userInput));

	}

}
