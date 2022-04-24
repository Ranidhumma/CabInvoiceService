package com.bridgelabz;

import java.util.HashMap;
import java.util.Map;

public class InvoiceService  {

	private static final int MINIMUM_FARE = 5;
	private static final double COST_PER_TIME = 1;
	private static final double MIN_COST_PER_KILOMETER = 10;
	private Map<String, Ride[]> rideRepository = new HashMap<String, Ride[]>();

	/*
	 * Here we are creating Method for calculating Fare
	 */
	public double calculateFare(double distance, int time) {
		double totalFare = distance * MIN_COST_PER_KILOMETER + time * COST_PER_TIME;

		if (totalFare < MINIMUM_FARE) {
			return MINIMUM_FARE;
		}
		return totalFare;
		// return Math.max(totalFare, MINIMUM_FARE);
	}

	public InvoiceSummary calculateFare(Ride[] rides) {
		double totalfare = 0;
		for (Ride ride : rides) {
			totalfare += this.calculateFare(ride.distance, ride.time);
		}
		return new InvoiceSummary(rides.length, totalfare);

	}

	public InvoiceSummary getInvoiceSummary(String userId) {
		// TODO Auto-generated method stub
		Ride[] rides = rideRepository.get(userId);
		return new InvoiceService ().calculateFare(rides);

	}

	public void addRides(String user, Ride[] rides) {
		// TODO Auto-generated method stub
		rideRepository.put(user, rides);
	}

}
