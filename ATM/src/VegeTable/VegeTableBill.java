package VegeTable;
import java.util.*;

public class VegeTableBill {
	Employee clerk;
	ArrayList<Item> items;
	
	
	
	
	public VegeTableBill() {
		super();
	}
	public VegeTableBill(Employee clerk) {
		super();
		this.clerk = clerk;
		items=new ArrayList<>();
	}
	public void add(Item i)
	{
	items.add(i);	
	}
	public double getTotal()
	{   double amt=0;
		for(Item i:items)
		{
		   amt+=i.getPrice();
		}
		return amt;
	}
	
	
	
	public Employee getClerk() {
		return clerk;
	}
	public void setClerk(Employee clerk) {
		this.clerk = clerk;
	}
	public ArrayList<Item> getItems() {
		return items;
	}
	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}
	public void printReceipt()
	{
		
		System.out.println("Reciept \nName:"+clerk.getName());
		System.out.println(items);
		System.out.println(getTotal());
	}
	
	
}
