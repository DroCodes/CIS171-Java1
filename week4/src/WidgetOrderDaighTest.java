import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**  
* Deon Daigh - dmdaigh
* CIS171 23355
* Mar 9, 2023
* MacOS 13.2
*/
class WidgetOrderDaighTest {

	@Test
	void testWidgetOne() {
		double delta = .01;
		assertEquals(48.87, WidgetOrderDaigh.totalPriceOfWidgets(5), delta);
	}

	@Test
	void testWidgetTwo() {
		double delta = .01;
		assertEquals(78.19, WidgetOrderDaigh.totalPriceOfWidgets(8), delta);
	}
	
	@Test
	void testWidgetThree() {
		double delta = .01;
		assertEquals(195.49, WidgetOrderDaigh.totalPriceOfWidgets(20), delta);
	}
}
