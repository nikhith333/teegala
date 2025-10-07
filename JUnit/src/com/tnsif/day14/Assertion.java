package com.tnsif.day14;

	import static org.junit.Assert.assertEquals;
	import static org.junit.Assert.assertNull;
	import static org.junit.Assert.assertTrue;

	import org.junit.Ignore;
	import org.junit.Test;


public class Assertion {
		
		@Ignore
		void testAssertTrue()
		{
			assertTrue("Hello".contains("m"));
		}
		
		@Test
		void assertEqualsMethod()
		{
			int res= 1;
			int exp = 2;
			assertEquals(res,exp);
		}
		
		void testNull()
		{
			String s= null;
			assertNull(s);
		}
	

}
