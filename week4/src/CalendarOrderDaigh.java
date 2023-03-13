/**  
* Deon Daigh - dmdaigh
* CIS171 23355
* Mar 9, 2023
* MacOS 13.2
*/
public class CalendarOrderDaigh {
	
	public static double ComputeOrderTotal(double price) {
//		variables
		final double SALES_TAX = 0.07;
		
//		multiplies price by the sales tax then adds the price
		return price + (price * SALES_TAX);
	}
	
	public static double ComputeOrderTotal(double price, int quantity) {
//		variables
		final double SALES_TAX = 0.07;
		double subtotal = price * quantity;
		
//		multiplies the sales tax by the subtotal then adds the subtotal
		return subtotal + (subtotal * SALES_TAX);
	}

	public static double ComputeOrderTotal(double price, int quantity, double couponValue) {
//		variables
		final double SALES_TAX = 0.07;
		double subtotal = price * quantity;
		double discountTotal = subtotal - (subtotal * couponValue);
		
//		multiplies the sales tax by the discounted price then adds the discounted price
		return discountTotal + (discountTotal * SALES_TAX);
	}

	public static void main(String[] args) {
		System.out.printf("%.2f", ComputeOrderTotal(11.99)); // method 1
		System.out.printf("\n%.2f", ComputeOrderTotal(11.99, 3)); // method 2
		System.out.printf("\n%.2f",ComputeOrderTotal(11.99, 3, .1)); // method 3
	}

}
