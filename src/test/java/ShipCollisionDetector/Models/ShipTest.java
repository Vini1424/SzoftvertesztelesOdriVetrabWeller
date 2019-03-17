package detector;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.framework.Assert;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShipTest {

	Ship primary;
	Ship other;
	Detector detector;
	
	@BeforeEach
	public void onSetUp()
	{
		
		primary = new Ship(0, VelocityType.KMPH, 50, LengthType.M, 15000, MassType.KG, 0, new Position());
		other = new Ship(100, VelocityType.KMPH, 40, LengthType.M, 16000, MassType.KG, 0, new Position());
		detector = new Detector(primary, other);
	}
	
	@Test
	void CrossPoint1() {
		
		other.setPosition(100, 0);
		other.setDegree(270);
		
		
		
		Position result = detector.crossPoint();
		Assert.assertEquals(0, result.getY());
		
	}
	
	@Test
	void CrossPoint2() {
		
		primary.setV(10);
		other.setPosition(10, 10);
		other.setDegree(270);
		
		
		
		Position result = detector.crossPoint();
		Assert.assertEquals(9, result.getY());
		
	}

}
