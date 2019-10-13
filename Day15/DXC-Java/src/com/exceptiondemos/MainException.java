package com.exceptiondemos;


	public class MainException {

	public static void main(String[] args) {

	Tickets ticket=new Tickets();
	try{
	ticket.bookTicket(3);
	System.out.println("TICKETS BOOKED");
	}
	catch (TicketNotAvailableException e) {
	System.out.println(e.getMessage());
	}
	
	try{
		ticket.bookTicket(3);

		}
		catch (TicketNotAvailableException e) {
		System.out.println(e.getMessage());
		}
	}
	}