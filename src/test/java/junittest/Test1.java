//For multiple inputs on same test cases, use collection to pass input value and expected result pair

package junittest;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Test1 {
	private int expected;
	private int value;
	
	@Parameters
	public static Collection getParameters() {
		return Arrays.asList(new Object[][] {
			{49,10},
			{99,60}
		});
	}
	
	public Test1(int expected, int value) {
		this.expected = expected;
		this.value = value;
	}
	
	@Test
	public void testSum() {
		Calculator cal = new Calculator();
		int result = cal.sum(value);
		assertEquals(expected, result);
	}

}
