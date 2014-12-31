package money;
public class Dollar {
	
	public double baseValue;
	
	public Dollar(){
		
	}
	public Dollar(String sParam){
		this.baseValue = Double.parseDouble(sParam);
	}
	public Dollar(double d){
		baseValue = d;
	}
	@Override
	public boolean equals(Object dollar){
		return baseValue == ((Dollar)dollar).baseValue;
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
