import java.util.Random;

/**  
* Deon Daigh - dmdaigh
* CIS171 23355
* Apr 8, 2023
* MacOS 13.2
*/
public class ArrayCheckDaigh {
//	returns highest element in array
	public static int HighestElement(int[] array)
	{
		int highestElement = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] > highestElement) {
				highestElement = array[i];
			}
		}
		return highestElement;
	}
//	returns lowest element in array
	public static int LowestElement(int[] array)
	{
		
		int lowestElement = 100;
		for(int i = 0; i < array.length; i++) {
			if(array[i] < lowestElement) {
				lowestElement = array[i];
			}
		}
		return lowestElement;
	}

	public static void main(String[] args) {
		Random random = new Random();
		int maxRandom = 100;
		int minRandom = 1;
		int firstElement = 0;
		int[] numArray = new int[5];
//		loops through and adds numbers to numArray then prints those numbers to the console.
		for(int i = 0; i < numArray.length; i++) {
			numArray[i] = random.nextInt(maxRandom) + minRandom;
		}
		
		for (int num : numArray) {
			System.out.println(num);
		}
		
		System.out.println("======");
//		prints array in reverse order
		for(int i = numArray.length - 1; i >= 0; i--) {
			System.out.println(numArray[i]);
		}
		
		System.out.println("======");
//		prints the first element
		System.out.println(numArray[firstElement]);
		
		System.out.println("======");
//		prints the last element
		System.out.println(numArray[numArray.length - 1]);
		
		System.out.println("======");
//		prints even elements
		for(int i = 0; i < numArray.length; i++) {
			if(numArray[i]% 2 == 0) {
				System.out.println(numArray[i]);
			}
		}
		
		System.out.println("======");
//		prints the odd elements
		for(int i = 0; i < numArray.length; i++) {
			if(numArray[i]% 2 != 0) {
				System.out.println(numArray[i]);
			}
		}
//		method calls
		System.out.println("Highest element: " + HighestElement(numArray));
		System.out.println("Lowest element: " + LowestElement(numArray));
		
	}

}
