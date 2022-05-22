package com.bridgelabz.day_30_tdd;
public class InvoiceGenerator_3 {

	private static final int COST_PER_TIME = 1;
	private static final double MINIMUM_COST_PER_KILOMETER = 10;
	private static final double MINIMUM_FARE = 5;

	public double CalculateFare(double distance, int time) {
		double totalFare =  distance * MINIMUM_COST_PER_KILOMETER + time * COST_PER_TIME;
		if(totalFare<MINIMUM_FARE)
			return MINIMUM_FARE;
		return totalFare;
	}
	public InvoiceSummary CalculateFare(Ride[] rides) {
		double totalFare = 0;
		for (Ride ride : rides) {
			totalFare += this.CalculateFare(ride.distance, ride.time);
		}
		return new InvoiceSummary(rides.length, totalFare);
	}	
}
