package testing;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AgeValidatorTest {
	@Test
	public void testLowerBoundry()
	{
		assertEquals("Invalid", AgeValidator.isValidAge(0));
		assertEquals("Valid", AgeValidator.isValidAge(1));
		assertEquals("Valid", AgeValidator.isValidAge(2));
	}
	
	@Test
	public void testUpperBoundry()
	{
		assertEquals("Valid", AgeValidator.isValidAge(99));
		assertEquals("Valid", AgeValidator.isValidAge(100));
		assertEquals("Invalid", AgeValidator.isValidAge(101));
	}

}
