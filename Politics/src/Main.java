import java.util.*;

public class Main {

	public static void main(String [] args)
	{
		Driver driver=new Driver("Ram",true);
		Constituency ct1=new Constituency("Varanasi",1500);
		Constituency ct2=new Constituency("mathura",2500);
		Car c1=new Car("BMW1");
		Car c2=new Car("BMW2");
		MP Kripanath=new MP("Kripanath Mallah",ct1);
		MP Rajdeep=new MP("Rajdeep Roy",ct2);
		
		Minister Badruddin=new Minister("Badruddin Ajmal",driver,c1);
		
		ArrayList<Car> al=new ArrayList<>();
		al.add(c1);
		
		PM modi=new PM("Narendra Modi",al);
		modi.addCar(c1);
		modi.addCar(c2);
		modi.addCar(c1);
		modi.addCar(c2);
		modi.addCar(c1);
		
		System.out.println(modi);
		System.out.println();
		
		System.out.println(Badruddin);
		System.out.println();
		
		System.out.println(Rajdeep);
		System.out.println();
		
		System.out.println(driver);
		System.out.println();
		
		System.out.println(c1);
		
				
	}
}
