package com.bridgelabz;

public class Ride {

	public double distance;
	public int time;
	public CategaryType Type;

	public Ride(double distance, int time) {
		// TODO Auto-generated constructor stub
		this.distance = distance;
		this.time = time;
	}

	public Ride(CategaryType Type, double distance, int time) {
		super();
		this.Type = Type;
		this.distance = distance;
		this.time = time;
	}

}
