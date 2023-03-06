
/**  
* Deon Daigh - dmdaigh
* CIS171 23355
* Mar 5, 2023
* MacOS 13.2
*/
public class CompoundInterestDaigh {
	public static double computeBalance(double initialDeposit, double interestRate, int numOfYears) {
		double futureValue = initialDeposit * Math.pow( 1 + interestRate, numOfYears);
		return futureValue;
	}

	public static void main(String[] args) {
		System.out.printf("Your total is $%.2f", computeBalance(10000, .045, 13));
		System.out.printf("\nYour total is $%.2f", computeBalance(20000, .03, 15));
		System.out.printf("\nYour total is $%.2f", computeBalance(30000, .01, 20));
	}

}
