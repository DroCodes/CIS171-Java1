
/**  
* Deon Daigh - dmdaigh
* CIS171 23355
* Apr 19, 2023
* MacOS 13.2
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TicketManager ticketManager = new TicketManager(28, 0, 0);
        
        System.out.println("Welcome to the ticket booth!");
        
        while (ticketManager.getRemainingTickets() > 0) {
            System.out.println("There are " + ticketManager.getRemainingTickets() + " tickets remaining.");
            System.out.println("How many tickets would you like to purchase? (maximum of 4)");
            int numTickets = scanner.nextInt();
            
            if (!ticketManager.isValidNumTickets(numTickets)) {
                System.out.println("Invalid number of tickets. Please enter a number between 1 and 4.");
                continue;
            }
            
            if (!ticketManager.isEnoughTicketsRemaining(numTickets)) {
                System.out.println("There are not enough tickets remaining to fulfill your request. Please try again.");
                continue;
            }
            
            if (!ticketManager.sellTickets(numTickets)) {
                System.out.println("Sorry, we could not process your purchase. Please try again.");
                continue;
            }
            
            System.out.println("Thank you for your purchase!");
        }
        
        System.out.println("All tickets have been sold out.");
    }
}

