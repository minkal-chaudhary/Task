
public class Driver {
	
	String name;
	boolean canDrive;
	
	public Driver() {
		super();
	}
	public Driver(String name, boolean canDrive) {
		super();
		this.name = name;
		this.canDrive = canDrive;
	}
	@Override
	public String toString() {
		return "Driver [name=" + name + ", canDrive=" + canDrive + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isCanDrive() {
		return canDrive;
	}
	public void setCanDrive(boolean canDrive) {
		this.canDrive = canDrive;
	}

}
