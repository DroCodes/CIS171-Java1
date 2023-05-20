package Models;

/**  
* Deon Daigh - dmdaigh
* CIS171 23355
* Apr 25, 2023
* MacOS 13.2
*/
public class TempConversion {
//	constructor
	public TempConversion() {}

	//	method to convert Fahrenheit to Celsius
	public double convertToFahrenheit(double temp) {
		double celsiusToFahrenheit = (temp * 9/5) + 32;
		return celsiusToFahrenheit;
	}
	
//	method to convert Celsius to Fahrenheit
	public double convertToCelsius(double temp) {
		double fahrenheitToCelsius = (temp - 32) * 5/9;
		return fahrenheitToCelsius;
	}
}
