package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitMessageTest {

	public String message="Raj";
	JUnitMessage junitMessage=new JUnitMessage(message);
	
	@Test
	public void test() {
		fail("Not yet implemented");
		System.out.println("Junit Message is printing ");           
		junitMessage.printMessage();
	}
	message = "Hi " + message;                       
    System.out.println("Junit Hi Message is printing ");           
    assertEquals(message, junitMessage.printHiMessage());
    System.out.println("Suite Test 1 is successful " + message);

}
