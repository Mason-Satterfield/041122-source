package revature.JUnitExample;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class AppTest 
{
	MyClass meclass = new MyClass();
	
	//the @Test annotation marks a method as a test method to be run by the test runner
	//a test runner is a program that runs test methods and reports the results
	//this first method tests if the new MyClass mc object is null
    @Test
    public void firstTest(){
    	//checks for empty or null references
    	assertNotNull(meclass);
    }
    @Test
    public void addTest() {
    	int x = meclass.add(5, 8); //this should equal 13
    	assertEquals(x, 13); //this line is asserting that the variable x is equal to 13
    	assertNotEquals(x, 0); //this line is asserting that x is not equal to 0
    	//this returns a boolean value using a boolean comparison
    	assertTrue(x == 13); //this is asserting that x is equal to 13 by returning true
    	
    }
    //comes before each @test method that is ran
    @BeforeEach
    public void beforeEach() {
    	System.out.println("I am before each test");
    }
    //comes after each @test method that is ran
    @AfterEach
    public void afterEach() {
    	System.out.println("I am after each test");
    }
    //must be static to run beforeall
    @BeforeAll
    public static void beforeAll() {
    	System.out.println("I am before all");
    }
  //must be static to run afterall
    @AfterAll
    public static void afterAll() {
    	System.out.println("I am after all");
    }
}
