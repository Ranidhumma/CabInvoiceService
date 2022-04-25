package com.bridgelabz;

public enum CategaryType implements ServiceTypes {

	PREMIUM(15.00, 2.0, 20), NORMAL(10.00, 1.0, 5);

	public double ratePerKm;
	public double ratePerMin;
	public double MinimumFare;

	CategaryType(double ratePerKm, double ratePerMin, double MinFare) {
		// TODO Auto-generated constructor stub
		this.ratePerKm = ratePerKm;
		this.ratePerMin = ratePerMin;
		this.MinimumFare = MinFare;
	}

	public double calculateCategoryType(double distance, int time) {
		// TODO Auto-generated method stub
		double totalFare = distance * ratePerKm + time * ratePerMin;
		return Math.max(totalFare, MinimumFare);

	}

}
