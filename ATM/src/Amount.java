
public class Amount {

	int amount;

	public Amount(int amount) {
		super();
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Amount [amount=" + amount + "]";
	}
	
	
}
