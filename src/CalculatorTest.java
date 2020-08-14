import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test()
	void testAdd() {
//		fail("Not yet implemented");
		Calculator c = new Calculator();
		int result = c.add(20, 30);
		int expected = 30;
		
		assertEquals(expected, result);
	}

	@Test
	void testSub() {
		fail("Not yet implemented");
	}

}
