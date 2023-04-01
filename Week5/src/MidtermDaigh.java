
/**  
* Deon Daigh - dmdaigh
* CIS171 23355
* Mar 25, 2023
* MacOS 13.2
*/
import java.util.Scanner;
public class MidtermDaigh {
	/*	Method that takes in a String conversion type and a double temp then converts the temp
	 * to fahrenheit or celsius depending on the conversion type the user input. the temp is
	 * then returned by the method as a double.*/
	public static double CalculateTemp(String conversionType, double temp) {
//		calculations for converting weather
		double fahrenheitToCelsius = (temp - 32) * 5/9;
		double celsiusToFahrenheit = (temp * 9/5) + 32;
		if(conversionType.equals("c")) {
//			convert to celsius
			return fahrenheitToCelsius;
		} else if (conversionType.equals("f")) {
//			convert to fahrenheit
			return celsiusToFahrenheit;
		}
		
		return 0;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Boolean stopLoop = false;
		
//		loop to gather input
		while (!stopLoop) {
//			gets user input
			System.out.println("Do you want to conver to (C) or (F)? If you are finished type stop");
			String conversionInput = in.next().toLowerCase();
			
//			checks to see if conversionInput != done
			if(!conversionInput.equals("stop")) {
//				prompts user to enter the temp.
				System.out.println("Enter the temperature you would like to convert");
				double temp = in.nextDouble();
//				calls the method to calculate the temp
				double convert = CalculateTemp(conversionInput, temp);
				if(convert == 0) {
					System.out.println("please enter c for celsius or f for fahrenheit");
				} else {
					System.out.printf("The temperature is %.2f Degrees\n", convert);
				}
			} else {
//				if the user entered "stop" the stopLoop is set to true and the loop will end
				stopLoop = true;
				System.out.println("Calculations completed");
			}
		}
	}
}
