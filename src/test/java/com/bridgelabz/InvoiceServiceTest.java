package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class InvoiceServiceTest {

	@Test
	public void givenDistanceAndTimeShouldReturnFare() {
		InvoiceGenerator invoiceGenerataor = new InvoiceGenerator();
		double distance = 2.0;
		int time = 5;
		double fare = invoiceGenerataor.calculateFare(distance, time);
		Assert.assertEquals(25.00, fare, 0.0);

	}

	@Test
	public void givenLessDistanceAndTimeShouldReturnMinimumFare() {
		InvoiceGenerator invoiceGenerataor = new InvoiceGenerator();
		double distance = 0.1;
		int time = 1;
		double fare = invoiceGenerataor.calculateFare(distance, time);
		Assert.assertEquals(5.00, fare, 0.0);

	}

	@Test
	public void givenMultipleRideShouldReturnTotalFare() {
		InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
		Ride[] rides = { new Ride(2.00, 5), new Ride(0.1, 1) };
		double fare = invoiceGenerator.calculateFare(rides);
		Assert.assertEquals(30, fare, 0.0);

	}
}
