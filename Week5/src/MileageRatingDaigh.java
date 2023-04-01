
/**  
* Deon Daigh - dmdaigh
* CIS171 23355
* Mar 18, 2023
* MacOS 13.2
*/

import java.util.Scanner;
public class MileageRatingDaigh {
	
	public static String CalculateMileage(double mileage) {
		int excellentMileage = 40;
		int goodMileage = 30;
		int poorMileage = 20;
		
//		checks the mileage arg to determine the quality of the MPG
		if(mileage >= excellentMileage) {
			return "Excellent";
		} else if(mileage >= goodMileage) {
			return "Good";
		} else if (mileage >= poorMileage) {
			return "Fair";
		} else {
		return "Poor";
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter your MPG.");
//		Checks the input is a sequence of numbers
		if(in.hasNextDouble()) {
			double userInput = in.nextDouble();
//			checks that userInput is not a negative number
			if(userInput <= 0) {
//				Error message
				System.out.print("Error, Please enter your MPG as a positive number.");
			}
		} else {
//			Error message
			System.out.print("Error, Please enter a valid number");
		}
		
	}

}
