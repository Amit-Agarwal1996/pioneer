import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
class PalindromeTest {

	
	private static Palindrome pal;

	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
		pal = new Palindrome();

	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		pal = null;

	}
	
	@SuppressWarnings("static-access")
	@Test
	void testPalindromeChecker() {
		
		assertEquals(121 ,pal.palindromeChecker(121)); 
//		fail("Not yet implemented");
	}

}
