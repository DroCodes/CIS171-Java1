
/**
 * Deon Daigh - dmdaigh 
 * CIS171 23355 Feb 23, 2023 
 * MacOS 13.2
 */
public class WidgetOrderDaigh {

	public static void main(String[] args) {
		final double SALES_TAX = 0.065;
		final double SHIPPING_COST = .2;
		final double PRICE_PER_WIDGET = 8.99;
		int numberOfWidgets = 10;
		double subtotal = numberOfWidgets * PRICE_PER_WIDGET;
		double tax = subtotal * SALES_TAX;
		double shipping = numberOfWidgets * SHIPPING_COST;
		double total = subtotal + tax + shipping;

		System.out.println("Number of widgets purchased: " + numberOfWidgets);
		System.out.println("Subtotal: " + subtotal);
		System.out.println("Tax: " + tax);
		System.out.println("Shipping: " + shipping);
		System.out.println("Total: " + total);

	}

}
