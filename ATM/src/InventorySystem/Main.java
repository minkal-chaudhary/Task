package InventorySystem;

public class Main {
 
	public static void main(String [] args)
	{
		WoodChair woodChair=new WoodChair("Wood1 Chair");
		woodChair.getName();
		System.out.println("Is Child Safe : "+woodChair.isChildSafe());
		Shopkeeper shopkeeper=new Shopkeeper();
		shopkeeper.addItemInInventary(woodChair);
		System.out.println(shopkeeper);
	}
	
	
}
