package ShipCollisionDetector.Models;

import ShipCollisionDetector.Models.Enums.TimeUnit;

public class Time {
	TimeUnit timeUnit;
	double timeValue;
	private int h;
	private double m;

	public Time(TimeUnit timeUnit, double timeValue, double h , double m) {
		this.timeUnit = timeUnit;
		this.timeValue = timeValue;
		this.setH(1);
		this.setM(0.1);
		
	}

	public TimeUnit getTimeUnit() {
		return timeUnit;
	}

	public void setTimeUnit(TimeUnit timeUnit) {
		this.timeUnit = timeUnit;
	}

	public double getTimeValue() {
		return timeValue;
	}

	public void setTimeValue(double timeValue) {
		this.timeValue = timeValue;
	}
	
	public Boolean isOverlap(Time otherTime) {
		return null;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public double getM() {
		return m;
	}

	public void setM(double m) {
		this.m = m;
	}
	public double osszead (double m , double h) {
		
	return h+h;
	}
	public double szoroz (double m , double h, double result) {
		
		if(m > 60) {
			m=h;
			
		}
		return h*h;
		}
}
