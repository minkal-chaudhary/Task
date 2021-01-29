import java.util.*;
public class PM extends Minister{
	
	String name;
	int spendingLimit=170000;
	ArrayList<Car> al=new ArrayList<Car>();
	
	
	public PM(String name, ArrayList<Car> al) {
		super();
		this.name = name;
		
		this.al = al;
	}
	@Override
	public String toString() {
		return "PM [name=" + name + ", spendingLimit=" + spendingLimit + ", al=" + al + "]";
	}
	public void addCar(Car c)
	{
		if(al.size()==5)
		{
			System.out.println("PM cant have more than 5 cars");
		}else 
		{
			al.add(c);
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSpendingLimit() {
		return spendingLimit;
	}
	public void setSpendingLimit(int spendingLimit) {
		this.spendingLimit = spendingLimit;
	}
	public ArrayList<Car> getAl() {
		return al;
	}
	public void setAl(ArrayList<Car> al) {
		this.al = al;
	}
	

}
