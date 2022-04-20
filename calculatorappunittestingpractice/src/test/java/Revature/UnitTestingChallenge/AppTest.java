package Revature.UnitTestingChallenge;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	Calculator c = new Calculator();
	Integer firstNumber = 20;
	Integer secondNumber = 10;
	Integer result = null;
	Integer expectedOutput = null;
    @Test
    public void additionTest()
    {
       
    	result = c.add(firstNumber, secondNumber);
    	
    	assertEquals(result, Integer.valueOf(30));
    	assertTrue(result == 30);
    	
    }
    
   @Test
   public void subtractionTest() {
	   result = c.subtract(firstNumber, secondNumber);
	   
	   assertEquals(result, Integer.valueOf(10));
	   assertTrue(result == 10);
	   
   }
   
   @Test
   public void multiplicationTest() {
	   result = c.multiply(firstNumber, secondNumber);
	   
	   assertEquals(result, Integer.valueOf(200));
	   assertTrue(result == 200);
   }
   
   @Test
   public void divisionTest() {
	   result = c.divide(firstNumber, secondNumber);
	   
	   assertEquals(result, Integer.valueOf(2));
	   assertTrue(result == 2);
	   
   }
   
   @Test
   public void remainderTest() {
	   result = c.remainder(firstNumber, secondNumber);
	   
	   assertEquals(result, Integer.valueOf(0));
	   assertTrue(result==0);
	   
   }
   
   @Test
   
   public void calculateTest() {
	   assertEquals(c.calculateOnce("2+3"),Integer.valueOf(5));
	   assertEquals(c.calculateOnce("2-1"),Integer.valueOf(1));
	   assertEquals(c.calculateOnce("2*3"),Integer.valueOf(6));
	   assertEquals(c.calculateOnce("2x3"),Integer.valueOf(6)); 
	   assertEquals(c.calculateOnce("20/4"),Integer.valueOf(5));
	   assertEquals(c.calculateOnce("20\\4"),Integer.valueOf(5));
	   assertEquals(c.calculateOnce("10%9"),Integer.valueOf(1));    
	   assertNull(c.calculateOnce("x3#3"));
	   assertNull(c.calculateOnce("3#3"));
	   
   }
    
    
}
