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

}
