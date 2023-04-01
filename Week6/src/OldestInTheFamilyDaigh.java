
/**  
* Deon Daigh - dmdaigh
* CIS171 23355
* Apr 1, 2023
* MacOS 13.2
*/
import java.util.Scanner;
public class OldestInTheFamilyDaigh {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		tracks the total age
		double totalAge = 0;
//		gets user input for how many times the loop runs
		 System.out.println("How many ages do you want to add?");
		 int numberOfUserAges = in.nextInt();
//		 tracks the number of loops
		 int numberOfLoops = 0;
//		 tracks the last age that was input to compare and see which is bigger
		 int lastAge = 0;
//		 tracks the oldest family member to be printed as the program ends
		 String oldestFamilyMember = "";
		 
//		 Loop to collect names and ages
		 while(numberOfLoops < numberOfUserAges) {
//			 gets family members name
			 System.out.println("Enter a family members name");
			 String familyName = in.next();
//			 gets family members age
			 System.out.println("Enter " + familyName + "'s age");
			 int userAgeInput = in.nextInt();
			 
//			 ads userAgeInput to total age
			 totalAge += userAgeInput;
//			 checks if age input is greater then lastAge
			 if(userAgeInput > lastAge) {
				 oldestFamilyMember = familyName;
			 }
//			 sets last age to userAgeInput so it can be checked the next run through the loop
			 lastAge = userAgeInput;
//			 increments number of loops
			 numberOfLoops++;
		 }
//		 calculates the average
		 double averageAge = totalAge / (numberOfLoops);
//		 prints the results
		 System.out.println("The average age is " + averageAge);
		 System.out.println("The oldest person is " + oldestFamilyMember);
		 
	}

}
