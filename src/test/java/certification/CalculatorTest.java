package certification;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
Calculator cal=new Calculator();
	@Test
	public void testAdd() {
		assertEquals(10,cal.add(5, 5));
	}
}
