import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testDivide() {
		int a = 500;
		int b = 250;
		int expected = 2;
		int actual = a/b;
		assertEquals (expected,actual);
	}
	
	
	
	public final void testMultiple() {
		Calculator cal = new Calculator();
		int a = 20;
		int b = 30;
		int expected = 600;
		int actual = a * b;
		assertEquals (expected,actual);
	}
	
	
	
	
	public final void testSubstract() {
		int a = 3221;
		int b = 5773;
		
		Calculator cal = new Calculator();
		int actual = cal.substract(a, b);
		
		int expected = 8994;
		assertEquals (expected,actual);
	}
	
	public final void  testAdd() {
//		fail("Not yet implemented");
		int a = 3221;
		int b = 5773;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a,b);
		
		int expected = 8994;
		assertEquals (expected,actual);
	}
}
