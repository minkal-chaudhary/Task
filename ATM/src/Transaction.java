
public class Transaction {
	int amount;
    String type;
    
	public Transaction(int amount, String type) {
		super();
		this.amount = amount;
		this.type = type;
	}
	@Override
	public String toString() {
		return "Transaction [amount=" + amount + ", type=" + type + "]";
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	

}
