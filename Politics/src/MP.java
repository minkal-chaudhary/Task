
public class MP{

	String name;
Constituency place;
int spendingLimit=50000;

public MP() {
	super();
}

public MP(String name, Constituency place) {
	super();
	this.name = name;
	this.place = place;

}

@Override
public String toString() {
	return "MP [name=" + name + ", place=" + place + ", spendingLimit=" + spendingLimit + "]";
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Constituency getPlace() {
	return place;
}

public void setPlace(Constituency place) {
	this.place = place;
}

public int getSpendingLimit() {
	return spendingLimit;
}

public void setSpendingLimit(int spendingLimit) {
	this.spendingLimit = spendingLimit;
}


}
