
public class Car {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Car(String name) {
		super();
		this.name = name;
	}

	public Car() {
		super();
	}

	@Override
	public String toString() {
		return "Car [name=" + name + "]";
	}
	

}
