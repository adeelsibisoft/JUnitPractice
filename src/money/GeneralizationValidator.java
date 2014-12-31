package money;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneralizationValidator {
	@Test public void compareDollarToPound(){
		Dollar d3 = new Dollar(3.0);
		Pound  p3 = new Pound(3.0);
		//assertEquals(d3, d3);
		//assertEquals(p3, p3);
		
		assertEquals(d3, p3);// calls dollar's equal and explicitly compares with pound's because .equals methods are written so
		assertEquals(p3, d3);// calls pound's equal and explicitly compares with dollar's because .equals methods are written so
		assertEquals(p3, p3);// calls pound's equal : gives class cast exception
		
	}
}
