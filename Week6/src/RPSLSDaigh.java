
/**  
* Deon Daigh - dmdaigh
* CIS171 23355
* Apr 1, 2023
* MacOS 13.2
*/
import java.util.Random;
import java.util.Scanner;

public class RPSLSDaigh {
	
	public static String DetermineWinner(String playerOne, String playerTwo) {
		String playerOneMakeLowerCase = playerOne.toLowerCase();
		String playerTwoMakeLowerCase = playerTwo.toLowerCase();
	    String winner = "Tie Game";
	    String playerOneWinningMessage = "Player one wins!";
	    String playerTwoWinningMessage = "Player two wins!";

	    // check each possible input to determine the winner
	    if (!playerOneMakeLowerCase.equals(playerTwoMakeLowerCase)) {
	        switch (playerOneMakeLowerCase) {
	            case "rock":
	                switch (playerTwoMakeLowerCase) {
	                    case "scissors":
	                    case "lizard":
	                        winner = playerOneWinningMessage;
	                        break;
	                    default:
	                        winner = playerTwoWinningMessage;
	                        break;
	                }
	                break;
	            case "paper":
	                switch (playerTwoMakeLowerCase) {
	                    case "rock":
	                    case "spock":
	                        winner = playerOneWinningMessage;
	                        break;
	                    default:
	                        winner = playerTwoWinningMessage;
	                        break;
	                }
	                break;
	            case "scissors":
	                switch (playerTwoMakeLowerCase) {
	                    case "paper":
	                    case "lizard":
	                        winner = playerOneWinningMessage;
	                        break;
	                    default:
	                        winner = playerTwoWinningMessage;
	                        break;
	                }
	                break;
	            case "lizard":
	                switch (playerTwoMakeLowerCase) {
	                    case "paper":
	                    case "spock":
	                        winner = playerOneWinningMessage;
	                        break;
	                    default:
	                        winner = playerTwoWinningMessage;
	                        break;
	                }
	                break;
	            case "spock":
	                switch (playerTwoMakeLowerCase) {
	                    case "rock":
	                    case "scissors":
	                        winner = playerOneWinningMessage;
	                        break;
	                    default:
	                        winner = playerTwoWinningMessage;
	                        break;
	                }
	                break;
	        }
	    }

	    return winner;
	}
	
	public static String GetRandomSelection() {
//		creates instance of Random Class
		Random random = new Random();
//		Array with the choices for the game
		String[] choices = {"rock", "paper", "scissors", "lizard", "spock"};
//		selects one of the choices at random
		int selection = random.nextInt(choices.length);
		return choices[selection]; // returns the selected choice
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String sentinelValue = "";
		
		while (!sentinelValue.equals("done")) {

			// input from player one
			System.out.println("Player one's turn");
			String playerOne = in.next();
			
			// check if player one wants to end the game
			if (playerOne.equals("done")) {
				sentinelValue = "done";
				System.out.println("The game has ended");
				break;
			}
			
			// get random selection for player two
			String playerTwo = GetRandomSelection();
			
			// prints the results
			System.out.println("Player two chose " + playerTwo);
			System.out.println(DetermineWinner(playerOne, playerTwo));
		}
		
		in.close();
	}
}

