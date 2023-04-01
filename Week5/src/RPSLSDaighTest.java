import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**  
* Deon Daigh - dmdaigh
* CIS171 23355
* Mar 18, 2023
* MacOS 13.2
*/
class RPSLSDaighTest {

	@Test
	void TestTie() {
		String playerOne = "rock";
		String playerTwo = "rock";
		String expected = "Tie Game";
		assertEquals(expected, RPSLSDaigh.DetermineWinner(playerOne, playerTwo));
	}
	
	@Test
	void TestPlayerOneWinsWithScissors() {
		String playerOne = "scissors";
		String playerTwo = "paper";
		String expected = "Player one wins!";
		assertEquals(expected, RPSLSDaigh.DetermineWinner(playerOne, playerTwo));
	}
	
	@Test
	void TestPlayerOneWinsWithRock() {
		String playerOne = "rock";
		String playerTwo = "scissors";
		String expected = "Player one wins!";
		assertEquals(expected, RPSLSDaigh.DetermineWinner(playerOne, playerTwo));
	}
	
	@Test
	void TestPlayerOneWinsWithPaper() {
		String playerOne = "paper";
		String playerTwo = "rock";
		String expected = "Player one wins!";
		assertEquals(expected, RPSLSDaigh.DetermineWinner(playerOne, playerTwo));
	}
	
	@Test
	void TestPlayerOneWinsWithSpock() {
	    String playerOne = "spock";
	    String playerTwo = "rock";
	    String expected = "Player one wins!";
	    assertEquals(expected, RPSLSDaigh.DetermineWinner(playerOne, playerTwo));
	}
	
	@Test
	void TestPlayerOneWinsWithLizard() {
	    String playerOne = "lizard";
	    String playerTwo = "paper";
	    String expected = "Player one wins!";
	    assertEquals(expected, RPSLSDaigh.DetermineWinner(playerOne, playerTwo));
	}
	
	@Test
	void TestPlayerTwoWinsWithScissors() {
		String playerOne = "paper";
		String playerTwo = "scissors";
		String expected = "Player two wins!";
		assertEquals(expected, RPSLSDaigh.DetermineWinner(playerOne, playerTwo));
	}
	
	@Test
	void TestPlayerTwoWinsWithRock() {
		String playerOne = "scissors";
		String playerTwo = "rock";
		String expected = "Player two wins!";
		assertEquals(expected, RPSLSDaigh.DetermineWinner(playerOne, playerTwo));
	}
	
	@Test
	void TestPlayerTwoWinsWithPaper() {
		String playerOne = "rock";
		String playerTwo = "paper";
		String expected = "Player two wins!";
		assertEquals(expected, RPSLSDaigh.DetermineWinner(playerOne, playerTwo));
	}
	
	void TestPlayerTwoWinsWithSpock() {
	    String playerOne = "rock";
	    String playerTwo = "spock";
	    String expected = "Player two wins!";
	    assertEquals(expected, RPSLSDaigh.DetermineWinner(playerOne, playerTwo));
	}
	
	@Test
	void TestPlayerTwoWinsWithLizard() {
	    String playerOne = "paper";
	    String playerTwo = "lizard";
	    String expected = "Player two wins!";
	    assertEquals(expected, RPSLSDaigh.DetermineWinner(playerOne, playerTwo));
	}


}
