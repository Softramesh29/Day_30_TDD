package com.bridgelabz.day_30_tdd;

public class InvoiceGenerator_1 {

	private static final int COST_PER_TIME = 1;
	private static final double MINIMUM_COST_PER_KILOMETER = 10;

	public double CalculateFare(double distance, int time) {
		return distance * MINIMUM_COST_PER_KILOMETER + time * COST_PER_TIME;
		
	}
	
}
