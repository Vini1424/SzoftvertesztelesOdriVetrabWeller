package ShipCollisionDetector.Models;

import ShipCollisionDetector.Models.Enums.MassUnit;

public class Mass implements Comparable<Mass> {
	
	private static double EPSILON = 0.00001;
	
	private MassUnit massUnit;
	private double massValue;

	private double g;

	private int t;

	private double kg;

	private double oz;

	private double lb;
	
	public Mass(MassUnit massUnit, double massValue , double g, double kg, double t , double oz , double lb) {
		//TODO: convert given unit into KG
		this.massUnit = massUnit;
		this.massValue = massValue;
		this.setG(0.00001); 
		   this.setKg(0.001);
		this.setT(1);
			this.setOz(0.00002834952);
		this.setLb(0.000016);
	}
	
	public MassUnit getMassUnit() {
		return massUnit;
	}

	public double getMassValue() {
		return massValue;
	}

	public double convertToRequestedUnit(MassUnit requestedUnit) {
		return 0;
	}

	public int compareTo(Mass otherMass) {
		double otherMassValue = otherMass.getMassValue();
		return (this.massValue - otherMassValue) < EPSILON ? 0 : (this.massValue < otherMassValue) ? -1 : 1;
	}

	public double getG() {
		return g;
	}

	public void setG(double g) {
		this.g = g;
	}

	public int getT() {
		return t;
	}

	public void setT(int t) {
		this.t = t;
	}

	public double getKg() {
		return kg;
	}

	public void setKg(double kg) {
		this.kg = kg;
	}

	public double getOz() {
		return oz;
	}

	public void setOz(double oz) {
		this.oz = oz;
	}

	public double getLb() {
		return lb;
	}

	public void setLb(double lb) {
		this.lb = lb;
	}

}
