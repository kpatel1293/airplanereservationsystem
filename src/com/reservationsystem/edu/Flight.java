package com.reservationsystem.edu;

import java.sql.Date;
import java.sql.Time;
import java.util.Set;

public class Flight {
	private int flightID;
	
	private String orginAirport, destinationAirport;
	private String flightNumber;
	private Date depDate, arrivalDate;
	private Time depTime, arrivalTime;
	private String orginTerminal, destTerminal;
	
	private int numOfSeats;
	private boolean isFlightFull;
	
	public Set<Seat> seats;
	public Set<Passanger> passangers;
}
 