import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**  
* Deon Daigh - dmdaigh
* CIS171 23355
* Mar 18, 2023
* MacOS 13.2
*/
class MileageRatingDaighTest {

	@Test
	void TestExcellentMileage() {
		double mileage = 40;
		String expected = "Excellent";
		assertEquals(expected, MileageRatingDaigh.CalculateMileage(mileage));
	}
	
	@Test
	void TestGoodMileage() {
		double mileage = 30;
		String expected = "Good";
		assertEquals(expected, MileageRatingDaigh.CalculateMileage(mileage));
	}
	
	@Test
	void TestFairMileage() {
		double mileage = 20;
		String expected = "Fair";
		assertEquals(expected, MileageRatingDaigh.CalculateMileage(mileage));
	}
	
	@Test
	void TestPoorMileage() {
		double mileage = 0;
		String expected = "Poor";
		assertEquals(expected, MileageRatingDaigh.CalculateMileage(mileage));
	}

}
