package detector;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class TimeTest {

	Time timeS;
	Time timeM;
	Time timeH;
	double result;
	
	@BeforeEach
	public void onSetUp()
	{
		timeS = new Time(30,"s");
		timeM = new Time(10,"m");
		timeH = new Time(0.5,"h");
		result = 0;
	}
	
	@Test
	void timeTest1() {
				
		result = timeS.as("s");
		Assert.assertEquals(30.0, result);
		
	}
	
	@Test
	void timeTest2() {
		result = timeS.as("m");
		Assert.assertEquals(0.5, result);
	
	}
	
	@Test
	void timeTest3() {
		result = timeS.as("h");
		Assert.assertEquals(30.0/3600.0, result);
	
	}
	
	@Test
	void timeTest4() {
		result = timeM.as("s");
		Assert.assertEquals(600.0, result);
	
	}
	
	@Test
	void timeTest5() {
		result = timeM.as("m");
		Assert.assertEquals(10.0, result);
	
	}
	
	@Test
	void timeTest6() {
		result = timeM.as("h");
		Assert.assertEquals(10.0/60.0, result);
	
	}
	
	@Test
	void timeTest7() {
		result = timeH.as("s");
		Assert.assertEquals(1800.0, result);
	
	}
	
	@Test
	void timeTest8() {
		result = timeH.as("m");
		Assert.assertEquals(30.0, result);
	
	}
	
	@Test
	void timeTest9() {
		result = timeH.as("h");
		Assert.assertEquals(0.5, result);
	
	}
	
	@Test
	void timeTest10() {
		timeS.multiplication(10.0);
		result = timeS.as("s");
		Assert.assertEquals(300.0, result);
	}
	
	@Test
	void timeTest11() {
		timeS.add(new Time(1,"m"));
		result = timeS.as("s");
		Assert.assertEquals(90.0, result);
	}
	
	@Test
	void timeTest12() {
		timeS.subtraction(new Time(10,"s"));
		result = timeS.as("s");
		Assert.assertEquals(20.0, result);
	}
	
	@Test
	void timeTest13() {
		boolean res = false;
		res = timeH.compare(new Time(30,"m"));
		
		Assert.assertEquals(true, res);
	}
	
	
	
	
	

}
