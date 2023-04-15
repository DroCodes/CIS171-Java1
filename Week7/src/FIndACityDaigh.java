import java.util.InputMismatchException;
import java.util.Scanner;

/**  
* Deon Daigh - dmdaigh
* CIS171 23355
* Apr 9, 2023
* MacOS 13.2
*/
public class FIndACityDaigh {

	public static void main(String[] args) {
        String[] cities = {"New York", "Los Angeles", "Chicago", "Houston", "Phoenix", "Philadelphia", "San Antonio", "San Diego", "Dallas", "San Jose"};
        Scanner scanner = new Scanner(System.in);

        try {
//        	gets user input
            System.out.print("Enter a number between 1 and 10 to find a city: ");
            int index = scanner.nextInt();
//            prints result
            System.out.println("The city at position " + index + " is " + cities[index - 1]);
//       catch block that catches out of bounds exceptions
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of range. Please enter a number between 1 and 10.");
//            catch block that catches the wrong kind of input
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter a number between 1 and 10.");
        }
    }

}
