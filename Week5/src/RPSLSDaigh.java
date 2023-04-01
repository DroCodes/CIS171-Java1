import java.util.Scanner;

/**  
* Deon Daigh - dmdaigh
* CIS171 23355
* Mar 18, 2023
* MacOS 13.2
*/
public class RPSLSDaigh {
	public static String DetermineWinner(String playerOne, String playerTwo) {
	    String winner = "Tie Game";
	    String playerOneWinningMessage = "Player one wins!";
	    String playerTwoWinningMessage = "Player two wins!";

	    // check each possible input to determine the winner
	    if (!playerOne.equals(playerTwo)) {
	        switch (playerOne) {
	            case "rock":
	                switch (playerTwo) {
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
	                switch (playerTwo) {
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
	                switch (playerTwo) {
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
	                switch (playerTwo) {
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
	                switch (playerTwo) {
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
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
//		input from players
		System.out.println("Player one's turn");
		String playerOne = in.next().toLowerCase();
		System.out.println("Player two's turn");
		String playerTwo = in.next().toLowerCase();
//		prints the results
		System.out.println(DetermineWinner(playerOne, playerTwo));
	}
}
