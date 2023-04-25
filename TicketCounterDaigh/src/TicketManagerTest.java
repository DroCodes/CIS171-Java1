import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**  
* Deon Daigh - dmdaigh
* CIS171 23355
* Apr 19, 2023
* MacOS 13.2
*/

public class TicketManagerTest {
	

	@Test
	public void testSellTickets() {
	    TicketManager ticketManager = new TicketManager(28, 0, 0);
	    assertTrue(ticketManager.sellTickets(4));
	    assertEquals(24, ticketManager.getRemainingTickets());
	    assertEquals(4, ticketManager.getTotalTicketsSold());
	    assertEquals(1, ticketManager.getNumberOfBuyers());
	}

	@Test
	public void testSellMoreThenFourTickets() {
	    TicketManager ticketManager = new TicketManager(28, 0, 0);
	    assertFalse(ticketManager.sellTickets(5));
	    assertEquals(28, ticketManager.getRemainingTickets());
	    assertEquals(0, ticketManager.getTotalTicketsSold());
	    assertEquals(0, ticketManager.getNumberOfBuyers());
	}

	@Test
	public void testSellingMoreTicketsThenRemaining() {
	    TicketManager ticketManager = new TicketManager(2, 0, 0);
	    assertFalse(ticketManager.sellTickets(3));
	    assertEquals(2, ticketManager.getRemainingTickets());
	    assertEquals(0, ticketManager.getTotalTicketsSold());
	    assertEquals(0, ticketManager.getNumberOfBuyers());
	}

	@Test
	public void testSellingOneTicket() {
	    TicketManager ticketManager = new TicketManager(28, 0, 0);
	    assertTrue(ticketManager.sellTickets(1));
	    assertEquals(27, ticketManager.getRemainingTickets());
	    assertEquals(1, ticketManager.getTotalTicketsSold());
	    assertEquals(1, ticketManager.getNumberOfBuyers());
	}

	@Test
	public void testNumberOfValidTickets() {
	    TicketManager ticketManager = new TicketManager(28, 0, 0);
	    assertTrue(ticketManager.isValidNumTickets(1));
	    assertTrue(ticketManager.isValidNumTickets(2));
	    assertTrue(ticketManager.isValidNumTickets(3));
	    assertTrue(ticketManager.isValidNumTickets(4));
	}

	@Test
	public void testInvalidNumberOfTickets() {
	    TicketManager ticketManager = new TicketManager(28, 0, 0);
	    assertFalse(ticketManager.isValidNumTickets(0));
	    assertFalse(ticketManager.isValidNumTickets(-1));
	    assertFalse(ticketManager.isValidNumTickets(5));
	    assertFalse(ticketManager.isValidNumTickets(10));
	}

	@Test
	public void testIsEnoughTicketsRemaining() {
	    TicketManager ticketManager = new TicketManager(28, 0, 0);
	    assertTrue(ticketManager.isEnoughTicketsRemaining(4));
	    assertTrue(ticketManager.isEnoughTicketsRemaining(3));
	    assertTrue(ticketManager.isEnoughTicketsRemaining(2));
	    assertTrue(ticketManager.isEnoughTicketsRemaining(1));
	}

	@Test
	public void testNotEnoughTicketsRemaining() {
	    TicketManager ticketManager = new TicketManager(2, 0, 0);
	    assertFalse(ticketManager.isEnoughTicketsRemaining(3));
	    assertTrue(ticketManager.isEnoughTicketsRemaining(2));
	    assertTrue(ticketManager.isEnoughTicketsRemaining(1));
	    assertTrue(ticketManager.isEnoughTicketsRemaining(0));
	}
}
