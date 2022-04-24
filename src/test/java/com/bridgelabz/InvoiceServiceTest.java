package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class InvoiceServiceTest {

	@Test
	public void givenDistanceAndTimeShouldReturnFare() {
		InvoiceService invoiceService = new InvoiceService();
		double distance = 2.0;
		int time = 5;
		double fare = invoiceService.calculateFare(distance, time);
		Assert.assertEquals(25.00, fare, 0.0);
	}

	@Test
	public void givenLessDistanceAndTimeShouldReturnMinimumFare() {
		InvoiceService invoiceService = new InvoiceService();
		double distance = 0.1;
		int time = 1;
		double fare = invoiceService.calculateFare(distance, time);
		Assert.assertEquals(5.00, fare, 0.0);
	}

	@Test
	public void givenMultipleRideShouldReturnInvoiceSummary() {
		InvoiceService invoiceService = new InvoiceService();
		Ride[] rides = { new Ride(2.00, 5), new Ride(0.1, 1) };
		InvoiceSummary summary = invoiceService.calculateFare(rides);
		InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(2, 30);
		Assert.assertEquals(expectedInvoiceSummary, summary);
	}

	@Test
	public void givenUserIdAndRides_ShouldReturnInvoiceSummary() {
		InvoiceService invoiceService = new InvoiceService();
		String user1 = "XYZ";
		Ride[] rides1 = { new Ride(2.0, 5), new Ride(0.1, 1), new Ride(3.0, 2) };
		invoiceService.addRides(user1, rides1);
		String user2 = "ABC";
		Ride[] rides2 = { new Ride(3.0, 5), new Ride(0.1, 1) };
		invoiceService.addRides(user2, rides2);
		InvoiceSummary summary = invoiceService.getInvoiceSummary(user1);
		InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(3, 62);
		Assert.assertEquals(expectedInvoiceSummary, summary);
	}
}
