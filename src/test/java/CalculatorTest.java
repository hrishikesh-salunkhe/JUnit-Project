import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		
		assertThrows(AssertionError.class, 
				() -> {

					Calculator calc = new Calculator();
					assertEquals(4, calc.add(3, 2));			
				}
		);
	}
}
