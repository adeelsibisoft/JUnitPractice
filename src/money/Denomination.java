package money;

public class Denomination {
	protected double seedAmount;// removed duplication
	public String currency ;// lets make this public for the time being  
		
	public Denomination(double d) {
		this( ""+d , "x" );
	}
	
	public Denomination(Double d, String sParam) {
		this( ""+d , sParam );
	}

	public Denomination(String amount, String currencySymbol) {
		seedAmount = Double.parseDouble( amount );
		currency = currencySymbol;
	}


	public Denomination() {
		
	}

	public boolean equals(Object obj){
		boolean toReturn = false;
		Denomination denomi = (Denomination)obj; 
		if( seedAmount == denomi.getSeedAmount() && currency.equals(denomi.currency)){
			toReturn = true;
		}
		return toReturn;
		
	}


	public double getSeedAmount() {
		return seedAmount;
	}


	public void setSeedAmount(double seedAmount) {
		this.seedAmount = seedAmount;
	}


	public String getCurrency() {
		return currency;
	}


	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	public Denomination add(Denomination denom) {
		return new Denomination(seedAmount + denom.seedAmount);// why have i used new operator???
	}
	
	public Denomination product(Denomination p1, Denomination p2){
		return new Denomination(p1.seedAmount * p2.seedAmount);
	}
	
	/*
	 * Tend to change its own value
	 * */
	public void getMultiplied(Dollar d) {
		this.seedAmount *= d.seedAmount;
	}
	
	public static Object getProduct(Dollar d1, Dollar d2) {
		return new Dollar(d1.seedAmount * d2.seedAmount);
	}
	
	public String toString(){
		StringBuffer buff = new StringBuffer();
		buff.append("seedAmount : "+ getSeedAmount()+"\n");
		buff.append("currency : "+ getCurrency());
		return buff.toString();
	}
	
	
	
}
