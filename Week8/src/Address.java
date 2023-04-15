
/**  
* Deon Daigh - dmdaigh
* CIS171 23355
* Apr 15, 2023
* MacOS 13.2
*/
public class Address {
	private String address;
	private String address2;
	private String city;
	private String state;
	private String postalCode;
	
	public Address() {}
	
	public Address(String address, String address2, String city, String state, String postalCode) {
		setAddress(address);
		setAddress2(address2);
		setCity(city);
		setState(state);
		setPostalCode(postalCode);
	}
	
	public Address(String address, String city, String state, String postalCode) {
		setAddress(address);
		setCity(city);
		setState(state);
		setPostalCode(postalCode);
	}
	
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the address2
	 */
	public String getAddress2() {
		return address2;
	}
	/**
	 * @param address2 the address2 to set
	 */
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}
	/**
	 * @param postalCode the postalCode to set
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	public String print() {
//		assigns address to printAddress, if getAddress2 is not null then address2 gets appended to printAddress
	    String printAddress = getAddress();
	    if (getAddress2() != null) {
	        printAddress += " " + getAddress2();
	    }
//	    appends the rest of the string after determining if address2 is null or not
	    printAddress += " " + getCity() + ", " + getState() + " " + getPostalCode();
	    return printAddress;
	}

	
}
