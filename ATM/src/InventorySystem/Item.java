package InventorySystem;

public class Item {

	String name;

	public Item(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + "]";
	}
	
	
	
}
