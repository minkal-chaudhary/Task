package Box;

import java.util.HashMap;

public class Flute {
	String name;
	int GSM;
	int extraGsm;
	
	HashMap<String,Integer> hm;
	
	
	
	public Flute() {
		hm=new HashMap<>();
		hm.put("A",10);
		hm.put("B",30);
		hm.put("C",20);
		hm.put("G",20);
		hm.put("E",40);
		hm.put("F",50);
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGSM() {
		return GSM;
	}
	public void setGSM(int gSM) {
		GSM = gSM;
	}
	public int getExtraGsm() {
		return hm.get(name);
	}
	public void setExtraGsm(int extraGsm) {
		this.extraGsm = extraGsm;
	}
	
	

}
