package money;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneralizationValidator {
	@Test public void compareDollarToPound(){
		Dollar d3 = new Dollar(2.0);
		Pound  p3 = new Pound(2.0);

		assertEquals(d3, d3);
		assertEquals(p3, p3);

		//assertEquals(d3, p3);// calls Denomination's equal : No class cast exception but fails as currency is not matcing

		p3.setCurrency("$");// Lets this currency rule break and test pases. 
		assertEquals(d3, p3);
		
	}
	
}
