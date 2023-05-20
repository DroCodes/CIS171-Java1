package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Models.TempConversion;

/**  
* Deon Daigh - dmdaigh
* CIS171 23355
* Apr 25, 2023
* MacOS 13.2
*/
class TempConversionTest {

	@Test
	void TestConversionToFahrenheit() {
		TempConversion newConversion = new TempConversion();
		
		double temp = 0;
		double expected = 32;
		
		assertEquals(expected, newConversion.convertToFahrenheit(temp));
	}
	
	@Test
	void TestConversionToFahrenheit2() {
		TempConversion newConversion = new TempConversion();
		
		double temp = 100;
		double expected = 212;
		
		assertEquals(expected, newConversion.convertToFahrenheit(temp));
	}
	
	@Test
	void TestConversionToCelsius() {
		TempConversion newConversion = new TempConversion();
		
		double temp = 32;
		double expected = 0;
		
		assertEquals(expected, newConversion.convertToCelsius(temp));
	}
	
	@Test
	void TestConversionToCelsius2() {
		TempConversion newConversion = new TempConversion();
		
		double temp = 212;
		double expected = 100;
		
		assertEquals(expected, newConversion.convertToCelsius(temp));
	}

}
