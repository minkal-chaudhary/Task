package Box;
import java.util.*;

public class Pasting implements Join{
	HashMap<String,Integer> hm;
	
    public Pasting() {
		super();
		hm=new HashMap<>();
		hm.put("Universal",20);
		hm.put("AllFlapMeeting",30);
		hm.put("HoneyComb",40);
		hm.put("ReverseTuckIn",40);
		hm.put("TopOpening SnapLock",50);
	}

	public int getCost(String name)
    {
    	return hm.get(name);
    }

}
