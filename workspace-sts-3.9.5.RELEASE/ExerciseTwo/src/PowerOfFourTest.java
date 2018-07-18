import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class PowerOfFourTest {
	
	private static PowerOfFour pof;

	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
		pof = new PowerOfFour();

	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		pof = null;

	}

	@SuppressWarnings("static-access")
	@Test
	public void testIsPowerOfFour() {
		assertEquals(true ,pof.isPowerOfFour(256)); 
	}

}
