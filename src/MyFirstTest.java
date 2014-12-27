import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class MyFirstTest {
	void fail(String s){
		System.out.println("Going to fail...");
	assertTrue("Purposefully failing" , !false);
		//assertFalse(new String("5").equals(new String("5")));
		//assertFalse( 1 != 1  );
	}
	void findSuccess(String s){
		System.out.println("Work hard...");
	}
	@Test public void testMyFailure() {
		fail("Not yet implemented");
	}
	
	@Test public void testMySussess() {
		findSuccess("Not yet implemented");
	}
	
	@Before public void doTry(){
		System.out.println("Trying...");
	}
	@After public void reTry(){
		System.out.println("<working after each test >I must re try... ");
	}

}
