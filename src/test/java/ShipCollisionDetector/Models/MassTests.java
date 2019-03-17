package ShipCollisionDetector.Models;

import static org.junit.Assert.assertTrue;

import java.text.MessageFormat;

import javax.naming.spi.DirStateFactory.Result;

import org.junit.Test;
import org.junit.platform.launcher.listeners.TestExecutionSummary.Failure;
import org.junit.runner.JUnitCore;

import ShipCollisionDetector.Models.Mass;

public class MassTests {

	private static Mass mass;

	   private double  kg ,  t,  oz,  lb ,g;

	   protected void masses() {
			g = 0.00001; 
		   kg = 0.001;
			t = 1;
			oz = 0.00002834952;
		lb = 0.000016;
   
	   }
	   
	   public void testAdd1(){
		      double result = kg * g;
		      assertTrue(result == 1000);
		   }
	   
	   public void testAdd2(){
		      double result = t /kg;
		      assertTrue(result == 1000);
		   }
	   public void testAdd3(){
		      double result = t * g;
		      assertTrue(result == 100000);
		   }
	   public void testAdd4(){
		      double result = lb / oz;
		      assertTrue(result == 2);
		   }
	   
	   public void testAdd5(){
		      boolean result = (lb == oz);
		      assertTrue(result == false);
		   }
	   
	   public void testAdd6(){
		      boolean result = (kg == kg);
		      assertTrue(result == true);
		   }
	   
	   public void testAdd7(){
		      boolean result = ((kg*1000) == t);
		      assertTrue(result == true);
		   }
	   
	   public class TestJunit1 {

		   String message = "Helyes";	
		   MessageFormat messageUtil = new MessageFormat(message);
		   
		   @Test
		   public void testPrintMessage() {	
		      System.out.println("Inside testPrintMessage(testAdd6)");    
		   }
		}
	   
	   public class TestJunit2 {

		   String message = "Helytelen";	
		   MessageFormat messageUtil = new MessageFormat(message);
		   
		   @Test
		   public void testPrintMessage() {	
		      System.out.println("Inside testPrintMessage(testAdd5)");    
		   }
		}
	   
	   public class TestRunner {
		   public void main(String[] args) {
		      org.junit.runner.Result result = JUnitCore.runClasses(TestJunit1.class);
				
		      for (org.junit.runner.notification.Failure failure : result.getFailures()) {
		         System.out.println(failure.toString());
		      }
				
		      System.out.println(result.wasSuccessful());
		   }




}
}


