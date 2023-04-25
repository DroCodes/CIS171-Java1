
/**  
* Deon Daigh - dmdaigh
* CIS171 23355
* Apr 19, 2023
* MacOS 13.2
*/
public class TicketManager {
	private int remainingTickets;
	private int numberOfBuyers;
	private int totalTicketsSold;
	
	public TicketManager() {}
	
	public TicketManager(int remainingTickets, int numberOfBuyers, int totalTicketsSold) {
		setRemainingTickets(remainingTickets);
		setNumberOfBuyers(numberOfBuyers);
		setTotalTicketsSold(totalTicketsSold);
	}
	
	/**
	 * @return the remainingTickets
	 */
	public int getRemainingTickets() {
		return remainingTickets;
	}

	/**
	 * @param remainingTickets the remainingTickets to set
	 */
	public void setRemainingTickets(int remainingTickets) {
		this.remainingTickets = remainingTickets;
	}

	/**
	 * @return the numberOfBuyers
	 */
	public int getNumberOfBuyers() {
		return numberOfBuyers;
	}

	/**
	 * @param numberOfBuyers the numberOfBuyers to set
	 */
	public void setNumberOfBuyers(int numberOfBuyers) {
		this.numberOfBuyers = numberOfBuyers;
	}

	/**
	 * @return the totalTicketsSold
	 */
	public int getTotalTicketsSold() {
		return totalTicketsSold;
	}

	/**
	 * @param totalTicketsSold the totalTicketsSold to set
	 */
	public void setTotalTicketsSold(int totalTicketsSold) {
		this.totalTicketsSold = totalTicketsSold;
	}
//	method that checks the number of tickets is valid then sells them
	public boolean sellTickets(int numTickets) {
		if(numTickets <= 4 && numTickets > 0 && remainingTickets >= numTickets) {
			remainingTickets = remainingTickets - numTickets;
			totalTicketsSold = totalTicketsSold + numTickets;
			numberOfBuyers++;
			return true;
		} else {
			return false;
		}
	}
	// checks that the number of tickets is between 1-4
	public boolean isValidNumTickets(int numTickets) {
		if(numTickets <= 4 && numTickets > 0 && numTickets >= numTickets) {
			return true;
		} else {
			return false;
		}
	}
//	checks that the number of tickets is less then the remaining tickets
	public boolean isEnoughTicketsRemaining(int numTickets) {
		if(remainingTickets >= numTickets) {
			return true;
		} else {
			return false;
		}
	}
}
