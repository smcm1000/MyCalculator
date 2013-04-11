/**
 * 
 */
package ie.gcd.tests;

import static org.junit.Assert.*;
import ie.gcd.myCalculator.ScientificCalculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author seamusmcmorris
 *
 */
public class ScientificCalculatorTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link ie.gcd.myCalculator.ScientificCalculator#add(int, int)}.
	 */
	@Test
	public void testAdd() {
		ScientificCalculator c = new ScientificCalculator();
		assertEquals(5, c.add(2, 3));
	}

}
