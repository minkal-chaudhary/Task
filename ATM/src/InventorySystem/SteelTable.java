package InventorySystem;

public class SteelTable extends Item implements Furniture{

	
	
	public SteelTable(String name) {
		super(name);
		
	}

	public boolean isChildSafe()
	{
		return true;
	}
}
