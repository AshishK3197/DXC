package com.exceptiondemos;

public class TicketNotAvailableException extends Exception{

@Override
public String getMessage() {
return "You are out of your luck//Sorry";
}
}