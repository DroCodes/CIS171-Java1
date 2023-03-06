
/**
 * Deon Daigh - dmdaigh 
 * CIS171 23355 
 * March 05, 2023 
 * MacOS 13.2
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class WidgetOrderDaigh {
	public static double totalPriceOfWidgets(int numOfWidgets) {
//		constants
		final double SALES_TAX = 0.065;
		final double SHIPPING_COST = .2;
		final double PRICE_PER_WIDGET = 8.99;
		
		double subtotal = numOfWidgets * PRICE_PER_WIDGET;
		double tax = subtotal * SALES_TAX;
		double shipping = numOfWidgets * SHIPPING_COST;
		double total = subtotal + tax + shipping;
		
		return total;
	}

	public static void main(String[] args) {
//		initialized the scanner
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the number of widgets");
//		takes in user input
		int numberOfWidgets = in.nextInt();
		
		double total = totalPriceOfWidgets(numberOfWidgets);
		
		
//		initialized DecimalFormat
		DecimalFormat df = new DecimalFormat(".00");

//		formats and prints the totals
//		System.out.println("Number of widgets purchased: " + numberOfWidgets);
//		System.out.println("Subtotal: $" + df.format(subtotal));
//		System.out.println("Tax: $" + df.format(tax));
//		System.out.println("Shipping: $" + df.format(shipping));
		System.out.println("-------------------------------");
		System.out.println("Total: $" + df.format(total));
		
//		closes the scanner
		in.close();
	}

}
