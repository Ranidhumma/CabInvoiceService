package com.bridgelabz;

public class InvoiceGenerator {

	/*
	 * Here we are creating Method for calculating Fare
	 */

	int MINIMUM_FARE = 5;
	int COST_PER_TIME = 0;
	double MIN_COST_PER_KILOMETER = 10;

	public double calculateFare(double distance, int time) {
		int MIN_COST_PER_KILOMETER = 10;
		int COST_PER_TIME = 1;
		double totalFare = distance * MIN_COST_PER_KILOMETER + time * COST_PER_TIME;

		return totalFare;
	}

}