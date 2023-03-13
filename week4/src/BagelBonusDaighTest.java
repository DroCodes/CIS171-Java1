import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**  
* Deon Daigh - dmdaigh
* CIS171 23355
* Mar 11, 2023
* MacOS 13.2
*/
class BagelBonusDaighTest {

	@Test
	void TestLessThen20() {
		double percent = 0;
		double userSpent = 0;
		assertEquals(percent, BagelBonusDaigh.discountCoupon(userSpent));
	}
	
	@Test
	void TestMinRange() {
		double percent = .05;
		double userSpent = 20;
		assertEquals(percent, BagelBonusDaigh.discountCoupon(userSpent));
	}
	
	@Test
	void TestLowRange() {
		double percent = .05;
		double userSpent = 35;
		assertEquals(percent, BagelBonusDaigh.discountCoupon(userSpent));
	}
	
	@Test
	void TestMediumRange() {
		double percent = .07;
		double userSpent = 75;
		assertEquals(percent, BagelBonusDaigh.discountCoupon(userSpent));
	}
	
	@Test
	void TestHighRange() {
		double percent = .09;
		double userSpent = 150;
		assertEquals(percent, BagelBonusDaigh.discountCoupon(userSpent));
	}
	
	@Test
	void TestMaxRange() {
		double percent = .12;
		double userSpent = 150.01;
		assertEquals(percent, BagelBonusDaigh.discountCoupon(userSpent));
	}
	
	@Test
	void TestMinFreeCoffee() {
		double freeCoffee = 0;
		double userSpent = 0;
		assertEquals(freeCoffee, BagelBonusDaigh.coffeeRewards(userSpent));
	}

	@Test
	void TestLowFreeCoffee() {
		double freeCoffee = 1;
		double userSpent = 25;
		assertEquals(freeCoffee, BagelBonusDaigh.coffeeRewards(userSpent));
	}
	
	@Test
	void TestMediumFreeCoffee() {
		double freeCoffee = 2;
		double userSpent = 100;
		assertEquals(freeCoffee, BagelBonusDaigh.coffeeRewards(userSpent));
	}
	
	@Test
	void TesthighFreeCoffee() {
		double freeCoffee = 3;
		double userSpent = 100.01;
		assertEquals(freeCoffee, BagelBonusDaigh.coffeeRewards(userSpent));
	}
	
}
