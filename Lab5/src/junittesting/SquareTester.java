package junittesting;
import org.junit.*;
//import org.junit.jupiter.api.Test;
import org.junit.runner.*;
import java.util.*;


public class SquareTester {
	 Square tester = new Square(4);
	 Square tester2 = new Square(4);


	 @Override
	 protected void setUp() throws Exception{
	 	System.out.println("Setting up tests!");
	 	tester.toString();
	 	tester2.toString();
	 }

	 @Test
	 protected void testEquals() {
	 	assertTrue("Checking if the 2 squares are equal", tester.equals(tester2));
	 }

	 public void tearDown() throws Exception{

	 	System.out.println("Running tear down");
	 	tester = null;
	 	tester2 = null;
	 	assertNull(tester);
	 	assertNull(tester2);
	 }

}

