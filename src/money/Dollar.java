package money;
public class Dollar{
	
	public double baseValue;// made it public explicitly, to see why it must be private??
	//public String currency ;// lets first move this to common class then will introduce its currency symbol.  
	public Dollar(){
		
	}
	public Dollar(String sParam){
		baseValue = Double.parseDouble(sParam);
	}
	public Dollar(double d){
		baseValue = d;
	}
	/*@Override
	public boolean equals(Object dollar){
		return baseValue == ((Dollar)dollar).baseValue;
	}*/
	
	@Override
	public boolean equals(Object pound){
		return baseValue == ((Pound)pound).getBaseAmount(); // Stuck in baseAmount VS baseValue, going to sync in next iteration.
	}
	
	public String toString(){
		return baseValue+"";
	}
	public Dollar add(Dollar dollar2) {
		return new Dollar(baseValue + dollar2.baseValue);// why have i used new operator???
	}
	/*
	 * Tend to change its own value
	 * */
	public void getMultiplied(Dollar d) {
		this.baseValue *= d.baseValue;
	}
	
	public Dollar product(Dollar d1, Dollar d2){
		return new Dollar(d1.baseValue * d2.baseValue);
	}
	public static Object getProduct(Dollar d1, Dollar d2) {
		return new Dollar(d1.baseValue * d2.baseValue);
	}

}
