import java.text.DecimalFormat;
import java.util.ArrayList;

import models.Blanket;
import models.ElectricBlanket;

/**  
* Deon Daigh - dmdaigh
* CIS171 23355
* Apr 28, 2023
* MacOS 13.2
*/
public class BlanketTesterDaigh {

	public static void main(String[] args) {
		ArrayList<Blanket> blankets = new ArrayList();
		
		Blanket blanketOne = new Blanket("king", "gold", "cashmere");
		System.out.println(blanketOne.getPrice());
		System.out.println(blanketOne.featureReport());
		blankets.add(blanketOne);
		
		
		ElectricBlanket electricBlanketOne = new ElectricBlanket("king", "red", "cashmere", 5, true);
		System.out.println(electricBlanketOne.getPrice());
		System.out.println(electricBlanketOne.featureReport());
		blankets.add(electricBlanketOne);
		
		Blanket blanketTwo = new Blanket("twin", "black", "wool");
		System.out.println(blanketTwo.getPrice());
		System.out.println(blanketTwo.featureReport());
		blankets.add(blanketTwo);
		
		ElectricBlanket electricBlanketTwo = new ElectricBlanket("queen", "multi-colored", "cotton", 1, false);
		System.out.println(electricBlanketTwo.getPrice());
		System.out.println(electricBlanketTwo.featureReport());
		blankets.add(electricBlanketTwo);
		
        System.out.println("-----Blankets under $100-----");
		 for (Blanket b : blankets) {
	            if (b.getPrice() < 100) {
	                System.out.println(b.featureReport());
	            }
	        }

//		tests bad input to throw exception
//		Blanket blanketTwo = new Blanket("twwin", "blue", "cashmere");
//		System.out.println(blanketTwo.getPrice());
	}

}
