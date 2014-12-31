package money;

public class Pound {
	
	private double baseAmount;
	
	Pound(){}
	Pound(String p){
		baseAmount = Double.parseDouble(p);
	}
	
	Pound(Double p){
		baseAmount = p;
	}
	
	public String toString(){
		return baseAmount+"";
	}
	
	public boolean equals(Object obj){
		return baseAmount == ((Dollar)obj).baseValue;
	}

	public double getBaseAmount() {
		return baseAmount;
	}

	public void setBaseAmount(double baseAmount) {
		this.baseAmount = baseAmount;
	}
	public Pound add(Pound p) {
		return new Pound(baseAmount + p.baseAmount);
	}
	
	public Pound product(Pound p1, Pound p2){
		return new Pound(p1.baseAmount * p2.baseAmount);
	}
	
	

}
