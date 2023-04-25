
/**  
* Deon Daigh - dmdaigh
* CIS171 23355
* Apr 15, 2023
* MacOS 13.2
*/
public class PizzaTesterDaigh {

	public static void main(String[] args) {
		Pizza myPizza = new Pizza();
		Pizza yourPizza = new Pizza("pineaple", "extra large", 13.50);
		
		myPizza.setPrice(12.50);
		myPizza.setToppings("mushroom");
		
		String printMyOrder = myPizza.repeatOrder();
		String printYourOrder = yourPizza.repeatOrder();
		
		System.out.println(printMyOrder);
		System.out.println(printYourOrder);
		
		yourPizza.getOvenTemperature();
		System.out.println(yourPizza.prepareIngredients());
		System.out.println("Ready for the Oven: " + yourPizza.readyForOven());
	}

}
