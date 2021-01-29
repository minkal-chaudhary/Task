package Box;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box b=new Box();
		b.setName("Universal");
		b.setTypeOfJoin(new Pins());
		b.setHeight(1);
		b.setLength(1);
		b.setWidth(1);
		Flute f=new Flute();
		f.setName("A");
		f.setGSM(10);
		b.setFlute(f);
		b.setMultiplyingFactor(3);
		System.out.println(b.getArea());
		System.out.println(b.getTotalGSM());
		System.out.println(b.getStichingCost());
		System.out.println(b.getManufacturingCost());
	}

}
