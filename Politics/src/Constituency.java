
public class Constituency {
	String name;
	int area;
	
	
	public Constituency() {
		super();
	}


	

	public Constituency(String name, int area) {
		super();
		this.name = name;
		this.area = area;
	}




	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getArea() {
		return area;
	}


	public void setArea(int area) {
		this.area = area;
	}




	@Override
	public String toString() {
		return "Constituency [name=" + name + ", area=" + area + "]";
	} 
	

}
