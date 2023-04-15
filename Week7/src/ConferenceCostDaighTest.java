import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**  
* Deon Daigh - dmdaigh
* CIS171 23355
* Apr 8, 2023
* MacOS 13.2
*/
class ConferenceCostDaighTest {

	@Test
    public void testTier1Day1() {
        int tier = 1;
        int cost = 1;
        assertEquals(100, ConferenceCostDaigh.determineConferenceCost(tier, cost));
    }
    
    @Test
    public void testTier2Day3() {
    	int tier = 2;
        int cost = 3;
        assertEquals(270, ConferenceCostDaigh.determineConferenceCost(tier, cost));
    }
    
    @Test
    public void testTier4Day5() {
    	int tier = 4;
        int cost = 5;
        assertEquals(360, ConferenceCostDaigh.determineConferenceCost(tier, cost));
    }
    
    @Test
    public void testTier0Day1() {
    	int tier = 0;
        int cost = 1;
        assertEquals(0, ConferenceCostDaigh.determineConferenceCost(tier, cost));
    }
    
    @Test
    public void testTier3Day6() {
    	int tier = 3;
        int cost = 6;
        assertEquals(0, ConferenceCostDaigh.determineConferenceCost(tier, cost));
    }


}
