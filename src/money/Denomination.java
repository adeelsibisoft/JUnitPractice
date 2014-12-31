package money;

public abstract class Denomination {
	protected double baseAmount;// Introducing duplication
	protected double baseValue;// Introducing duplication
	
	@Override
	public boolean equals(Object obj){
		return false;// fake
	}
}
