import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test

	public void testAdd() {
		int a = 4321;
		int b = 1234;

		Calculator cal = new Calculator();
		int actual = cal.add(a, b);

		int expected = 5555;
		assertEquals(expected, actual);
	}

	@Test
	public void testSubstract() {
		int a = 10;
		int b = 2;

		Calculator cal = new Calculator();
		int actual = cal.substract(a, b);

		int expected = 8;
		assertEquals(expected, actual);
	}

	@Test
	public void testMultiple() {
		int a = 2;
		int b = 4;

		Calculator cal = new Calculator();
		int actual = cal.multiple(a, b);

		int expected = 8;
		assertEquals(expected, actual);
	}

	@Test
	public void testDivide() {
		int a = 12;
		int b = 3;

		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);

		int expected = 4;
		assertEquals(expected, actual);
	}

}
