
/**  
* Deon Daigh - dmdaigh
* CIS171 23355
* Mar 11, 2023
* MacOS 13.2
*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class BagelBonusDaigh {
	
	public static double discountCoupon(double amountSpent) {
		final int PURCHASE_UNDER_20 = 0;
		final int MIN_PURCHASE_RANGE = 20;
		final int LOW_PURCHASE_RANGE = 35;
		final int HIGH_PURCHASE_RANGE = 75;
		final int MAX_PURCHASE_RANGE = 150;
		final double LOW_PERCENT = .05;
		final double MIDDLE_PERCENT = .07;
		final double HIGH_PERCENT = .09;
		final double MAX_PERCENT = .12;
		
		if(amountSpent < MIN_PURCHASE_RANGE) {
			return PURCHASE_UNDER_20;
		} else if(amountSpent <= LOW_PURCHASE_RANGE) {
			return LOW_PERCENT;
		} else if(amountSpent <= HIGH_PURCHASE_RANGE) {
			return MIDDLE_PERCENT;
		} else if(amountSpent <= MAX_PURCHASE_RANGE) {
			return HIGH_PERCENT;
		}
		
		return MAX_PERCENT;
	}
	
	public static int coffeeRewards(double amountSpent) {
		final int LOW_PURCHASE_RANGE = 25;
		final int MIDDLE_PURCHASE_RANGE = 50;
		final int HIGHT_PURCHASE_RANGE = 100;
		
		
		if(amountSpent < LOW_PURCHASE_RANGE) {
			return 0;
		} else if(amountSpent <= MIDDLE_PURCHASE_RANGE) {
			return 1;
		} else if(amountSpent <= HIGHT_PURCHASE_RANGE) {
			return 2;
		}
		
		return 3;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat(".00");
		
//		gets user input
		System.out.println("Please enter the amount spent this month");
		double amountUserSpent = in.nextDouble();
		
		double couponDiscount = discountCoupon(amountUserSpent);
		double convertToPercent = couponDiscount * 100;
		int freeCoffee = coffeeRewards(amountUserSpent);
		
		System.out.println("Your discount is $" + df.format(amountUserSpent * couponDiscount) + "(" + (int) convertToPercent + "% of your previous months purchases");
		System.out.println("You have " + freeCoffee + " free coffee availiable");

	}

}
