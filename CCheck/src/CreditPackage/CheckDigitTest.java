package CreditPackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CheckDigitTest {

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

	
	//Don't know how to call CheckDigit since there is user input and no method to reference
	@Test
	public void test() {
		assertEquals("Valid Card Number"), true, CheckDigit.creditCardNumber = 4388576018410707;
		assertEquals("Invalid Card Number"), false, CheckDigit.creditCardNumber = 4246345689049834;
		}

}
