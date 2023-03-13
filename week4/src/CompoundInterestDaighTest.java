import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**  
* Deon Daigh - dmdaigh
* CIS171 23355
* Mar 9, 2023
* MacOS 13.2
*/
class CompoundInterestDaighTest {

	@Test
	void testCompoundInterestOne() {
		double expected = 17721.96;
		double delta = .01;
		
		int initialDeposit = 10000;
		double interestRate = .045;
		int numOfYears = 13;
		
		
		assertEquals(expected, CompoundInterestDaigh.computeBalance(initialDeposit, interestRate, numOfYears), delta);
	}
	
	@Test
	void testCompoundInterestTwo() {
		double expected = 31159.35;
		double delta = .01;
		
		int initialDeposit = 20000;
		double interestRate = .03;
		int numOfYears = 15;
		
		
		assertEquals(expected, CompoundInterestDaigh.computeBalance(initialDeposit, interestRate, numOfYears), delta);
	}
	
	@Test
	void testCompoundInterestThree() {
		double expected = 36605.70;
		double delta = .01;
		
		int initialDeposit = 30000;
		double interestRate = .01;
		int numOfYears = 20;
		
		
		assertEquals(expected, CompoundInterestDaigh.computeBalance(initialDeposit, interestRate, numOfYears), delta);
	}

}
