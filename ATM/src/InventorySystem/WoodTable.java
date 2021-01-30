package InventorySystem;

public class WoodTable extends Item implements Furniture {

	
	
	public WoodTable(String name) {
		super(name);
		
	}

	public boolean isChildSafe()
	{
		return true;
	}
}
