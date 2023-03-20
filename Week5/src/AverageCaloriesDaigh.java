
/**  
* Deon Daigh - dmdaigh
* CIS171 23355
* Mar 19, 2023
* MacOS 13.2
*/

import java.util.Scanner;
public class AverageCaloriesDaigh {

	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		int totalDays = 7;
//		int totalCalories = 0;
//		
//		for(int i = 0; i < 7; i++) {
////			prompts user for calorie intake
//			System.out.println("Please enter your calorie intake");
//			int userCalorieIntake = in.nextInt();
////			Adds the userCalorieIntake to totalCalories
//			totalCalories += userCalorieIntake;
//		}
////		Calculates the average calorie intake
//		double averageCalorieIntake = totalCalories / totalDays;
////		Prints the average
//		System.out.println("Your average calorie intake is " + averageCalorieIntake + " calories");
		String s = "abcdefghijkl";
		int i = 1;
		do {
			if (i > 2) {
				System.out.print(s.substring(1, i));
			}
			i++;
		} while (i < 5);
	}

}
