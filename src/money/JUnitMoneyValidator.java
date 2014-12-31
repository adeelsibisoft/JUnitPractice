package money;
import static org.junit.Assert.*;

import org.junit.Test;


public class JUnitMoneyValidator {

	@SuppressWarnings("unused")
	@Test public void testDenominationCreation() {
		Dollar dollar1 = new Dollar("4");
		Dollar dollar8 = new Dollar("8");
		assertEquals( new Dollar("4") ,dollar1);
		assertEquals( new Dollar("8") ,dollar8);
		
	}
	
	@Test public void testDenominationAddition() {
		Dollar dollar1 = new Dollar("4");
		Dollar dollar2 = new Dollar("4");
		Dollar dollar8 = new Dollar("8");
		boolean result = dollar8.equals(dollar1.add(dollar2));
		assertEquals(dollar8 , dollar1.add(dollar2));
	}
	
	@Test public void testDenominationMultiplication(){
		//  flow 1
		
		Dollar d4 = new Dollar(4);
		d4.getMultiplied(d4);
		assertEquals(new Dollar(16),  d4 );
		//assertEquals(d4, new Dollar(4));// ***explicitly broken this flow as getMultiplied() changes its own vale
		//flow 2
		
		Dollar d16 = new Dollar(16);
		assertEquals(new Dollar(256) , d16.product(d16 , d16) );// product should be a static method
		assertEquals(d16, d16);
		//flow 3
		
		Dollar d9 = new Dollar(9);
		assertEquals(new Dollar(81) , Dollar.getProduct( d9 , d9 ) ); 
		assertEquals( 9.0, d9.baseValue, 0);// d9 obj is not changed
		
	}
}
