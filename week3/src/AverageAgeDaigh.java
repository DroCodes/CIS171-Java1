
/**  
* Deon Daigh - dmdaigh
* CIS171 23355
* March 05, 2023
* MacOS 13.2
*/

import java.util.Scanner;

public class AverageAgeDaigh {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int totalAges = 4;
		
		System.out.println("Enter the age for Deon: ");
		int deonsAge = in.nextInt();
		
		System.out.println("Enter the age for Anthony: ");
		int anthonysAge = in.nextInt();;
		
		System.out.println("Enter the age for Oliver: ");
		int oliversAge = in.nextInt();;
		
		System.out.println("Enter the age for Rissa: ");
		int rissasAge = in.nextInt();;
		
		double averageAge = (double)(deonsAge + anthonysAge + oliversAge + rissasAge) / totalAges;
		
		System.out.println("The average age is: " + averageAge + " years old");
		
		in.close();
	}

}
