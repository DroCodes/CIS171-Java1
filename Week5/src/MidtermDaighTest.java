import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**  
* Deon Daigh - dmdaigh
* CIS171 23355
* Mar 25, 2023
* MacOS 13.2
*/
class MidtermDaighTest {

	@Test
	void CalculateTofahrenheitTest() {
		String conversionType = "f";
		double tempInCelsius = 100;
		double expected = 212;
		
		assertEquals(expected, MidtermDaigh.CalculateTemp(conversionType, tempInCelsius));
	}
	
	@Test
	void CalculateCelsiustest() {
		String conversionType = "c";
		double tempInCelsius = 212;
		double expected = 100;
		
		assertEquals(expected, MidtermDaigh.CalculateTemp(conversionType, tempInCelsius));
	}
	
	@Test
	void badConversionTypetest() {
		String conversionType = "d";
		double tempInCelsius = 212;
		double expected = 0;
		
		assertEquals(expected, MidtermDaigh.CalculateTemp(conversionType, tempInCelsius));
	}

}
