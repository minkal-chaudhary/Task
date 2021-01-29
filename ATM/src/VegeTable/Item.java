package VegeTable;

public class Item{

	boolean isDiscount;
	String name;
	double price;
	double discount;
	
	
	public Item() {
		super();
	}
	

	public Item(String name, double price, double discount) {
		super();
		this.name = name;
		this.price = price;
		this.discount = discount;
	}


	public Item(boolean isDiscount) {
		super();
		this.isDiscount = isDiscount;
	}
	
	public boolean isDiscount() {
		return isDiscount;
	}

	public void setDiscount(boolean isDiscount) {
		this.isDiscount = isDiscount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "Item [isDiscount=" + isDiscount + ", name=" + name + ", price=" + price + ", discount=" + discount
				+ "]";
	}
	
	
}
