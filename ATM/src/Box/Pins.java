package Box;

public class Pins implements Join{
	static int cost=10;
    public int getCost()
    {
    	return cost;
    }
    public int getCost(String name) {
    	return getCost();
    }
}
