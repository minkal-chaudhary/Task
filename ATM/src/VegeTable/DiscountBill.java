package VegeTable;

import java.util.ArrayList;

public class DiscountBill extends VegeTableBill{
	boolean preferred;
    
	public DiscountBill(Employee clerk, boolean preferred)
	{
		super(clerk);
	}
	
	public void prepareDiscountBillOfVegetableBill(ArrayList<Item> al)
	{
		items=al;
	}
			
	
	public int getDiscountCount()
	{
	int count=0;
	for (Item i :items) 
	{   
		if(i.isDiscount())
			count++;
			
	}
	return count;
	}
	public double getDiscountAmount()
	{
		double amt=0;
		for(Item i:items)
		{
		    if(i.isDiscount())
			{
				amt+=i.getPrice()-i.getDiscount();
				
			}else
			{
				amt+=i.getPrice();
			}
						
		}
		return amt;
	}
	public double getDiscountPercent()
	{
		double dAmt=getDiscountAmount();
		double aAmt=getTotal();
		return ((aAmt-dAmt)/aAmt)*100;
	}
	
	@Override
	public String toString() {
		return "DiscountBill [preferred=" + preferred + "]";
	}
	
	
}
