//Practice before annotation (Before annotation is used when different test cases share the same logic)

package junittest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Test2 {
	private Calculator cal;
	
	@Before
	public void setUp() {
		cal = new Calculator();
	}
	
	@Test
	public void testSum1() {
		int result = cal.sum(10);
		assertEquals(49,result);
	}

	@Test
	public void testSum2() {
		int result = cal.sum(11);
		assertEquals(55,result);
	}
}
