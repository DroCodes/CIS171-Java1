package models;

import java.text.DecimalFormat;

/**  
* Deon Daigh - dmdaigh
* CIS171 23355
* Apr 28, 2023
* MacOS 13.2
*/
public class Blanket {
	private String size;
	private String color;
	private String material;
	protected double price;
	
	public Blanket() {
		setSize("twin");
		setColor("blue");
		setMaterial("wool");
	}
	
	public Blanket(String size, String color, String material) {
		super();
		setSize(size);
		setColor(color);
		setMaterial(material);
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
//		prices per size
		double costOfQueen = 25;
		double costOfKing = 40;
		double basePrice = 15;
//		checks the sizes are valid
		if(!size.equals("twin") && !size.equals("queen") && !size.equals("king")) {
			throw new IllegalArgumentException("Invalid size");
		}
//		assigns price based on size
		if(size.equals("queen")) {
			this.price += basePrice + costOfQueen;
			this.size = size;
		} else if(size.equals("king")) {
			this.price += basePrice + costOfKing;
			this.size = size;
		} else {
			this.price += basePrice;
			this.size = size;
		}
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * @return the material
	 */
	public String getMaterial() {
		return material;
	}
	/**
	 * @param material the material to set
	 */
	public void setMaterial(String material) {
//		sizes per material
		double costOfWool = 20;
		double costOfChenille = 30;
		double costOfCashmere = 45;
//		assigns prices based on material
		if(material.equals("wool")) {
			this.price += costOfWool;
		} else if(material.equals("chenille")) {
			this.price += costOfChenille;
		} else if(material.equals("cashmere")) {
			this.price += costOfCashmere;
		}
		this.material = material;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	
	public String featureReport() {
		DecimalFormat df = new DecimalFormat(".00");
		
		return color + " " + size + " blanket made from " + material + ", total price $" + df.format(price);
	}
}
