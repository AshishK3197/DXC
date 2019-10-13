package com.exceptiondemos;

public class Tickets {

	static int availabletickets = 5;

	void bookTicket(int noOfTickets) throws TicketNotAvailableException {
		if (noOfTickets <=availabletickets) {
			availabletickets = availabletickets-noOfTickets;
		}
		else
			throw new TicketNotAvailableException();

	}

}
