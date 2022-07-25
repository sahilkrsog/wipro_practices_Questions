package junit.first;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
	Calculator cal = new Calculator();
	@Test
	public void testAdd() {
//		Calculator cal =new Calculator();
		assertEquals("result",5,cal.add(2, 3));
		
	}

	@Test
	public void testSub() {
		assertEquals("Result",5,cal.sub(7, 2));
	
	}

}
