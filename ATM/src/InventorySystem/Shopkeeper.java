package InventorySystem;
import java.util.*;
public class Shopkeeper {

	List<Item> items;

	public Shopkeeper() {
		super();
		this.items = new ArrayList<>();
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public void addItemInInventary(Item i)
	{
		items.add(i);
	}
	@Override
	public String toString() {
		return "Shopkeeper [items=" + items + "]";
	}
	
	
	
}
