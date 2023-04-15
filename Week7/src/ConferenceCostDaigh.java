import java.util.Scanner;

/**  
* Deon Daigh - dmdaigh
* CIS171 23355
* Apr 8, 2023
* MacOS 13.2
*/
public class ConferenceCostDaigh {
	
	public static int determineConferenceCost(int tier, int days) {
		int cost = 0;
		int[][] conferenceCost = {
				{100, 190, 270, 340, 400},
				{100, 190, 	270, 340, 400},
				{85, 160, 240, 310, 370},
				{75, 150, 230, 300, 360}
		};
//				loops through the 2d array to find the element that corresponds with tier and days. adds one to the i and j vars when checking agains the tier and days to account for the array's index starting at zero and the lowest option for tier and days is 1.
		for (int i = 0; i < conferenceCost.length; i++) {
	        if (tier == i + 1) {
	            for (int j = 0; j < conferenceCost[i].length; j++) {
	                if (days == j + 1) {
	                    cost = conferenceCost[i][j];
	                    break;
	                }
	            }
	            break;
	        }
	    }
		return cost;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sentinel = 999;
		boolean continueLoop = true;
		
		while(continueLoop) {
//			collect user input
			System.out.println("Please enter the number of days you are attending (1-5)");
			System.out.println("If you would like to stop please enter 999");
			int userInputForDays = in.nextInt();
//			checks if sentinel value was used
			if(userInputForDays == 999) {
				continueLoop = false;
				break;
			}
			System.out.println("Please enter the tier you would like (1-4)");
			int userInputForTier = in.nextInt();
			
//			Returns cost to user
			int cost = determineConferenceCost(userInputForTier, userInputForDays);
			System.out.println("The cost for attending the conference is $" + cost );
		}
		
		};
	}
