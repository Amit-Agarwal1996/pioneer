import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class FrequencyTest {

	private static Frequency pal;

	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
		pal = new Frequency();

	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		pal = null;

	}
	
	@SuppressWarnings("static-access")
	@Test
	void testCountEachWords() {

		assertEquals("{Hello=1, world!!!!=1}" ,pal.output());
	}

}
