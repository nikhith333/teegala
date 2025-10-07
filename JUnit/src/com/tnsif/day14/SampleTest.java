package com.tnsif.day14;


	import org.junit.*;

	public class SampleTest {

	    private Sample sample;

	    @BeforeClass
	    public static void beforeAll() {
	        System.out.println("==> @BeforeClass: Runs once before all test cases");
	    }

	    @AfterClass
	    public static void afterAll() {
	        System.out.println("==> @AfterClass: Runs once after all test cases");
	    }

	    @Before
	    public void setUp() {
	        sample = new Sample();
	        System.out.println("-- @Before: Runs before each test case");
	    }

	    @After
	    public void tearDown() {
	        System.out.println("-- @After: Runs after each test case\n");
	    }

	    @Test
	    public void testGreet() {
	        System.out.println("Running testGreet()");
	        Assert.assertEquals("Hello, JUnit!", sample.greet());
	    }

	    @Test
	    public void testSquare() {
	        System.out.println("Running testSquare()");
	        Assert.assertEquals(25, sample.square(5));
	    }

	    @Ignore("This test is ignored for demonstration")
	    @Test
	    public void ignoredTest() {
	        System.out.println("This should not run");
	        Assert.assertTrue(false);
	    }

	    @Test
	    public void repeatedTest() {
	        System.out.println("Running repeatedTest() 3 times:");
	        for (int i = 1; i <= 3; i++) {
	            System.out.println("  Run " + i + ": square(3) = " + sample.square(3));
	            Assert.assertEquals(9, sample.square(3));
	        }
	    }
	


}
