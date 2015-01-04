
public class Money implements Expression{
	protected int amount;
	protected String currency;

	public Money(int i, String curr) {
		amount = i;
		currency = curr;
	}
	public boolean equals(Object object) {
		Money money= (Money) object;
		return amount == money.amount && getClass().equals(money.getClass()) && currency().equals(money.currency());
	}
	public Expression times(int multiplier) {
		return new Money(amount * multiplier, currency);
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	static Money dollar(int amount) {
		return new Money(amount , "USD");
	}
	static Money franc(int i) {
		return new Money(i, "CHF");
	}

	String currency() {
		return currency;
	}
	public String toString() {
		return amount + " " + currency;
	}
	public Expression plus(Expression addend) {
		return new Sum(this, addend);
	}
	/*
	 * ???
	 * */
	public Money reduce(Bank bank ,String to) {
		int rate = bank.rate(currency, to);
		return new Money(amount / rate, to);
	}
}
