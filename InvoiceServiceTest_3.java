package com.bridgelabz.day_30_tdd;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class InvoiceServiceTest_3 {
	@Test
	public void givenMultipleRide_ShouldReturnInvoiceSummary() {
		InvoiceGenerator_2 invoiceGenerator = new InvoiceGenerator_2();
		Ride[] rides = {
						new Ride (2.0 , 5),
						new Ride (0.1, 1)
						};
		double summary = invoiceGenerator.CalculateFare(rides);
		InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(2,30);
		Assert.assertEquals(expectedInvoiceSummary,summary);	
	}
}
