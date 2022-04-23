package com.bridgelabz;

public class InvoiceSummary {

	private int numOfRides;
	private double totalfare;
	private Object avgFare;

	public InvoiceSummary(int numOfRides, double totalfare) {
		// TODO Auto-generated constructor stub
		this.numOfRides = numOfRides;
		this.totalfare = totalfare;
		this.avgFare = this.totalfare / this.numOfRides;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InvoiceSummary other = (InvoiceSummary) obj;
		if (numOfRides != other.numOfRides)
			return false;
		if (Double.doubleToLongBits(totalfare) != Double.doubleToLongBits(other.totalfare))
			return false;
		return true;
	}

}
