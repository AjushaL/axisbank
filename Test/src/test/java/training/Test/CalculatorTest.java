/**
 * Aj(CompanyName)
 * Aug 22, 2022
 * 
 */
package training.Test;
import org.junit.Test;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {
	Calculator calculator= new Calculator();;
	
	@Test
	public void test1() {
		assertEquals(4, calculator.add(2, 2));
	}
	@Test
	public void test2() {
		assertEquals(10, calculator.add(7, 3));
	}
	@Test
	public void test3() {
		assertEquals(3, calculator.add(0, 3));
	}

}
