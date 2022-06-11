package junittest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Test4 {
	
		@BeforeClass 
		//annotation specifies that method will be invoked only once, before starting all the tests
		public static void testBeforeAll() throws Exception{
			System.out.println("Start all tests");
		}
		@Before
		//annotation specifies that method will be invoked before each test.
		public void testBefore() throws Exception{
			System.out.println("Start each tests");
		}

		@Test
		//assertArrayEquals(airethematicArrary1, airethematicArrary2) - check that the expected array and the resulted array are equal
		public void testArray() {
			int[][] arr1 = new int[][] {{10},{10},{10}};
			int[][] arr2 = new int[][] {{10},{10},{10}};
			assertArrayEquals(arr1,arr2);
		}
		
		@Test
		//assertEquals(string1,string2) - checks that two primitives/objects are equal.
		public void testAddressObject() {
			String s1 = "pretty";
			String s2 = "pretty";
			assertEquals(s1, s2);
		}
		
		@Test
		//assertSame(string3, string4) -  check that the two objects refer to the same object
		public void testSameObject() {
			String s3 = new String("hello");
			String s4 = new String("hello");
			assertSame(s3, s4);
		}
		
		@Test
		//assertNotNull(string1) - check that an object is not null
		public void testNotNull() {
			String s4 = new String("hello");
			assertNotNull(s4);
		}
		
		@Test
		//assertTrue() - functionality is to check that a condition is true.
		public void testBoolean() {
			Calculator calculator = new Calculator();
			boolean result = calculator.isNumber("5");
			assertTrue(result);
		}

		@After
		//annotation specifies that method will be invoked after each test.
		public void testAfter() throws Exception{
			System.out.println("Finish each tests");
		}
		
		@AfterClass
		//annotation specifies that method will be invoked only once, after finishing all the tests
		public static void testAfterAll() throws Exception{
			System.out.println("Finish all tests");
		}
	}

