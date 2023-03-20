
/**  
* Deon Daigh - dmdaigh
* CIS171 23355
* Mar 19, 2023
* MacOS 13.2
*/

import java.util.Scanner;
public class AverageExpensesDaigh {

	public static void main(String[] args) {
//		creating the scanner
		Scanner in = new Scanner(System.in);
//		Vars to store the number of inputs and the total user expenses
		int numberOfInputs = 1;
		double userExpenses = 0;
//		prompts player to enter the number of expenses they want to enter
		System.out.println("Please enter the number of expenses you want ot provide.");
		int totalInputs = in.nextInt();
//		loop that will run a number of times equal to totalInputs
		while (numberOfInputs <= totalInputs) {
//			collects the users expenses
			System.out.println("Please provide your expense(s)");
			double userExpensesInput = in.nextDouble();
//			Adds userExpensesInput to userExpenses
			userExpenses += userExpensesInput;
//			increments numberOfInputs
			numberOfInputs += 1;
		}
//		Calculates the average
		double averageExpenses = userExpenses / totalInputs;
//		prints the average expenses
		System.out.printf("Your average expenses are $%.02f", averageExpenses);
	}

}
