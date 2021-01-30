package InventorySystem;

public class SteelChair extends Item implements Furniture{

	
	
	
	public SteelChair(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public boolean isChildSafe()
	{
		return true;
	}
}
