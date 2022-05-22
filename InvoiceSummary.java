package com.bridgelabz.day_30_tdd;

public class InvoiceSummary {
	private int numOfRide;
	private double totalfare;
	private double average;

	public InvoiceSummary(int numOfRide, double totalFare) {
		this.numOfRide = numOfRide;
		this.totalfare = totalFare;
		this.average = this.totalfare/this.numOfRide;
		
		
	}
}
