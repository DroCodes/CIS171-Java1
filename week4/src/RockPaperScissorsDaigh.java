

/**  
* Deon Daigh - dmdaigh
* CIS171 23355
* Mar 12, 2023
* MacOS 13.2
*/

import java.util.Scanner;

public class RockPaperScissorsDaigh {
	
	public static String DetermineWinner(String playerOne, String playerTwo) {
		String winner = "Tie Game";
		String playerOneWinningMessage = "Player one wins!";
		String playerTwoWinningMessage = "Player two wins!";
		
//		checks each possible input to determine winner
		if(playerOne != playerTwo) {
			if (playerOne.equals("rock")) {
			    if (playerTwo.equals("scissors")) {
			        winner = playerOneWinningMessage;
			    } else {
			    	winner = playerTwoWinningMessage;
			    }
			} else if(playerOne.equals("scissors")) {
				if(playerTwo.equals("paper")) {
					winner = playerOneWinningMessage;
				} else {
					winner = playerTwoWinningMessage;
				}
			} else if(playerOne.equals("paper")) {
				if(playerTwo.equals("rock")) {
					winner = playerOneWinningMessage;
				} else {
					winner = playerTwoWinningMessage;
				}
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
