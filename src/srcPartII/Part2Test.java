import static org.junit.Assert.*;

import org.junit.Test;


public class Part2Test {

	//@Test
	public void testTestMethodCalled() {
		WasRun test= new WasRun("testMethod");
		System.out.println(test.wasRun);
		test.testMethod();
		System.out.println(test.wasRun);
	}
	
	@Test
	public void testRunMethod(){
		WasRun test= new WasRun("testMethod");
		System.out.println(test.wasRun);
		test.run();
		System.out.println(test.wasRun);
	}
	@Test
	public void testTestCase(){
		TestCase TestCase = new TestCase();
	}

	

}
