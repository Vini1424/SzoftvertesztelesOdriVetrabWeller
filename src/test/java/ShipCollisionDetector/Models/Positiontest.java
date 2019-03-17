package detector;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class Positiontest {

	Ship primary;
	Ship other;
	Detector detector;
	
	@BeforeEach
	public void onSetUp()
	{
		
		primary = new Ship(10, VelocityType.KMPH, 50, LengthType.M, 15000, MassType.KG, 0, new Position());
		
		other = new Ship(25, VelocityType.KMPH, 40, LengthType.M, 16000, MassType.KG, 0, new Position());

		
		
	}
	
	// balrol balra megy
	@Test
	public void testLeftToLeft() {
		other.setPosition(-50, 13);
		
		other.setDegree(190);
		
		
		
		boolean result = primary.crossDetection(other);
		Assert.assertEquals(false, result);
	}
	
	// jobbrol jobbra megy
	@Test
	public void testRightToRight() 
	{
		other.setPosition(50, 13);
		
		other.setDegree(15);
		
		
		
		boolean result = primary.crossDetection(other);
		Assert.assertEquals(false, result);
	}
	
	// balrol jobbra megy
		@Test
		public void testLeftToRight() 
		{
			other.setPosition(-50, 13);
			
			other.setDegree(15);
			
			
			
			boolean result = primary.crossDetection(other);
			Assert.assertEquals(true, result);
		}
		
	// jobbrol balra megy
		@Test
		public void testRightToLeft() 
		{
			other.setPosition(50, 13);
			
			other.setDegree(200);
			
			
			
			boolean result = primary.crossDetection(other);
			Assert.assertEquals(true, result);
		}

}
