package InventorySystem;

public class WoodChair extends Item implements Furniture{
    
	
	
	
	public WoodChair(String s) {
		super(s);
		
	}

	public boolean isChildSafe()
	{
		return true;
	}
	
}
