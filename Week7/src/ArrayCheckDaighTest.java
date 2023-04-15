import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**  
* Deon Daigh - dmdaigh
* CIS171 23355
* Apr 8, 2023
* MacOS 13.2
*/
class ArrayCheckDaighTest {

	@Test
	void TestHighestNum() {
		int[] array = {5, 6, 3, 5, 3};
		int expected = 6;
		
		assertEquals(expected, ArrayCheckDaigh.HighestElement(array));
	}
	
	@Test
	void TestLowestNum() {
		int[] array = {44, 13, 72, 5, 56};
		int expected = 5;
		
		assertEquals(expected, ArrayCheckDaigh.LowestElement(array));
	}

}
