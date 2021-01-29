
public class Minister extends MP {
    String name;
	int spendingLimit=70000;
	Driver driver;
	Car car;
	
	
	@Override
	public String toString() {
		return "Minister [name=" + name + ", spendingLimit=" + spendingLimit + ", driver=" + driver + ", car=" + car
				+ "]";
	}
	public Minister() {
		super();
	}
	public Minister(String name, Driver driver, Car car) {
		super();
		this.name = name;
		
		this.driver = driver;
		this.car = car;
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
	public Driver getDriver() {
		return driver;
	}
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	
	
}
