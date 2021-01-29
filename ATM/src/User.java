
class User extends Person{

	public User(String name) {
		super(name);
		
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
     
}
