
/**  
* Deon Daigh - dmdaigh
* CIS171 23355
* Apr 15, 2023
* MacOS 13.2
*/
public class Pizza {
	private String toppings;
	private String size;
	private double price;
	
	public Pizza() {
		setToppings("cheese");
		setSize("large");
		setPrice(9.99);
	}
	
	public Pizza(String toppings, String size, double price) {
		setToppings(toppings);
		setSize(size);
		setPrice(price);
	}
	/**
	 * @return the toppings
	 */
	public String getToppings() {
		return toppings;
	}
	/**
	 * @param toppings the toppings to set
	 */
	public void setToppings(String toppings) {
		this.toppings = toppings;
	}
	/**
	 * @return the size
	 */
	public String getSize() {
		return size;
	}
	/**
	 * @param size the size to set
	 */
	public void setSize(String size) {
		this.size = size;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String repeatOrder() {
		String order = "You ordered a " + getSize() + " " + getToppings() + " Pizza for " + getPrice();
		
		return order;
	}
}
