package model;

/**  
* Deon Daigh - dmdaigh
* CIS171 23355
* Apr 20, 2023
* MacOS 13.2
*/
public class CurrancyConverter {
	private double usDollars;
	private double euros;
	private double brittishPounds;
	private final double USD_TO_EUROS_RATE = .91403;
	private final double USD_TO_GBP_RATE = .80240;
	
	public CurrancyConverter() {
		super();
	}
	
	public CurrancyConverter(double usDollars) {
		super();
		this.usDollars = usDollars;
		
		doConversion();
	}

	/**
	 * @return the usDollars
	 */
	public double getUsDollars() {
		return usDollars;
	}

	/**
	 * @param usDollars the usDollars to set
	 */
	public void setUsDollars(double usDollars) {
		this.usDollars = usDollars;
	}

	/**
	 * @return the euros
	 */
	public double getEuros() {
		return euros;
	}

	/**
	 * @param euros the euros to set
	 */
	public void setEuros(double euros) {
		this.euros = euros;
	}

	/**
	 * @return the brittishPounds
	 */
	public double getBrittishPounds() {
		return brittishPounds;
	}

	/**
	 * @param brittishPounds the brittishPounds to set
	 */
	public void setBrittishPounds(double brittishPounds) {
		this.brittishPounds = brittishPounds;
	}

	public void doConversion() {
		this.euros = this.usDollars * USD_TO_EUROS_RATE;
		this.brittishPounds = this.usDollars * USD_TO_GBP_RATE;
	}
	
}
