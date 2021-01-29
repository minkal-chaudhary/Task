package Box;

public class Box{
String name;	
int length;
int width;
int height;
Flute flute;
Join TypeOfJoin;
int multiplyingFactor=1;

public Box() {
	
}

public double getTotalGSM()
{
	return flute.getGSM()*100+flute.getExtraGsm();
}
public double getArea()
{
	return length*width*height;
}

public double getManufacturingCost()
{
	return getArea()*getTotalGSM()*flute.getExtraGsm()*getStichingCost()*getMultiplyingFactor();
}

public double getStichingCost() {
	
	return TypeOfJoin.getCost(name);
}

public String getName() {
	return name;
}

public int getMultiplyingFactor() {
	return multiplyingFactor;
}

public void setMultiplyingFactor(int multiplyingFactor) {
	this.multiplyingFactor = multiplyingFactor;
}

public void setName(String name) {
	this.name = name;
}

public int getLength() {
	return length;
}

public void setLength(int length) {
	this.length = length;
}

public int getWidth() {
	return width;
}

public void setWidth(int width) {
	this.width = width;
}

public int getHeight() {
	return height;
}

public void setHeight(int height) {
	this.height = height;
}

public Flute getFlute() {
	return flute;
}

public void setFlute(Flute flute) {
	this.flute = flute;
}

public Join getTypeOfJoin() {
	return TypeOfJoin;
}

public void setTypeOfJoin(Join typeOfJoin) {
	TypeOfJoin = typeOfJoin;
}


	
}
