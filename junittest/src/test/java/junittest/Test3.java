//Practice how to improve coverage

package junittest;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Test3 {
	private int expected;
	private int value;
	
	@Parameters
	public static Collection getParameters() {
		return Arrays.asList(new Object[][] {
			{'A',93},
			{'B',87},
			{'C',79},
			{'D',60},
			{'F',10}
		});
	}
	
	public Test3(int expected, int value) {
		this.expected = expected;
		this.value = value;
	}
	
	@Test
	public void testSum() {
		Grade grad = new Grade();
		int result = grad.calGrade(value);
		assertEquals(expected, result);
	}

}
