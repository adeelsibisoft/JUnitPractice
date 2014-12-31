package money;
import static org.junit.Assert.*;

import org.junit.Test;
import money.Pound;

public class JUnitMoneyValidator {

	@SuppressWarnings("unused")
	@Test public void testDenominationCreation() {
		Dollar dollar1 = new Dollar("4");
		Dollar dollar8 = new Dollar("8");
		assertEquals( new Dollar("4") ,dollar1);
		assertEquals( new Dollar("8") ,dollar8);
		
		Pound p = new Pound("2");
		assertEquals( new Pound("2") , p);
		
	}
	
	@Test public void testDenominationAddition() {
		Dollar dollar1 = new Dollar("4");
		Dollar dollar2 = new Dollar("4");
		Dollar dollar8 = new Dollar("8");
		boolean result = dollar8.equals(dollar1.add(dollar2));
		assertEquals(dollar8 , dollar1.add(dollar2));
		
		Pound p3 = new Pound("3");
		Pound p4 = new Pound("4");
		Pound p7 = new Pound("7");
		assertEquals(p7 , p3.add(p4));
	}
	
	@Test public void testDenominationMultiplication(){
		//  flow 1
		
		Dollar d4 = new Dollar(4.0);
		d4.getMultiplied(d4);
		assertEquals(new Dollar(16),  d4 );
		//assertEquals(d4, new Dollar(4));// ***explicitly broken this flow as getMultiplied() changes its own vale
		//flow 2
		
		Dollar d16 = new Dollar(16);
		assertEquals(new Dollar(256) , d16.product(d16 , d16) );// product should be a static method
		assertEquals(d16, d16);
		
		Pound p2 = new Pound("2");
		Pound p3 = new Pound("3");
		assertEquals(new Pound(6.0) , new Pound().product(p2, p3) );// .product is called through a nameless obj
		
		//flow 3
		
		Dollar d9 = new Dollar(9);
		assertEquals(new Dollar(81) , Dollar.getProduct( d9 , d9 ) ); 
		assertEquals( 9.0, d9.seedAmount, 0);// d9 obj is not changed
		
	}
	
	@Test public void compareDollarToPound(){
		Dollar d3 = new Dollar(3.0);
		Pound  p3 = new Pound(3.0);
		assertEquals(d3, d3);
		assertEquals(p3, p3);
		
		assertEquals(d3, p3);// fails :( I'll get this done inshallah
		
	}
}
